package algo2;

import java.util.Scanner;

public class algo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		System.out.printf("%d\n%d\n%d\n%d\n%d", A + B, A - B, A * B, A / B, A % B);
	}

}
