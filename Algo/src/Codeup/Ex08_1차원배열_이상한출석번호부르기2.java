package Codeup;

import java.util.Scanner;

public class Ex08_1차원배열_이상한출석번호부르기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print((arr[i]) + " ");

		}

	}
}
