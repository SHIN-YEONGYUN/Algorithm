package day8_문제풀이;

import java.util.Scanner;

public class Ex03_customList {
	static class customList {
		Node head;

		public void addLast(int value) {
			Node n = new Node(value);
			if (head == null) {
				head = new Node(value);
			} else {
				Node now = head;
				while (now.next != null) {
					now = now.next;
				}
				now.next = n;
			}
		}

		public int removeFirst(int value) {
			int retValue = head.value;
			head = head.next;
			return retValue;
		}
	}

	static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		customList list = new customList();

		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			list.addLast(i);
		}
		int K = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int k = K - 1;
			for (; k > 0; k--) {
				list.addLast(list.removeFirst());
			}
			int number
		}
	}

}
