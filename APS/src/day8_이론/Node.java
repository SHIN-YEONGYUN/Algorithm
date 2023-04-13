package day8_이론;


public class Node {
	int data; // 담을 자료
	Node link; // 다음 노드의 주소;
	
	public Node(int data) {
		this.data=data;
		this.link=null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	
	
}
