package Codeup;

import java.util.Scanner;

public class Ex01_윤년판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N % 400 == 0 || N % 4 == 0 && N % 100 != 0) {
			System.out.println("Leap");
		} else
			System.out.println("Normal");
	}
}
