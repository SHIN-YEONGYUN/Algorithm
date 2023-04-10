package day5_문제풀이;

import java.util.Scanner;

public class Ex01_문자열제거하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String A = sc.next();
			String B = sc.next();

			for (int i = 0; i < B.length(); i++) {
				String empty = "";
				for (int j = 0; j < A.length(); j++) {
					if (B.charAt(i) != A.charAt(j))
						empty += A.charAt(j);
				}
				A = empty;
			}
			if (A.length() == 0)
				A = "-1";
			System.out.println("#" + tc + " " + A);
		}
	}
}
