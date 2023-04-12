package day6_문제풀이;

import java.util.Scanner;

public class Ex01_괄호짝짓기Arrays {
	static int[] stack;
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String brac = sc.next();
			String re = "YES";
			stack = new int[brac.length()];
			top = -1;

			for (int i = 0; i < brac.length(); i++) {
				char j = brac.charAt(i);

				if (j == '(') {
					push();
				} else if (top == -1) {
					re = "NO";
					break;
				} else
					pop();
			}
			if (stack[0] != 0)
				re = "NO";
			System.out.println("#" + tc + " " + re);
		}
	}

	static void push() {
		if (top != stack.length - 1) {
			top++;
			stack[top] = 1;
		}
	}

	static void pop() {
		if (top != -1) {
			stack[top] = 0;
			top--;
		}
	}
}
