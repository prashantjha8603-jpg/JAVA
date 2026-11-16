package java_40_Codeforces;

import java.util.Scanner;

public class Broken_Keyboard_1251A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            String s = sc.next();
            int n = s.length();
            int l = -1, r = -1;
            boolean c[] = new boolean[26];

            for (int i = 0; i < n; i++) {
                if (l == -1) {
                    l = i;
                }
                if (r == -1 && (i < n - 1 && s.charAt(i) != s.charAt(i + 1))) {
                    r = i;
                }
                if (r == -1 && i == n - 1) {
                    r = n - 1;
                }
                if (r != -1 && l != -1) {
                    int len = r - l + 1;
                    if (len % 2 != 0) {
                        char ch = s.charAt(r);
                        c[ch - 'a'] = true;
                    }
                    r = -1;
                    l = -1;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (c[i] == true) {
                    System.out.print((char) ('a' + i));
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
