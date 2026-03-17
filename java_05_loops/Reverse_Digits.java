package java_05_loops;

import java.util.Scanner;

public class Reverse_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }
        System.out.print("Reverse of the number is : " + reverse);
        sc.close();
    }
}