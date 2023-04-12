package day7_문제풀이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex02_요세푸스 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> pq = new LinkedList<>();

		int N = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			pq.offer(i);
		}

		int cnt = 0;
		String brac = "<";
		while (!pq.isEmpty()) {
			cnt++;
			if (cnt == K) {
				brac += pq.poll() + ", ";
				cnt = 0;
			} else
				pq.offer(pq.poll());
		}
		brac = brac.substring(0, brac.length() - 2);
		brac += ">";

		System.out.println(brac);

	}
}
