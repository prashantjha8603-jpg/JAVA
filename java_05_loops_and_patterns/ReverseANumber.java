package java_05_loops_and_patterns;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int n = sc.nextInt();
        long k = 0;
        while (n != 0) {
            k = k * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Reverse of given number is : " + k);
        sc.close();
    }
}
