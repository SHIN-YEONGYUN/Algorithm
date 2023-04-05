package day3_문제풀이;

import java.util.Scanner;

public class Ex03_이진수표현 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			String oo = "";
			for (int i = 1; i <= N; i++) {
				oo = oo + 1;
			}
			String ans = (Integer.toBinaryString(M).endsWith(oo) ? "ON" : "OFF");
			System.out.println("#" + tc + " " + ans);
		}
	}
}
