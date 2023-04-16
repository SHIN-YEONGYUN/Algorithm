package algo3;

import java.util.Scanner;

public class algo27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		int temp = 0;

		if (A == B && B == C) {
			System.out.println(10000 + (A * 1000));
		} else if (A == B || A == C || B == C) {
			if (A == B || A == C) {
				System.out.println(1000 + (A * 100));
			} else {
				System.out.println(1000 + (B * 100));
			}
		} else {
			if (A > B && A > C) {
				System.out.println(A * 100);
			} else if (B > C && B > A) {
				System.out.println(B * 100);
			} else
				System.out.println(C * 100);
		}
	}
}
