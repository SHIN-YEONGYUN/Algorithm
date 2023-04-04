package day2_이론;

import java.util.Scanner;

public class Ex02_BubbleSort {

	static void BubbleSort(int[] arr, int N) {
		for (int i = N - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		for(int i =0; i < nx; i++) {
			System.out.println("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		BubbleSort(x,nx);
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"] : " + x[i]);
		}
	}
}
