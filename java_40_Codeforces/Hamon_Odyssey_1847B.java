package java_40_Codeforces;

import java.util.Scanner;

public class Hamon_Odyssey_1847B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int res = -1;
            int count = 0;
            for (int i = 0; i < n; i++) {
                res = res & a[i];
                if (res == 0) {
                    count++;
                    res = -1;
                }
            }
            if (count == 0) {
                count = 1;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
