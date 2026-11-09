package java_40_Codeforces;

import java.util.Scanner;

public class Sereja_and_Dima_381A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int d = 0;
        int left = 0;
        int right = n - 1;
        boolean isSereja = true;
        while (left <= right) {
            if (arr[left] < arr[right]) {
                if (isSereja) {
                    s += arr[right];
                    isSereja = false;
                } else {
                    d += arr[right];
                    isSereja = true;
                }
                right--;

            } else {
                if (isSereja) {
                    s += arr[left];
                    isSereja = false;
                } else {
                    d += arr[left];
                    isSereja = true;
                }
                left++;
            }

        }
        System.out.println(s + " " + d);
        sc.close();
    }
}
