package day7_이론;

import java.util.LinkedList;
import java.util.Queue;

public class Ex03_QueueInterface {
	public static void main(String[] args) {

		// 이건 암기 !!!!
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i < 10; i++) {
			queue.offer(i); // enQueue늒ㅁ, add랑 큰 차이 없다
		}
		System.out.println(queue);
		// queue라는 인터페이스에서, 삭제 및 반환하는 연산은 poll()이다
		System.out.println("Queue 삭제 연산 : deQueue, poll : " + queue.poll());
		System.out.println(queue);
	}
}
