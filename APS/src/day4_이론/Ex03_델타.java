package day4_이론;

import java.util.Arrays;

public class Ex03_델타 {

	public static void main(String[] args) {
		// 이차원 배열을 2중 for문으로 만들기

		int i = 0;
		int rowLen = 6;
		int colLen = 5;
		int[][] arr = new int[rowLen][colLen];
		for (int r = 0; r < rowLen; r++) {
			for (int c = 0; c < colLen; c++) {
				arr[r][c] = i++;
			} // end for 열 입력 완료
			System.out.println(Arrays.toString(arr[r]));
		} // end for 행 입력 완료
			// 위 아래 오 왼
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };

		// 1. 4방향 반복문 돌려보고 에러 내보기
		// 2. 에러 나면 조건문 넣어서 배열범위 밖을 어떻게 해야할지
		// 3. 특정값 이상의 원소들만 출력해보기

		// cf) 행,열 위치 설정

	}

}
