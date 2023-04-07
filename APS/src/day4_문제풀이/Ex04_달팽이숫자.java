package day4_문제풀이;

import java.util.Scanner;

public class Ex04_달팽이숫자 {

	static int num, r, c;
	static String direction;
	static int ar, ac;
	static int arr[][];

	static void turn() {
		switch (direction) {
		case "right":
			direction = "down";
			return;
		case "down":
			direction = "left";
			return;
		case "left":
			direction = "up";
			return;
		case "up":
			direction = "right";
			return;
		}
	}

	static void move(int N) {
		for (int i = 0; i < N; i++) {
			num++;
			switch (direction) {
			case "right":
				c++;
				break;
			case "down":
				r++;
				break;
			case "left":
				c--;
				break;
			case "up":
				r--;
				break;
			}
			arr[r][c] = num;
		}
	}

	public static void main(String args[]) {
		arr = new int[12][12];
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			direction = "right";
			r = 0;
			c = 0;
			num = 1;
			arr[0][0] = 1;
			move(N - 1);
			for (int i = N - 1; i > 0; i--) {
				turn();
				move(i);
				turn();
				move(i);
			}
			System.out.printf("#%d\n", tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%d ", arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}