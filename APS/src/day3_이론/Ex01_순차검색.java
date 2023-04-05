package day3_이론;

public class Ex01_순차검색 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 8, 9, 17, 10 }; // length = 7

		// 이제 특정 key 값을 찾는 알고리즘을 만들자
		int key = 3;

		// 배열 순회를 위해 1차 반복문을 사용할 예정
		// 순회하다가 키값을 찾으면 끝
		// 아니면 -1을 반환
		int ans = -1; // 정답 index를 담을 변수

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("현재 인덱스 %d 배열의 값 : %d\n", i, arr[i]);
			// 배열을 순회하면서 키값이랑 같은 경우를 찾은 경우
			if (arr[i] == key) {
				ans = i;
				break;
			}
//			// 정렬된 상황, 내가 찾고자 하는 key값 보다 배열의 원소가 크다.
//			if (key < arr[i]) {
//				break;
//			}

		}
		System.out.println(ans);
	}

}

// sequentialSearch 메소드 함수 이용해서 작성해보기

