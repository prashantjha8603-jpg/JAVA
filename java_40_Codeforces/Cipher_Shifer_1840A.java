package java_40_Codeforces;

import java.util.Scanner;

public class Cipher_Shifer_1840A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder a = new StringBuilder();

            int left = 0;
            while (left < n) {
                char ch = s.charAt(left);
                a.append(ch);
                int right = left + 1;
                while (right < n && s.charAt(right) != ch) {
                    right++;
                }
                left = right + 1;
            }

            System.out.println(a);
        }
        sc.close();
    }
}
