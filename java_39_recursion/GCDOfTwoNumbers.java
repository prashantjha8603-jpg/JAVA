package java_39_recursion;

import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static int gcd(int n, int x) {
        n = Math.abs(n);
        x = Math.abs(x);
        if (x == 0) {
            return n;
        }
        return gcd(x, n % x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number");
        int n = sc.nextInt();
        System.out.print("Enter second number");
        int x = sc.nextInt();
        System.out.println("GCD = " + gcd(n, x));
        sc.close();
    }
}
