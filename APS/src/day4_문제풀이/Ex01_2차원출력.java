package day4_문제풀이;

public class Ex01_2차원출력 {

	public static void main(String[] args) {
		int i = 1;
		int rowLength = 10;
		// System.out.println(rowLength); 확인용
		int colLength = 10;
		// System.out.println(colLength); 확인용
		int[][] arr = new int[rowLength][colLength];
		for (int r = 0; r < rowLength; r++) {
			for (int c = 0; c < colLength; c++) {
				arr[r][c] = i++;
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();
		}

	}

}
