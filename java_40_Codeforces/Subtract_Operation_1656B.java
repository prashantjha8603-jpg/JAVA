package java_40_Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Subtract_Operation_1656B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean found = false;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int left = 0;
            int right = 1;
            while (left < n && right < n) {
                long diff = Math.abs((long) arr[right] - arr[left]);
                if (diff == k) {
                    found = true;
                    break;
                } else if (diff < k) {
                    right++;
                } else {
                    left++;
                }
                if (left == right) {
                    right++;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();

    }

}
