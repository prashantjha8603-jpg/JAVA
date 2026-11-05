package java_40_Codeforces;

import java.util.Scanner;

public class Bear_and_Big_Brother_791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int year = 0;
        while (a <= b) {
            a = 3 * a;
            b = 2 * b;
            year++;
        }
        System.out.println(year);
        sc.close();
    }
}
