package Codeup;

import java.util.Scanner;

public class Ex05_최댓값구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int max = 0;

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
