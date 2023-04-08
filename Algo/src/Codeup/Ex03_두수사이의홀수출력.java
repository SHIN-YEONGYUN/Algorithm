package Codeup;

import java.util.Scanner;

public class Ex03_두수사이의홀수출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
