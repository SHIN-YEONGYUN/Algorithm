package day5_이론;

import java.util.Arrays;

public class Ex01_문자열 {
	public static void main(String[] args) {
		// 자바에서는 문자를 처리할 때, char 형 사용
		char ex = 'a';
		char A = 'A';
		char zero = '0';

		// 문자열이 그대로 출력된다
		System.out.println(ex);

		// 어떤 숫자로 저장 되는지 알고싶을 때
		System.out.println((int) ex); // 'a' 97 ~
		System.out.println((int) A); // 'A' 65 ~
		System.out.println((int) zero); // '0' 48 ~

		// abcd라는 문자열이 주어졌을 때 (소문자만)
		// 배열을 활용해서 개수를 세는 법
		String input = "abcdcaaa";
		int[] counts = new int[26];
		for (int i = 0; i < input.length(); i++) {
			counts[input.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(counts));
	}
}
