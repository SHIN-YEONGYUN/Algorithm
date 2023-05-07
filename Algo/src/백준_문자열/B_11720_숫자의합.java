package 백준_문자열;

import java.util.Scanner;

public class B_11720_숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += s.charAt(i) - 48;
		}
		System.out.print(sum);

	}
}
