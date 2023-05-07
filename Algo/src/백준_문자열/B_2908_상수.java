package 백준_문자열;

import java.util.Scanner;

public class B_2908_상수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		String reverse = "";
		String reverse2 = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			reverse = reverse + A.charAt(i);
		}
		for (int i = B.length() - 1; i >= 0; i--) {
			reverse2 = reverse2 + B.charAt(i);
		}

		if (Integer.parseInt(reverse) > Integer.parseInt(reverse2)) {
			System.out.println(reverse);
		} else
			System.out.println(reverse2);

	}
}
