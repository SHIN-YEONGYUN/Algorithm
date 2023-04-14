package algo;

import java.util.Scanner;

public class algo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();

		int Bin = 0;
		String result = "";

		for (int i = 0; i < A.length(); i++) {
			if (Bin < B.length() && B.charAt(Bin) == A.charAt(i)) {
				Bin++;
			} else
				result += A.charAt(i);
		}
		System.out.println(result);
	}
}
