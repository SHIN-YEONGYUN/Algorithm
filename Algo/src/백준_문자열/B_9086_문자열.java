package 백준_문자열;

import java.util.Scanner;

public class B_9086_문자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			String S = sc.next();
			System.out.print(S.charAt(0));
			System.out.println(S.charAt(S.length() - 1));
		}

	}
}
