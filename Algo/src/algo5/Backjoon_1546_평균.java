package algo5;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon_1546_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double[] arr = new double[T];
		double sum = 0;

		for (int i = 0; i < T; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sum += (arr[i] / (arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}