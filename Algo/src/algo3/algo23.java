package algo3;

import java.util.Scanner;

public class algo23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		if (A % 4 == 0 && A % 400 == 0 || A % 4 == 0 && A % 100 != 0) {
			System.out.println("1");
		} else
			System.out.println("0");
	}
}
