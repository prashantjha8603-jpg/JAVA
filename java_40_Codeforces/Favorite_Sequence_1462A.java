package java_40_Codeforces;

import java.util.Scanner;

public class Favorite_Sequence_1462A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int ans[] = new int[n];
            int left = 0;
            int right = n - 1;
            int k = 0;
            while (left <= right) {
                if (k % 2 == 0) {
                    ans[k] = arr[left];
                    left++;
                } else {
                    ans[k] = arr[right];
                    right--;
                }
                k++;
            }
            for (int val : ans) {
                System.out.println(val + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
