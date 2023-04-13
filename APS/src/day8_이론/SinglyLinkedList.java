package day8_이론;

public class SinglyLinkedList {

	// 링크드리스트는 시작점을 가지고 있으면 된다.
	public Node head;

	// addLast : 링크드리스트 끝에 새로운 노드 연결짓는 함수
	public void addLast(int data) {
		Node newNode = new Node(data);

		// 이 부분, 없으면 어떤 에러가 뜨는지 확인 해봐야함
		// 그래야 이게 왜 필요한 코인지 알 수 있다.
		if (head == null) {
			head = newNode;
		} else {
			// 우선 첫 번째 노드를 가지고 와야함
			Node now = head;
			while (now.link != null) { // link가 null이면 마지막!
				now = now.link; // link에 다음 주소가 있다면, 임시 now 변수에 저장

			} // end while : 마지막 노드를 찾음

			// newNode의 link값은 null로 만들어놨다
			// 마지막 노드의 link값을 newNode로 저장하면, 추가 !!
			now.link = newNode;
		}
	}

	public void addFirst(int data) {
		// 새로운 노드 생성
		Node newNode = new Node(data);
		newNode.link = head; // 새로운 노드의 링크를 기존 시작점 주소로 연결
		head = newNode; // head는 늘 첫 번째 원소를 가리키고 있으니까, 새로운 노드의 주소를 head

	}

	// idx 번째 노드를 얻는 함수, 없으면 null을 반환하도록 만들기
	public Node get(int idx) {
		// head가 null이라면의 의미는?
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

	// idx 번째 다음에 노드를 삽입하는 함수 : addAfter
	public boolean addAfter(int idx, int data) {
		Node now = get(idx); // idx 번째 노드를 반환
		if (now == null) {
			return false;
		} else {
			Node newNode = new Node(data);
			newNode.link = now.link;
			now.link = newNode;
			return true;
		}
	}

	// idx번째 원소 삭제 , idx 이전 변의 원소가 필요
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

	@Override
	public String toString() {
		String answer = "[ ";
		Node now = head;
		while (now.link != null) {
			answer += (now.data + " -> ");
			now = now.link;
		}
		answer += (now.data + "] ");
		return answer;
	}

}
