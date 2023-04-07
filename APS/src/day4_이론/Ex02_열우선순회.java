package day4_이론;

public class Ex02_열우선순회 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int rowLength = arr.length;
		System.out.println(rowLength);
		int colLength = arr[0].length;
		System.out.println(colLength);

		// 열 우선 순회
		for (int c = 0; c < colLength; c++) {
			// 홀수번째 열은 제외할 경우
			// 방법 1 = c+=2
			// if (c % 2 == 1) continue;
			for (int r = 0; r < rowLength; r++) {
				System.out.printf("%3d", arr[r][c]);
			}
			System.out.println();
		}

	}

}
