package silver;

import java.util.Scanner;

public class B_2941_크로아티아알파벳 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

		String s = sc.nextLine();

		for (int i = 0; i < str.length; i++) {
			if (s.contains(str[i]))

				s = s.replace(str[i], "^");
		}
		System.out.println(s.length());

	}

}
