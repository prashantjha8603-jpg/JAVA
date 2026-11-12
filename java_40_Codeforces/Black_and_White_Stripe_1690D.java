package java_40_Codeforces;

import java.util.Scanner;

public class Black_and_White_Stripe_1690D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int count = 0, max = 0;
            char ch = 'B';
            for (int j = 0; j < k; j++) {

                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            max = count;
            for (int j = k; j < n; j++) {
                if (s.charAt(j - k) == ch) {
                    count--;
                }
                if (s.charAt(j) == ch) {
                    count++;
                }
                max = Math.max(max, count);
            }
            int number = k - max;
            System.out.println(number);
        }
        sc.close();
    }
}
