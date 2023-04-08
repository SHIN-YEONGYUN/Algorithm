package Codeup;

import java.util.Scanner;

public class Ex07_자릿수계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n <= 9) {
			System.out.println(1);
		} else if (n <= 99) {
			System.out.println(2);
		} else if (n <= 999) {
			System.out.println(3);
		} else if (n <= 9999) {
			System.out.println(4);
		} else if (n <= 99999) {
			System.out.println(5);
		} else if (n <= 999999) {
			System.out.println(6);
		} else if (n <= 9999999) {
			System.out.println(7);
		} else if (n <= 99999999) {
			System.out.println(8);
		} else if (n <= 999999999) {
			System.out.println(9);
		} else
			System.out.println(10);

	}

}
