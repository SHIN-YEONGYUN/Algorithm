package algo4;

import java.util.Scanner;

public class algo40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}