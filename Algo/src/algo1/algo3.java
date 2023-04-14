package algo1;

public class algo3 {
	static void recursive(int n) {
		if (n == 3)
			return;

		recursive(n + 1);
		System.out.print(n);
	}

	public static void main(String[] args) {
		recursive(0);
	}

}
