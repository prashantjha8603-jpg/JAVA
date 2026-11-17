package java_40_Codeforces;

import java.util.Scanner;

public class Eating_Candies_1669F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int w[] = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = sc.nextInt();
            }
            int l = 0, r = n - 1;
            int leftSum = w[l];
            int rightSum = w[r];
            int leftCount = 1;
            int rightCount = 1;
            l++;
            r--;
            int maxCount = 0;
            if (leftSum == rightSum) {
                maxCount = leftCount + rightCount;
            }
            if (n == 1) {
                maxCount = 0;
            }
            while (l <= r) {
                if (leftSum > rightSum) {
                    rightSum += w[r];
                    r--;
                    rightCount++;
                } else {
                    leftSum += w[l];
                    l++;
                    leftCount++;
                }
                if (leftSum == rightSum) {
                    maxCount = leftCount + rightCount;
                }
            }

            System.out.println(maxCount);
        }
        sc.close();
    }
}
