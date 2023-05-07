package 백준_문자열;

import java.io.IOException;
import java.util.Scanner;

public class B_5622_다이얼 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int[] arr = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
		int count = 0;

		while (true) {
			int ch = System.in.read();

			if (ch < 65)
				break;

			count += arr[ch - 65];
		}
		System.out.println(count);
	}
}
