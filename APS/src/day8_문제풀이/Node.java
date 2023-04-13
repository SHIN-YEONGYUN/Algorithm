package day8_문제풀이;

public class Node {
	int data;
	Node link;
	int size;

	public Node(int data) {
		this.data = data;
		this.link = null;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + ", size=" + size + "]";
	}

}
