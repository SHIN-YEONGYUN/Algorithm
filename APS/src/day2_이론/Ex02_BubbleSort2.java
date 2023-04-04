package day2_이론;

import java.util.Arrays;

public class Ex02_BubbleSort2 {

	private static void BubbleSort(int[] arr, int N) {
		for (int i = N - 2; i >= 0; i--) {
			// j번째 인덱스에 있는 값과, j+1번째 index에 있는 값과 비교
			for (int j = 0; j <= i; i++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 20, 4, 1 }; // 배열 선언

		int N = arr.length; // 배열 크기

		// 첫 번째 for문 돌리면, 맨 마지막 원소는 정렬이 된 상태 ( 가장 큼)
		// 인덱스를 줄여가면서 하면 됨

		BubbleSort(arr, N);
		System.out.print(Arrays.toString(arr));
	}
}
