package day1_문제풀이;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A < B) {
				System.out.println("#" + tc + " " + "<");
			}
			if (A == B) {
				System.out.println("#" + tc + " " + "=");
			}
			if (A > B) {
				System.out.println("#" + tc + " " + ">");
			}
		}

	}

}
