package algo4;

import java.util.Scanner;

public class algo31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int X = sc.nextInt(); // 영수증에 적힌 총 금액
		int N = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt(); // 각 물건의 가격
			int b = sc.nextInt(); // 각 물건의 개수
			sum += a * b;

		}
			if (X == sum) {
				System.out.println("Yes");
			} else
				System.out.println("No");

	}
}
