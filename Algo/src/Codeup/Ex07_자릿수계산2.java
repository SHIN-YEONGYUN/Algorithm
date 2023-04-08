package Codeup;

import java.util.Scanner;

public class Ex07_자릿수계산2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (int) (Math.log10(n) + 1);
		System.out.println(a);

	}

}
