package day1_문제풀이;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] a = new int[N];
			int[] b = new int[N];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < N; i++) {
				b[i] = sc.nextInt();
			}
			for (int i = 0; i< N; i++) {
				K -= a[i] * b[i];
			}
			if (K >= 0) {
				System.out.println("#" + tc + " " + K);
			} else {
				System.out.println("#" + tc + " " + -1);
			}
		}
	}
}
