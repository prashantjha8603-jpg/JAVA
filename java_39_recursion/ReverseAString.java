package java_39_recursion;

import java.util.Scanner;

public class ReverseAString {
    public static void reverse(String s, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(s.charAt(n));
        reverse(s, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int n = s.length() - 1;
        reverse(s, n);
        sc.close();
    }
}
