package day5_문제풀이;

import java.util.Scanner;

public class Ex04_알파벳숫자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		// 불변하는 값이므로 tc반복문 바깥에서 정의
		String stringAtoZ = "abcdefghijklmnopqrstuvwxyz";

		for (int tc = 1; tc <= T; tc++) {
			String str = sc.next();

			// 매칭된 숫자
			int result = 0;
			// 입력 받은 것 만큼 반복
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == stringAtoZ.charAt(i))
					result++;
				else
					break;
			}
			System.out.println("#" + tc + " " + result);
		}

	}

}