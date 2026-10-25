package java_39_recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static String binary(int n, String x) {
        if (n == 0) {
            return new StringBuilder(x).reverse().toString();
        }
        x = x + n % 2;

        return binary(n / 2, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a non-negative number.");
        } else if (n == 0) {
            System.out.println("Binary Of The Given Number Is : 0");
        } else {
            System.out.println("Binary Of The Given Number Is : " + binary(n, ""));
        }
        sc.close();
    }
}
