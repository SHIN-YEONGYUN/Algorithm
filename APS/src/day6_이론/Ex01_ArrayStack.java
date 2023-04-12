package day6_이론;

import java.util.Arrays;

public class Ex01_ArrayStack {

	// 해당 클래스 내부 어디에서나 쓸 수 있는 배열 변수 선언
	static int[] stack;
	// 가장 마지막 운소를 가리키는 index 왜 -1?
	static int top = -1;

	public static void main(String[] args) {
		// stack을 만들어보자
		stack = new int[5];

		// push() -> 함수
		push(3);
		push(4);
		System.out.println(Arrays.toString(stack));
		// pop() -> 함수
		System.out.println("pop된 원소 : " + pop() + "현재 top 원소 : " + top);
		System.out.println(Arrays.toString(stack));
		push(25);
		System.out.println(Arrays.toString(stack));

	}

	// num : stack에 추가할 숫자
	static void push(int num) {
		if (top == stack.length - 1) {
			System.out.println("Stack is Full");
		} else {
			top++;
			stack[top] = num;
		}

	}

	static int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		} else {
			// 가장 마지막에 있는 원소에 접근해 topNum이라는 변수에 저장
			int topNum = stack[top];
			top = top - 1;
			return topNum;
		}
	}
}
