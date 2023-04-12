package day7_문제풀이;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex03_프린트 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt(); // 문서 개수
			int M = sc.nextInt(); // 궁금한 위치
			int cnt = 0; // 중요도
			Queue<int[]> pq = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				pq.offer(new int[] { i, sc.nextInt() });
			}

			System.out.println(pq.size());
			boolean flag = true;
			while (true) {
				int now[] = pq.poll();
				flag = true;

				for (int q[] : pq) {
					if (q[1] > now[1]) {
						flag = false;
						break;
					}
				}
				if (flag) {
					cnt++;
					if (now[0] == M)
						break;
				} else
					pq.offer(now);
			}
			System.out.println("#" + tc + cnt);
		}
	}
}
