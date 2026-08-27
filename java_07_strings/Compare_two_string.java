package java_07_strings;

import java.util.Scanner;

public class Compare_two_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter : ");
        String first = sc.nextLine();
        System.out.print("Enter : ");
        String second = sc.nextLine();

        int minLength = Math.min(first.length(), second.length());
        int result = 0;

        for (int i = 0; i < minLength; i++) {
            if (first.charAt(i) < second.charAt(i)) {
                result = -1;
                break;
            }
            if (first.charAt(i) > second.charAt(i)) {
                result = 1;
                break;
            }
        }
        if (result == 0) {
            if (first.length() < second.length()) {
                result = -1;
            } else if (first.length() > second.length()) {
                result = 1;
            }
        }

        if (result == 0) {
            System.out.println("Both Strings are equal");
        } else if (result > 0) {
            System.out.println("First string comes after second string");
        } else {
            System.out.println("First string comes before second string");
        }

        sc.close();
    }
}
