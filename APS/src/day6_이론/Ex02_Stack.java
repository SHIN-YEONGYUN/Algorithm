package day6_이론;

import java.util.Stack;

public class Ex02_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(4);
		System.err.println(stack);

		System.out.println("POP!!, pop 된 원소 : " + stack.pop());
		System.out.println(stack);
		System.out.println("POP!!, pop 된 원소 : " + stack.pop());
	}
}
