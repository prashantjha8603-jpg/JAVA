package java_05_loops_and_patterns;

import java.util.Scanner;

public class CountDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                count++;
                number /= 10;
            }
        }
        System.out.println("Number Of Digits In Your Number Is " + count);
        sc.close();
    }
}
