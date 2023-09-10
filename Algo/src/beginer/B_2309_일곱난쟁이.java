package beginer;

import java.util.Arrays;
import java.util.Scanner;

public class B_2309_일곱난쟁이 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[9];
		int sum = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			sum += n[i];
		}

		Arrays.sort(n);

		for (int i = 0; i < n.length-1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (sum - n[i] - n[j] == 100) {
					a = i;
					b = j;
					break;
				}
			}
		}

		for (int i = 0; i < n.length; i++) {
			if (i == a || i == b)
				continue;
			System.out.println(n[i]);
		}
		sc.close();
	}
}
