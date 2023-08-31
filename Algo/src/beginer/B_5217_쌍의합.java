package beginer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_5217_쌍의합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			int n = Integer.parseInt(br.readLine());

			String P = "Pairs for " + n + ": ";

			for (int j = 1; j <= n / 2; j++) {
				if (j != (n - j)) {

					if (j > 1) {
						P += ", ";
					}
					P += j + " " + (n - j);
				}
			}
			System.out.println(P);
		}

	}

}
