package java_40_Codeforces;

import java.util.Scanner;

public class Ski_Resort_1840C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int arr[] = new int[n];

            int x = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > q) {
                    arr[i] = 0;
                    x = 1;
                } else {
                    arr[i] = x;
                    x++;
                }

            }
            long count = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] >= k) {
                    count += arr[i] - k + 1;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
