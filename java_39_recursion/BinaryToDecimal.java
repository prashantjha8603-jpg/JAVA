package java_39_recursion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static long decimal(long num, int power) {
        if (num == 0) {
            return 0;
        }
        int digit = (int) (num % 10);
        return digit * (int) Math.powExact(2, power) + decimal(num / 10, power + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number : ");
        long num = sc.nextLong();
        if (num < 0) {
            System.out.println("Please enter a non nagetive binaray number");
        } else {
            long temp = num;
            boolean valid = true;
            while (temp > 0) {
                int digit = (int) (temp % 10);
                if (digit != 0 && digit != 1) {
                    valid = false;
                    break;
                }
                temp /= 10;
            }
            if (valid) {
                System.out.println("Decimal number is : " + decimal(num, 0));
            } else {
                System.out.println("Invalid binary number.");
            }
        }

        sc.close();
    }
}
