package java_39_recursion;

import java.util.Scanner;

public class FibonacciSeries {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printSeries(int n, int i) {
        if (n == i) {
            return;
        }
        System.out.print(fibonacci(i)+" ");
        printSeries(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term of Fibonacci series : ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number of terms cannot be negative.");
        } else {
            printSeries(n, 0);
            System.out.println();
        }
        sc.close();
    }
}
