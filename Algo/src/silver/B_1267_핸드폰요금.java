package silver;

import java.util.Scanner;

public class B_1267_핸드폰요금 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int time;
		int Y = 0;
		int M = 0;

		for (int i = 0; i < N; i++) {
			time = sc.nextInt();
			Y += ((time / 30) + 1) * 10;
			M += ((time / 60) + 1) * 15;
		}

		if (Y == M) {
			System.out.println("Y M " + Y);
		} else if (Y < M) {
			System.out.println("Y " + Y);
		} else if (Y > M) {
			System.out.println("M " + M);
		}

	}

}
