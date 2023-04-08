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
		if (temp <= arr[0]) {
			temp = arr[0];
		}
		if (temp <= arr[1]) {
			temp = arr[1];
		}
		if (temp <= arr[2]) {
			temp = arr[2];
		}
		System.out.printf("%d %d %d\n" + temp, temp, temp);

	}
}
