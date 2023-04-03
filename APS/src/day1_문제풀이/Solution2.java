package day1_문제풀이;

import java.util.Scanner;

public class Solution2 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int answer = 0;
            for (int i = 0; i < 10; i++) {
                int number = sc.nextInt();
                if (answer < number) {
                    answer = number;
                }
            }
            System.out.println("#" + tc + " " + answer);
        }
    }
 
}
