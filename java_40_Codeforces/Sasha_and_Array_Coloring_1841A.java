package java_40_Codeforces;

import java.util.Scanner;
import java.util.Arrays;

public class Sasha_and_Array_Coloring_1841A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int left = 0;
            int right = n - 1;
            int sum = 0;
            while (left < right) {
                sum += arr[right] - arr[left];
                left++;
                right--;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
