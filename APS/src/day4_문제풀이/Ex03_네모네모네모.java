package day4_문제풀이;

public class Ex03_네모네모네모 {

	public static void main(String[] args) {
		int i = 1;
		int rowLength = 10;
		// System.out.println(rowLength); 확인용
		int colLength = 10;
		// System.out.println(colLength); 확인용
		int[][] arr = new int[rowLength][colLength];
		for (int r = 0; r < rowLength; r++) {
			for (int c = 0; c < colLength; c++) {
				if (r == 0 || r == rowLength - 1 || c == 0 || c == colLength - 1) {
					arr[r][c] = i;
				} else if (r == 1 || r == rowLength - 2 || c == 1 || c == colLength - 2) {
					arr[r][c] = i + 1;
				} else if (r == 2 || r == rowLength - 3 || c == 2 || c == colLength - 3) {
					arr[r][c] = i + 2;
				} else if (r == 3 || r == rowLength - 4 || c == 3 || c == colLength - 4) {
					arr[r][c] = i + 3;
				} else
					arr[r][c] = i + 4;
				System.out.printf("%d ", arr[r][c]);
			}
			System.out.println();
		}
	}

}