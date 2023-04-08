package Codeup;

import java.util.Scanner;

public class Ex04_1부터n까지짝수의합구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("%d", sum);
	}
}
