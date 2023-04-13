package day8_문제풀이;

public class SLinkedList {
	public Node head;
	int size;

	public void addLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node now = head;
			while (now.link != null) {
				now = now.link;
			}
			now.link = newNode;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.link = head;
		head = newNode;
	}

	public Node get(int idx) {
		if (head == null) {
			return null;
		} else {
			Node now = head;
			for (int i = 0; i < idx; i++) {
				now = now.link;
				if (now == null) {
					return null;
				}
			}
			return now;
		}
	}

	public boolean addAfter(int idx, int data) {
		Node now = get(idx);
		if (now == null) {
			return false;
		} else {
			Node newNode = new Node(data);
			newNode.link = now.link;
			now.link = newNode;
			return true;
		}
	}

	public boolean remove(int idx) {
		if (head == null) {
			return false;
		}
		if (idx <= 0) {
			head = head.link;
			return true;
		} else {
			Node prev = get(idx - 1);
			Node now = get(idx);
			if (prev == null || now == null)
				return false;
			prev.link = now.link;
			return true;
		}

	}

	public int size() {
		return size;
	}

	public void clear() {
		while (size > 0) {
			remove(1);
		}
		size = 0;
	}

	@Override
	public String toString() {
		String answer = "<";
		Node now = head;
		while (now.link != null) {
			answer += (now.data + ", ");
			now = now.link;
		}
		answer += (now.data + ">");
		return answer;
	}

}
