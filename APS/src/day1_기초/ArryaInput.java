package day1_기초;

import java.util.Arrays;
import java.util.Scanner;

public class ArryaInput {

	public static void main(String[] args) {
		int[] input = new int[5];
		Scanner sc = new Scanner(System.in);

		/*
		 * int temp = 0; temp = sc.nextInt(); input[0] = temp; temp = sc.nextInt();
		 * input[1] = temp; temp = sc.nextInt(); input[2] = temp; temp = sc.nextInt();
		 * input[3] = temp; temp = sc.nextInt(); input[4] = temp;
		 */
		/*
		 * int temp = 0; for (int i = 0; i < input.length; i++) { temp = sc.nextInt();
		 * input[i] = temp;
		 * 
		 * }
		 */

		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(input));

		// boolean[] visited = new boolean[5];
		// System.out.println(Arrays.toString(visited));
		
	    
	}

}
