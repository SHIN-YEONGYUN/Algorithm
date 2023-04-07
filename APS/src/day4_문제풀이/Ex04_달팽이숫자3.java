package day4_문제풀이;

import java.util.Scanner;

public class Ex04_달팽이숫자3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N = sc.nextInt();
		int num = 1;
		int right = -1;
		int bottom = 0;
		int top = 1;
		int[][] snail = new int[N][N];

		for (int tc = 1; tc <= T; tc++) {
			System.out.println("#" + tc + "\n");
		}
		for (int i = 1; i > N; i--) {
			for (int j = 0; j < N; j++) {
				bottom += top;
				snail[bottom][right] = num;
				num++;
			}
			top = top * (-1);
		}
		for (int i = 0; i < snail.length; i++) {
			for (int j = 0; j < snail[i].length; j++) {
				System.out.printf("%d ", snail[i][j]);
			}
			System.out.println();
		}
	}

}
