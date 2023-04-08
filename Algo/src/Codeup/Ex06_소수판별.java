package Codeup;

import java.util.Scanner;

public class Ex06_소수판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = 0;

		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				a = a + 1;

		}
		if (a == 2) {
			System.out.println("prime");

		} else
			System.out.println("not prime");

	}

}
