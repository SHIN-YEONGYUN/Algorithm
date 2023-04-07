package day4_이론;

import java.util.Arrays;

public class Ex01_카운팅정렬 {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 20, 1 }; // 기존 배열
		int[] sorted = new int[arr.length]; // 정렬된 배열을 넣을 주소

		// 최대값 찾기
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		// System.out.println(max); // 최대값 출력 
		int[] counts = new int[max + 1];

		// 개수 세기
		for (int i = 1; i < arr.length; i++) {
			counts[arr[i]]++;
		} // end for : 카운팅 완료
			// System.out.println(Arrays.toString(counts)); - 배열 개수 카운팅 출력

		// 누적합
		for (int i = 1; i <= max; i++) {
			// counts[i] = counts[i-1]+counts[i];
			counts[i] += counts[i - 1];
		} // end for : 누적합 구하기 완료

		// 원래 배열(arr)을 거꾸로 돌면서, 해당 값의 누적합 - 1한 부분을 sorted라는 새로운 배열에 넣기
		for (int i = arr.length - 1; i >= 0; i--) {
			sorted[counts[arr[i]] - 1] = arr[i];
			counts[arr[i]]--;
		} // end
		System.out.println(Arrays.toString(sorted)); // 최종 카운팅 정렬 출력
	}

}
