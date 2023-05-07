package algo5;

import java.util.Scanner;

public class Backjoon_10810_공넣기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총 바구니 갯수
		int[] arr = new int[N];
		int M = sc.nextInt(); // 공 넣는 줄 갯수

		for (int i = 0; i < M; i++) {
			int I = sc.nextInt(); // 바구니 범위 
			int J = sc.nextInt(); // 바구니 범위
			int K = sc.nextInt(); // 몇 번 공 넣을지
			
			for(int j = I-1; j<J; j++) {
				arr[j]=K;
			}
		}
		for(int k =0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
