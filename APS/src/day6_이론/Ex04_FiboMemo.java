package day6_이론;

public class Ex04_FiboMemo {
	static int[] memo;

	public static void main(String[] args) {
		int N = 10;
		memo = new int[11]; // 1번 인덱스 1번 값 저장..
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(FiboMemo(8));
	}

	static int FiboMemo(int num) {
//base case 작성, num을 가지고 끝낼 수 있는 조건을 작성
		if (num >= 2 && memo[num] == 0) {
			memo[num] = FiboMemo(num - 1) + FiboMemo(num - 2);
		}
		// 한줄? if(num <=1) return num;

		// recursive case : 자기 자신을 호출하는 부분
		// 해당 함수가, int형을 반환하기 때문에
		// return 안에 자기 자신을 부른 함수의 결과값을 합해서
		// 최종적으로 반환
		return memo[num];
	}
}
