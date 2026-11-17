package java_40_Codeforces;

import java.util.Scanner;
import java.util.Arrays;

public class Maximum_Sum_Problem_1832B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                totalSum += arr[i];
            }
            Arrays.sort(arr);
            long leftsum = 0;
            for (int i = 1; i <= k; i++) {
                leftsum += arr[2 * i - 2] + arr[2 * i - 1];
            }
            long maxSum = totalSum - leftsum;
            int x = 2 * k - 1;
            long rightSum = 0;
            for (int i = n - 1; i >= n - k; i--) {
                rightSum += (long) arr[i];
                leftsum -= ((long) arr[x] + arr[x - 1]);
                x -= 2;
                long sum = leftsum + rightSum;
                maxSum = Math.max(maxSum, totalSum - sum);
            }
            System.out.println(maxSum);
        }
        sc.close();
    }
}