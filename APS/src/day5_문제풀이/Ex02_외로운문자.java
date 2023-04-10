package day5_문제풀이;

import java.util.Scanner;

public class Ex02_외로운문자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int[] arr = new int[26];
			for (int i = 0; i < str.length(); i++) {
				arr[str.charAt(i) - 'a']++;
			}
			String empty = "";
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % 2 != 0)
					empty += (char)(i + 'a');
			}
			if (empty.length() == 0)
				empty = "Good";
			System.out.println("#" + tc + " " + empty);
		}
	}
}
