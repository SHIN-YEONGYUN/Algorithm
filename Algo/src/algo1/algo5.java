package algo1;

import java.util.Scanner;

public class algo5 {
	static int K;
	static int count;

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, };

		K = new Scanner(System.in).nextInt();
		count = 0;
		rec(arr, 0, 0);
		System.out.println(count);

	}

	static void rec(int[] arr, int index, int sum) {
		if (index >= arr.length) {
			if (sum <= K)
				count++;
			return;
		}
		rec(arr, index + 1, sum - arr[index]);
		rec(arr, index + 1, sum + arr[index]);
	}

}
