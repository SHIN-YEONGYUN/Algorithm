package day2_이론;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 50, 30, 40, 20, 10 };
		int N = numbers.length;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int tmp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = tmp;
				}

			}

		}
		System.out.println(Arrays.toString(numbers));

	}

}
