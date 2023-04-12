package day7_이론;

import java.util.Arrays;

public class Ex01_Queue {
	static int[] queue; // queue 라는 이름의 1차원 배열
	static int front = -1; // 저장된 가장 앞의 원소 이전의 인덱스
	static int rear = -1; // 가장 마지막 원소의 인덱스

	public static void main(String[] args) {
		queue = new int[5]; // 크기가 5인 배열 선언
		enQueue(30);
		enQueue(40);
		System.out.println(Arrays.toString(queue));
		System.out.println("deQueue : " + deQueue());
		System.out.println(Arrays.toString(queue));
	}

	// 큐에 삽입
	static void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is Full");
		} else {
			rear++;
			queue[rear] = item;
		}

	}

	static int peek() {
		if (isEmpty()) {
			System.out.println("Queue is Empty!!");
			return -1;
		} else {
			return queue[front + 1];
		}
	}

	static int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		} else {
			// 가장 앞에 있는 원소 이전을 가리키는 인덱스는 ?
			front++;
			// 그 값을 하나 즈악시켜서 거기 있는 원소를 반환
			return queue[front];
		}
	}
	// 큐에서부터 삭제

// 1차원 배열을 활용한 큐가 꽉 차있는지 확인하는 함수
	static boolean isFull() {
		if (rear == queue.length - 1) {
			return true;
		} else {
			return false;
		} // return rear == (queue.length -1);
	}

	// 1차원 배열을 활용한 큐가 비어있는지 확인하는 함수
	static boolean isEmpty() {
		return front == rear;
	}
}
