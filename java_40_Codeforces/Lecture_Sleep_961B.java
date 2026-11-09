package java_40_Codeforces;

import java.util.Scanner;

public class Lecture_Sleep_961B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += a[i] * t[i];
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (t[i] == 0) {
                sum += a[i];
            }
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            if (t[i - k] == 0) {
                sum = sum - a[i - k];
            }
            if (t[i] == 0) {
                sum = sum + a[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        total = total + max;
        System.out.println(total);
        sc.close();
    }
}
