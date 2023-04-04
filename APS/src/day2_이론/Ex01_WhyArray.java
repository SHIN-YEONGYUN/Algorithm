package day2_이론;

public class Ex01_WhyArray {

	public static void main(String[] args) {
		int[] scores = { 60, 100, 75 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] : " + scores[i]);
			sum += scores[i];
			System.out.println("sum[" + i + "] : " + sum);
		}
	}

}
