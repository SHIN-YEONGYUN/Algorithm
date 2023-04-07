package day4_문제풀이;

public class Ex02_지그재그만들기 {
	public static void main(String[] args) {
		int i = 1;
		int N = 10; // 배열 크기
		int row; // 행 인덱스
		int col; // 열 인덱스

		int[][] arr = new int[N][N];
		for (row = 0; row < N; row++) {
			// 홀수행 ++
			if (row % 2 == 0) {
				for (col = 0; col < N; col++) {
					arr[row][col] = i;
					i = i + 1;
				}
				// 짝수행 --
			} else {
				for (col = N - 1; col >= 0; col--) {
					arr[row][col] = i;
					i = i + 1;
				}
			}
		}
		for (row = 0; row < N; row++) {
			for (col = 0; col < N; col++)
				System.out.printf("%d ", arr[row][col]);
			System.out.println();
		}
	}
}