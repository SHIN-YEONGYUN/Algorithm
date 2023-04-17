package algo4;

import java.util.Scanner;

public class algo32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			if (i % 4 == 0) {
				System.out.print("long ");
			}
		}
		System.out.print("int");
	}
}
