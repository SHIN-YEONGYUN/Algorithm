package Codeup;

import java.util.Scanner;

public class Ex09_1차원누적합배열만들기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			System.out.print(sum + " ");
		}

	}

}
