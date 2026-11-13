package java_40_Codeforces;

import java.util.Scanner;

public class Challenging_Valleys_1760D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int valleyCount = 0;
            int l = -1, r = -1;
            for (int i = 0; i < n; i++) {
                if (l == -1) {
                    l = i;
                }
                if (r == -1 && (arr[i] == arr[l] && (i == n - 1 || arr[i + 1] != arr[l]))) {
                    r = i;
                }
                if (l != -1 && r != -1) {
                    if ((l == 0 || arr[l - 1] > arr[l]) && (r == n - 1 || arr[r] < arr[r + 1])) {
                        valleyCount++;
                    }
                    l = -1;
                    r = -1;
                }
            }
            if (valleyCount == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
