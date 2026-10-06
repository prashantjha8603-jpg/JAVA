package java_05_loops_and_patterns;

import java.util.Scanner;

public class CheckWhetherANumberIsAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int y = n;
        int z = 0;
        while (y != 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }
        System.out.println("Palindrome : " + (z == n));
        sc.close();
    }
}
