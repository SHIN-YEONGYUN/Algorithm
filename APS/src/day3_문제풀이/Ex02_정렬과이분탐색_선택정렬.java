package day3_문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_정렬과이분탐색_선택정렬 {

	public static void selection_sort(int[] arr) {
		selection_sort(arr, arr.length);
	}

	private static void selection_sort(int[] arr, int length) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIdx] > arr[j]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[N];
			selection_sort(arr, N);
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println(Arrays.toString(arr));
			boolean ans = binSearch(arr, K);
			System.out.println("#" + tc + " " + ans);

		}

	}

	private static boolean binSearch(int[] arr, int k) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (k == arr[mid]) {
				return true;
			}
			if (k < arr[mid])
				right = mid - 1;
			else if (k > arr[mid])
				left = mid + 1;
		}
		return false;
	}

}
