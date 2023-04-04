package day2_문제풀이;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int in[] = new int[10];

		for (int tc = 1; tc <= T; tc++) {
			for (int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				if (num % 2 == 1) {
					in[tc] = in[tc] + num;
				}
			}
			System.out.println("#" + tc + " " + in[tc]);
		}
	}
}
