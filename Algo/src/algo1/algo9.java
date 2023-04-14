package algo1;

public class algo9 {

	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i <= arr.length - tar.length; i++) {
			if (isSame(i))
				cnt++;
		}
		System.out.println(cnt);
	}

	static int[] arr = { 1, 0, 1, 1, 0, 1, 1, 1, 1, 0 };
	static int[] tar = { 0, 1, 1 };

	static boolean isSame(int idx) {
		for (int i = 0; i < 3; i++) {
			if (arr[idx+i] != tar[i])
				return false;
		}
		return true;
	}
}
