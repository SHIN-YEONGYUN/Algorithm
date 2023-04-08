package Codeup;

import java.util.Scanner;

public class Ex10_두주사위의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 주사위를 굴려 나오는 합 k
		int k = sc.nextInt();
		int dice = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				dice = i + j;
				if (dice == k) {
					System.out.printf("%d %d\n", i, j);
				}

			}
		}

	}
}
