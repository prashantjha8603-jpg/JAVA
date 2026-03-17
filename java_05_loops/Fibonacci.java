package java_05_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of term in fibonacci series : ");
        int term = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("1 = " + a + "\n2 = " + b);
        for (int i = 3; i <= term; i += 2) {
            a = a + b;
            System.out.println(i + " = " + a);
            if (i == term - 1 && term % 2 != 0)
                break;
            b = a + b;
            System.out.println((i+1) + " = " + b);
        }
        sc.close();
    }
}
