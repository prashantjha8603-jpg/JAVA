package java_07_strings;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.print("Reversed String Is : " + sb);
        sc.close();
    }
}
