package algo4;

import java.util.Scanner;

public class algo35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #" + tc + ": " + A + " + " + B + " = " + (A + B));
		}
	}
}
