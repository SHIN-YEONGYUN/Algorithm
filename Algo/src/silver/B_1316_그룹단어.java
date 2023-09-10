package silver;

import java.util.Scanner;

public class B_1316_그룹단어 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = n;

		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int[] arr = new int[26];

			char before = s.charAt(0);
			arr[before - '0' - 49]++;

			for (int j = 1; j < s.length(); j++) {
				char a = s.charAt(j);
				int index = a - '0' - 49;
				arr[index]++;
				if (arr[index] > 1 && a != before) {
					cnt--;
					break;
				}
				before = a;
			}
		}
		System.out.println(cnt);

	}

}
