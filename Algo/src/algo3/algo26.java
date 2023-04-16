package algo3;

import java.util.Scanner;

public class algo26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		A += C / 60;
		B += C % 60;

		if (B >= 60) {
			A++;
			B -= 60;
		}
		if (A >= 24) {
			A -= 24;
		}
		System.out.println(A + " " + B);
	}

}
