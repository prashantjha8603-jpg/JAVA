package java_03_operators;

import java.util.Scanner;

public class HCF {
    static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers in total do you want to find the HCF of ?");
        int x = sc.nextInt();
        System.out.print("Enter number 1 : ");
        int result = sc.nextInt();
        for (int i = 2; i <= x; i++) {
            System.out.print("Enter number " + i + " : ");
            int num = sc.nextInt();
            result = hcf(result, num);
        }
        System.out.println("HCF of given numbers is " + result);
        sc.close();
    }
}
