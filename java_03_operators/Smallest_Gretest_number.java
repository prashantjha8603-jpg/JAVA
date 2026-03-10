package java_03_operators;

import java.util.Scanner;

public class Smallest_Gretest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number : ");
        double realnumber = sc.nextDouble();
        System.out.print((int)Math.ceil(realnumber) + " " + realnumber + " " + (int)Math.floor(realnumber));
        sc.close();
    }
}
