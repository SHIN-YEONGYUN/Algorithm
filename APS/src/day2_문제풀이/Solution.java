package day2_문제풀이;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[] a = new int[N];
			int[] b = new int[M];
			for (int i = 0; i < a.length; i++)
				a[i] = sc.nextInt();

			for (int i = 0; i < b.length; i++)
				b[i] = sc.nextInt();

			int max = 0;

			if (N < M) {
				for (int i = 0; i < M - N + 1; i++) {
					int result = 0;
					for (int j = 0; j < N; j++) {
						result += a[j] * b[i + j];
					}
					max = Math.max(max, result);
				}
			}
			if (N > M) {
				for (int i = 0; i < N - M + 1; i++) {
					int result = 0;
					for (int j = 0; j < M; j++) {
						result += a[i + j] * b[j];
					}
					max = Math.max(max, result);
				}
			} else {
				int result = 0;

				for (int aa = 0; aa < N; aa++) {
					result += a[aa] * b[aa];
				}
				max = Math.max(max, result);
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
