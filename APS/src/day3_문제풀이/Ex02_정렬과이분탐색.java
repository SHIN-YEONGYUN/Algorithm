package day3_문제풀이;

import java.util.Scanner;

public class Ex02_정렬과이분탐색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();

			int[] arr = new int[N];
			int ai = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();

				if (arr[i] == K) ai = ai + 1;
			}
			if (ai == 0) ai = -1;
			System.out.println("#" + tc + " " + ai);
		}
	}
}