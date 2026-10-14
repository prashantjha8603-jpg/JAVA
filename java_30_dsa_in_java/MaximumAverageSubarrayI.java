package java_30_dsa_in_java;

import java.util.Scanner;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }
        int arr[] = new int[n];
        System.out.print("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Your Subarray Length : ");
        int k = sc.nextInt();
        if (k <= 0 || k > n) {
            System.out.println("Subarray Length Must Between 1 And " + n);
            sc.close();
            return;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (max < sum) {
                max = sum;
            }
        }
        double avg = (double) max / k;
        System.out.printf("Maximum average : %.5f", avg);
        sc.close();
    }
}
