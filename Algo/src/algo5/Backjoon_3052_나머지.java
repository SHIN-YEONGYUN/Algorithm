package algo5;

import java.util.Scanner;

public class Backjoon_3052_나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[10];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			A[i] = sc.nextInt() % 42;
		}
		for (int i = 0; i < 10; i++) {
			int temp = 0;
			for (int j = i + 1; j < 10; j++) {
				if (A[i] == A[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
