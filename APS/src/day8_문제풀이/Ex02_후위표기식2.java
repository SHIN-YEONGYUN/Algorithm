package day8_문제풀이;

import java.util.Scanner;
import java.util.Stack;

public class Ex02_후위표기식2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] alphabets = new double[26];
		// 피 연산자 개수
		int N = sc.nextInt();

		// 문자들
		String str = sc.next();

		for (int i = 0; i < N; i++) {
			alphabets[i] = sc.nextInt();
		}
		Stack<Double> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if (c >= 65 && c <= 90) {
				stack.push(alphabets[c - 'A']);
			} else {
				double number1 = stack.pop();
				double number2 = stack.pop();
				double calcNumber = 0;

				switch (c) {
				case '*':
					calcNumber = number1 * number2;
					break;
				case '+':
					calcNumber = number1 + number2;
					break;
				case '/':
					calcNumber = (double) number1 / number2;
					break;
				case '-':
					calcNumber = number1 - number2;
					break;

				}
				stack.push(calcNumber);
			}
		}
		System.out.printf("%.2f", stack.pop());

	}

}
