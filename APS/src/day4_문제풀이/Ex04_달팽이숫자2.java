package day4_문제풀이;

import java.util.Scanner;
import java.util.Arrays;

public class Ex04_달팽이숫자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			int num = 1;
			for (int k = 0; k < N / 2; k++) {
				// 왼 오
				for (int j = k; j < N - k - 1; j++) {
					arr[k][j] = num++;
				}
				// 위 아래
				for (int i = k; i < N - k - 1; i++) {
					arr[i][N - k - 1] = num++;
				}
				// 오 왼
				for (int j = N - k - 1; j > k; j--) {
					arr[N - k - 1][j] = num++;
				}
				// 아래 위
				for (int i = N - k - 1; i > k; i--) {
					arr[i][k] = num++;
				}
			}
			// 홀수 가운데
			if (N % 2 == 1) {
				arr[N / 2][N / 2] = num;
			}
			System.out.println("#" + tc);
			for (int[] a : arr) {
				for (int b : a) {
					System.out.print(b + " ");
				}
				System.out.println();
			}
		}
	}
}