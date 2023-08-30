package 백준_수학;

import java.util.Scanner;

public class B_1110_더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		int count = 0;
		int copy = A;

		while (true) {
			A = ((A % 10) * 10) + (((A / 10) + (A % 10)) % 10);
			count++;

			if (copy == A) {
				break;
			}
		}
		System.out.println(count);
	}

}
