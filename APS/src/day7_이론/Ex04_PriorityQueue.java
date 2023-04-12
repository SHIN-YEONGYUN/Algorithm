package day7_이론;

import java.util.PriorityQueue;

public class Ex04_PriorityQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// 입력이 10부터 1까지 들어왔는데, 오름차순 정렬 !!
		// 입력 받는 상황을 반복문으로 표현하고 pq에 넣어서, 빼는 식으로 정렬

		for (int i = 10; i > 0; i--) {
			pq.offer(i);
		}
		System.out.println(pq);

		// pq 기본적으로 오름차순 기준, 작은게 우선순위가 높다
		for (int i = 0; i < 10; i++) {
			System.out.println("PriorityQueue poll : " + pq.poll());
		}
	}
}
