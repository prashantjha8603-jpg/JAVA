package java_39_recursion;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static boolean palindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return palindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean flag = palindrome(s, left, right);
        if (flag == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
