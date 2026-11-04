package java_40_Codeforces;

import java.util.Scanner;

public class Next_Round_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = arr[k - 1];
        int qualified = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x && arr[i] > 0) {
                qualified++;
            }
        }
        System.out.println(qualified);
        sc.close();
    }
}
