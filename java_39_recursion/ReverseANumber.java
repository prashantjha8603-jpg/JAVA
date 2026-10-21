package java_39_recursion;

import java.util.Scanner;

public class ReverseANumber {
    public static long reverse(int n, long ans) {
        if (n == 0) {
            return ans;
        }
        int digit = n % 10;
        ans = ans * 10 + digit;
        return reverse(n / 10, ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        long result = reverse(Math.abs(n), 0);
        if (n < 0) {
            result = -result;
        }
        System.out.println("Reversed number is : " + result);
        sc.close();
    }
}
