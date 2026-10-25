package java_39_recursion;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First number : ");
        int x = sc.nextInt();
        System.out.print("Enter your Second number : ");
        int y = sc.nextInt();

        if (x == 0 || y == 0) {
            System.out.print("LCM IS : 0");
            sc.close();
            return;
        }

        long lcm = Math.abs((long) x * y / (GCDOfTwoNumbers.gcd(x, y)));
        System.out.println("LCM is : " + lcm);

        sc.close();
    }
}
