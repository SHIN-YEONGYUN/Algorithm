package day2_이론;

import java.util.Arrays;

public class Ex03_SelectionSort {

	/*
	 * static void selectionSort(int[] arr, int N) { for (int i = 0; i < N - 1; i++)
	 * { int minIdx = i; for (int j = i + 1; j < N; j++) { if (arr[minIdx] > arr[j])
	 * { minIdx = j; } } } }
	 */

	public static void main(String[] args) {

		int[] arr = { 40, 2, 76, 23, 39 };

		int N = arr.length;

		// selectionSort(arr, N);

		for (int i = 0; i < N - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < N; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}

		System.out.println(Arrays.toString(arr));

	}

}
