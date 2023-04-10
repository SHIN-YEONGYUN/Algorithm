package day5_문제풀이;

import java.util.Scanner;

public class Ex01_문자열제거하기추가문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String AString = sc.next();
		String BString = sc.next();

		// B index
		int BIndex = 0;
		String result = "";
		// A 반복문
		for (int i = 0; i < AString.length(); i++) {
			// 매칭 되는지 확인 (BIndex와)
			if (BIndex < BString.length() && BString.charAt(BIndex) == AString.charAt(i)) {
				BIndex++;
			} else { // 매칭 안됨
				result += AString.charAt(i);
			}
		}
		System.out.println(result);

	}
}
