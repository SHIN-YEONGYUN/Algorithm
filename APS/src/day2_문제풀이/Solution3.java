package day2_문제풀이;

import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			int max = 0;
			int min = 1000;
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if (num > max)
					max = num;
				if (num < min)
					min = num;
				sum += num;

			}
			System.out.printf("#%d %d\n", tc, Math.round((sum - max - min) / 8.0));
		}
	}

}
