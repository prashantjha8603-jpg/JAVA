package java_40_Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama_Mirais_Stones_433B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        long[] prefix1 = new long[n + 1];
        long[] prefix2 = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix1[i] = prefix1[i - 1] + arr[i - 1];
        }
        Arrays.sort(arr);
        for (int i = 1; i <= n; i++) {
            prefix2[i] = prefix2[i - 1] + arr[i - 1];
        }
        for (int i = 1; i <= m; i++) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (type == 1) {
                System.out.println(prefix1[r] - prefix1[l - 1]);
            } else {
                System.out.println(prefix2[r] - prefix2[l - 1]);
            }
        }
        sc.close();
    }
}
