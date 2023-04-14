package algo1;

public class algo8 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 5, 6, 6, 3 };
		int[] brr = { 1, 4, 3, 5, 9, 9, 3 };

		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != brr[i]) {
				flag = true;
				break;
			}
		}

		if (flag == false)
			System.out.println("OK");
		else
			System.out.println("NO");

	}

}
