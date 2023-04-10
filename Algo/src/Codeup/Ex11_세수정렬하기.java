package Codeup;

import java.util.Scanner;

public class Ex11_세수정렬하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[temp]) {
					temp = j;
				}
			}
			int oo = arr[temp];
			arr[temp] = arr[i];
			arr[i] = oo;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
