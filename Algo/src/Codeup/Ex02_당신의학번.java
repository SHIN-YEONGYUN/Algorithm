package Codeup;

import java.util.Scanner;

public class Ex02_당신의학번 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (A > 3 || B > 20 || C > 999) {
			System.out.println("입력 범위 초과");
		}
		System.out.printf("%d%02d%03d", A, B, C);

	}

}
