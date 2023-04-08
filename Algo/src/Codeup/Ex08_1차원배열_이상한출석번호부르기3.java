package Codeup;

import java.util.Scanner;

public class Ex08_1차원배열_이상한출석번호부르기3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = 1000;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		System.out.print(min + " ");
	}
}
