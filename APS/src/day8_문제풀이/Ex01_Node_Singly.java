package day8_문제풀이;

import java.util.Scanner;

public class Ex01_Node_Singly {

	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addFirst(78);
		System.out.println(list.size());
		System.out.println(list);
		// list.clear();
		// System.out.println(list);
	}

}
