package algo1;

public class algo7 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 6, 5, 4, 2};
		int[] dat = new int[10];


		for (int i = 0; i < arr.length; i++) {
		dat[arr[i]] = 1;
		}


		for (int i = 0; i < 10; i++) {
		if (dat[i] == 0) continue;
		System.out.print(i);
		}

	}

}
