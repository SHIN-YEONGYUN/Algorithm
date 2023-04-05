package day3_문제풀이;

import java.util.Scanner;

public class Ex01_지그재그숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int number = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0) {
					sum -= i;
				} else
					sum += i;
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}
