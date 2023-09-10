package silver;

import java.util.Scanner;

public class B_1476_날짜계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();

		int y = 0;

		while (true) {
			y++;
			if ((y - E) % 15 == 0 && (y - S) % 28 == 0 && (y - M) % 19 == 0)
				break;
		}
		System.out.print(y);
	}

}
