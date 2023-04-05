package day3_이론;

public class Ex01_순차검색_정렬_함수활용 {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 8, 9, 10, 17 }; // length = 7

		int ans = sortedSequentialSeartch(arr, 10);
		
		System.out.println("함수 결과 : " + ans);

	}

	private static int sortedSequentialSeartch(int[] arr, int key) {

		// 이제 특정 key 값을 찾는 알고리즘을 만들자

		// 배열 순회를 위해 1차 반복문을 사용할 예정
		// 순회하다가 키값을 찾으면 끝
		// 아니면 -1을 반환
		int ans = -1; // 정답 index를 담을 변수

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("현재 인덱스 %d 배열의 값 : %d\n", i, arr[i]);
			// 배열을 순회하면서 키값이랑 같은 경우를 찾은 경우
			if (arr[i] == key) {
				return i;
			}
			// 정렬된 상황, 내가 찾고자 하는 key값 보다 배열의 원소가 크다.
			if (key < arr[i]) {
				return -1;
			}

		}
		return -1;
	}

}
