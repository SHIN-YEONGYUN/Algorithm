package day5_이론;

import java.util.Arrays;

public class Ex02_String {

	public static void main(String[] args) {

		// 스트링, 즉 문자열은 사용량이 매우 많아 이렇게 표현 가능
		String str = "abc";
		// 이렇게도 표현이 가능
		String str2 = new String("abc");

		System.out.println(str == str2);
		// 문자열의 값만을 비교하고 싶을 때, equals() 메소드를 사용
		System.out.println(str.equals(str2));

		// 문자열을 문자 배열로 만드는 메소드
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));

		// 문자열에서 i번째 인덱스에 어떤 문자가 있는지 반환하는 함수
		System.out.println(str.charAt(1));

	}

}
