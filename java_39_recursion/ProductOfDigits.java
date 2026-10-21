package java_39_recursion;

import java.util.Scanner;

public class ProductOfDigits {
    public static long product(int n) {
        n = Math.abs(n);
        if (n < 10) {
            return n;
        }
        int digit = n % 10;
        return digit * product(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("Product of digit of " + n + " is " + product(n));
        sc.close();
    }
}
