package java_30_dsa_in_java;

import java.util.Scanner;

public class MaximumSumSubarraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Size Of Subarray : ");
        int k = sc.nextInt();
        if (k <= 0 || k > n) {
            System.out.println("Subarray size must be between 1 and " + n + ".");
            sc.close();
            return;
        }
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("Maximum sum of subarray of length " + k + " is " + max);
        sc.close();
    }
}
