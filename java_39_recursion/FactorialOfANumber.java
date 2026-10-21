package java_39_recursion;

import java.util.Scanner;

public class FactorialOfANumber {
    public static long factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return (long) n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n > 20) {
            System.out.println("Number is too large for long factorial.");
        } else {
            System.out.println(factorial(n));
        }
        sc.close();
    }
}
