package java_40_Codeforces;

import java.util.Scanner;

public class New_Theatre_Square_1359B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            int d = 0, s = 0;
            char ch = '.';

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    if (arr[i].charAt(j) == ch) {

                        if (j + 1 < m && arr[i].charAt(j + 1) == ch) {
                            d++;
                            j++;
                        } else {
                            s++;
                        }
                    }
                }
            }

            int price = 0;
            price = s * x + d * Math.min(y, 2 * x);
            System.out.println(price);
        }
        sc.close();
    }
}
