package day6_이론;

public class Ex03_재귀호출 {
	public static void main(String[] args) {
		recursivePrint(0, 4);
	}

	static void recursivePrint(int level, int end) {
		// base case(끝나는 지점)
		if (level == end) {
			System.out.println(level);
			return;
		}
		// recursive case(재귀 부분, 즉 함수가 다시 호출되는 부분)
		System.out.println(level);
		recursivePrint(level + 1, end);
		System.out.println(level);
	}
}
