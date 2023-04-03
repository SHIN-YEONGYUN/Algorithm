package day1_문제풀이;

import java.util.Scanner;

public class Solution5 {
	static int[] count = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();
			int year = Integer.parseInt(input.substring(0, 4));
			int month = Integer.parseInt(input.substring(4, 6));
			int day = Integer.parseInt(input.substring(6, 8));

			if (month > 0 && month < 13 && day <= count[month]) {

				if (year < 1000) {
					if (month < 10 && day < 10) {
						System.out.println("#" + tc + " 0" + year + "/0" + month + "/0" + day);
					} else if (month < 10) {
						System.out.println("#" + tc + " 0" + year + "/0" + month + "/" + day);
					}
				} else if (month < 10) {
					System.out.println("#" + tc + " " + year + "/0" + month + "/" + day);
				} else
					System.out.println("#" + tc + " " + year + "/" + month + "/" + day);
			} else
				System.out.println("#" + tc + " " + -1);
		}
	}
}
