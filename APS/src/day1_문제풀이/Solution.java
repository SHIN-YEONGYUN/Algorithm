package day1_문제풀이;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int answer = 0;
		for (int i = 1; i <= number; i++) {
			answer += i;
		}
		System.out.println(answer);

	}

}
