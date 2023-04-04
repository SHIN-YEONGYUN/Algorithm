package day2_문제풀이;

import java.util.Scanner;

public class Solution_1959t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 T
		int T = sc.nextInt();

		// 1부터 T까지 반복문
		for (int t = 1; t <= T; t++) {
			// 배열 A의 길이
			int N = sc.nextInt();
			// 배열 B의 길이
			int M = sc.nextInt();

			int firstArr[] = new int[N];
			int secondArr[] = new int[M];

			// 배열 입력받기
			for (int i = 0; i < N; i++) {
				firstArr[i] = sc.nextInt();
			}
			// 배열 입력받기
			for (int i = 0; i < M; i++) {
				secondArr[i] = sc.nextInt();
			}

			if (N > M) {
				// 배열 복사 first : N
				int[] tempArr = firstArr.clone();
				firstArr = secondArr.clone();
				secondArr = tempArr.clone();

				int temp = N;
				N = M;
				M = temp;
			}
			// 모두 더한 값의 최대
			int max = 0;
			for (int i = 0; i <= M - N; i++) {
				// 현재 회차의 합
				int sum = 0;
				// 배열 firstArr만큼 회전
				for (int j = 0; j < N; j++) {
					sum += firstArr[j] * secondArr[i + j];
				}
				// 최대값을 갱신한다
				if (max < sum)
					max = sum;
			}
			System.out.printf("#" + t + " ", max);

		}
		sc.close();
	}

}
