package day7_문제풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01_카드2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Integer> pq = new LinkedList<>();

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			pq.offer(i);
		}
		// System.out.println(pq);

		while (pq.size() > 1) {
			pq.poll();
			pq.offer(pq.poll());
		}
		System.out.println(pq.poll());
	}
}
