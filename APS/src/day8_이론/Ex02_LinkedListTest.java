package day8_이론;

public class Ex02_LinkedListTest {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.addFirst(45);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		System.out.println(list.get(2));
	}
}
