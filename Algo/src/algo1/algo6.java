package algo1;

public class algo6 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 9, 6, 5 };
		int[] brr = { 4, 3, 5, 2, 3, 1, 9 };

		int[] dat = new int[10];

		for (int i = 0; i < arr.length; i++)
			dat[arr[i]] = 1;
		for (int i = 0; i < brr.length; i++)
			dat[brr[i]] = 1;

		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			cnt += dat[i];
		}

		System.out.println(cnt);

	}

}
