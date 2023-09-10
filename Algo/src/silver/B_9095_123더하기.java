package silver;

import java.util.Scanner;

public class B_9095_123더하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[11];
		int t = sc.nextInt();

		num[1] = 1;
		num[2] = 2;
		num[3] = 4;

		for (int i = 4; i <= 10; i++) {
			num[i] = num[i - 3] + num[i - 2] + num[i - 1];
		}
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			System.out.println(num[n]);
		}
	}

}
