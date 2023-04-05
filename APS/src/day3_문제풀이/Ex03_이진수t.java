package day3_문제풀이;

import java.util.Scanner;

public class Ex03_이진수t {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int man = (1 << N) - 1;

			if ((M & man) == man) {
				System.out.println("#" + tc + " " + "ON");
			} else {
				System.out.println("#" + tc + " " + "OFF");
			}
		}

	}

}
