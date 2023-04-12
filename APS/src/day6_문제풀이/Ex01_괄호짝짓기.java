package day6_문제풀이;

import java.util.Scanner;
import java.util.Stack;

public class Ex01_괄호짝짓기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc + " " + solve(sc.next()));
		}
	}

	private static String solve(String sol) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < sol.length(); i++) {

			char c = sol.charAt(i);
			// '(' 일 경우 스택에 넣기
			if (c == '(') {
				stack.push(c);
				// '(' 없고 ')' 받아서 짝 안 맞을 경우 NO
			} else if (stack.empty()) {
				return "NO";
				// 짝 맞으면 pop
			} else
				stack.pop();
		}
		// 반복문 나와서 스택 비어있으면 YES, 남아있으면 NO
		if (stack.empty()) {
			return "YES";
		} else
			return "NO";
	}

}
