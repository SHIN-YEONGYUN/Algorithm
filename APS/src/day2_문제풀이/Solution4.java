package day2_문제풀이;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		int won[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			System.out.printf("#%d\n", tc);
			for (int i = 0; i < won.length; i++) {
				System.out.printf("%d ", n / won[i]);
				n %= won[i];
			}
			System.out.println();
		}

	}

}
