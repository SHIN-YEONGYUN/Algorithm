package day6_이론;

public class Ex04_Fibo {
	public static void main(String[] args) {
		System.out.println(Fibo(12));
	}

	static int Fibo(int num) {
//base case 작성, num을 가지고 끝낼 수 있는 조건을 작성
		if (num == 1)
			return 1;
		if (num == 0)
			return 0;
		// 한줄? if(num <=1) return num;

		// recursive case : 자기 자신을 호출하는 부분
		// 해당 함수가, int형을 반환하기 때문에
		// return 안에 자기 자신을 부른 함수의 결과값을 합해서
		// 최종적으로 반환
		return Fibo(num - 1) + Fibo(num - 2);
	}
}
