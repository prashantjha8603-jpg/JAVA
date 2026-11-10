package java_40_Codeforces;

import java.util.Scanner;

public class Long_Long_1843B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                sum += Math.abs((long) arr[j]);
            }
            int count = 0;
            boolean isNegativeGroup = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] < 0) {
                    if (!isNegativeGroup) {
                        count++;
                    }
                    isNegativeGroup = true;
                } else if (arr[j] > 0) {
                    isNegativeGroup = false;
                }
            }

            System.out.println(sum + " " + count);
        }
        sc.close();
    }
}
