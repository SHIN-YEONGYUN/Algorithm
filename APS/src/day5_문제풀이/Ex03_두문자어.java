package day5_문제풀이;

import java.util.Scanner;

public class Ex03_두문자어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String[] str = new String[3];

			for (int i = 0; i < 3; i++) {
				String s = sc.next();
				str[i] = s.substring(0, 1).toUpperCase();
			}
			System.out.print("#" + tc + " ");
			for (int i = 0; i < 3; i++) {
				System.out.print(str[i]);
			}
			System.out.println();
		}
	}
}
