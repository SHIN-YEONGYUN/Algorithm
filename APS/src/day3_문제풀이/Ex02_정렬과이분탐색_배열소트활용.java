package day3_문제풀이;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_정렬과이분탐색_배열소트활용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[N];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int ans = binSearch(arr, K);
			System.out.println("#" + tc + " " + ans);

		}
	}

	private static int binSearch(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		int ai = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (k == arr[mid]) {
				ai = ai + 1;
				for (int i = mid - 1; i >= 0; i--) {
					if (arr[i] == k) {
						ai = ai + 1;
					} else break;
				}
				for (int i = mid + 1; i < arr.length; i++) {
					if (arr[i] == k) {
						ai = ai + 1;
					} else break;
				}
				return ai;
			} else if (k < arr[mid]) high = mid - 1;
			else if (k > arr[mid]) low = mid + 1;
		}
		if (ai <= 0) ai = -1;
		
		return ai;
	}
}
