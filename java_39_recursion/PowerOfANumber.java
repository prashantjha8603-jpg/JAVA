package java_39_recursion;

import java.util.Scanner;

public class PowerOfANumber {
    public static long power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = sc.nextInt();
        System.out.print("Enter power of " + x + " : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please Enter A Positive Exponent.");
            sc.close();
            return;
        }
        System.out.println(x + " power of " + n + " is : " + power(x, n));
        sc.close();
    }
}
