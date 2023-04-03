package day1_기초;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 하나를 입력해주세요 (0~100) : ");

		int score = sc.nextInt();
		System.out.println("점수 :" + score);

		if (score >= 90) {
			System.out.println("A등급!!");
		} else if (score >= 80) {
			System.out.println("B등급!!");
		} else if (score >= 70) {
			System.out.println("C등급!!");
		} else if (score >= 60) {
			System.out.println("D등급!!");
		} else {
			System.out.println("E등급!!");
		}
	}

}
