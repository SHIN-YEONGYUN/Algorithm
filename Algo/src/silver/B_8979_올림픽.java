package silver;

import java.util.Scanner;

public class B_8979_올림픽 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int result = 1;

		int[][] medals = new int[N][4];
		long[][] score = new long[N][2];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				medals[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			score[i][0] = medals[i][0];
			score[i][1] = (medals[i][1] * 1000000000000L) + (medals[i][2] * 1000000) + (medals[i][3] * 1);
		}
		for (int i = 0; i < N; i++) {
			if (score[i][0] == K) {
				for (int j = 0; j < N; j++) {
					if (score[i][1] < score[j][1])
						result++;
				}
				break;
			}
		}
		System.out.println(result);
	}

}
