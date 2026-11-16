package java_40_Codeforces;

import java.util.Scanner;

public class Shoe_Shuffling_1691B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int brr[] = new int[n];
            int l = -1, r = -1, length = 0;
            int ans = 0, x = 0;

            for (int i = 0; i < n; i++) {
                if (l == -1) {
                    l = i;
                }
                if (r == -1 && (i < n - 1 && arr[i] != arr[i + 1])) {
                    r = i;
                }
                if (r == -1 && i == n - 1) {
                    r = i;
                }
                if (r != -1 && l != -1) {
                    length = r - l + 1;
                    if (length != 1) {
                        for (int j = l; j <= r; j++) {
                            if (j != r) {
                                brr[x] = j + 2;
                                x++;
                            } else {
                                brr[x] = l + 1;
                                x++;
                            }
                        }
                    } else {
                        ans = -1;
                        break;
                    }
                    r = -1;
                    l = -1;
                }

            }
            if (ans == -1) {
                System.out.println(ans);
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(brr[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
