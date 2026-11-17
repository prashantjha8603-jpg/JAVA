package java_40_Codeforces;

import java.util.Scanner;

public class Pair_Programming_1547C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {

            int k = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            int ans[] = new int[n + m];
            boolean isValid = true;
            int c = 0, d = 0;
            int y = 0;
            
            while (c < n && d < m) {
                if (a[c] > k && b[d] > k) {
                    isValid = false;
                    break;
                }
                if (a[c] == 0) {
                    ans[y] = a[c];
                    y++;
                    k++;
                    c++;
                } else if (b[d] == 0) {
                    ans[y] = b[d];
                    y++;
                    d++;
                    k++;
                } else if (a[c] <= k) {
                    ans[y] = a[c];
                    y++;
                    c++;
                } else if (b[d] <= k) {
                    ans[y] = b[d];
                    y++;
                    d++;
                } else {
                    isValid = false;
                    break;
                }
            }

            while (c < n) {
                if (a[c] == 0) {
                    ans[y] = a[c];
                    y++;
                    k++;
                    c++;
                } else {
                    if (a[c] <= k) {
                        ans[y] = a[c];
                        c++;
                        y++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            while (d < m) {
                if (b[d] == 0) {
                    ans[y] = b[d];
                    y++;
                    k++;
                    d++;
                } else {
                    if (b[d] <= k) {
                        ans[y] = b[d];
                        d++;
                        y++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                for (int i = 0; i < n + m; i++) {
                    System.out.print(ans[i] + " ");
                }
            } else {
                System.out.print(-1);
            }

            System.out.println();
        }
        sc.close();
    }
}
