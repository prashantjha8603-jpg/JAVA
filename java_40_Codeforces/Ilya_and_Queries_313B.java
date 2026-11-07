package java_40_Codeforces;

import java.util.Scanner;

public class Ilya_and_Queries_313B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int m = sc.nextInt();
        

        int n = s.length();
        int[] prefix = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            prefix[i] = prefix[i - 1];
            if (s.charAt(i - 1) == s.charAt(i - 2)) {
                prefix[i]++;
            }
        }
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = prefix[r] - prefix[l];
            System.out.println(count);
        }
        sc.close();
    }
}
