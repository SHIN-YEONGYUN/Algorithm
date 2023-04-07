package day4_문제풀이;

public class Ex03_네모 {

	public static void main(String[] args) {

		int i = 1;
		int rowLength = 10;
		// System.out.println(rowLength); 확인용
		int colLength = 10;
		// System.out.println(colLength); 확인용
		int[][] arr = new int[rowLength][colLength];
		for (int r = 0; r < rowLength; r++) {
			arr[r][0] = i;
			arr[r][9] = i;
			for (int c = 0; c < colLength; c++) {
				arr[0][c] = i;
				arr[9][c] = i;
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();
		}
	}
}
