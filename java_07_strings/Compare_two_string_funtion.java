package java_07_strings;

import java.util.Scanner;

public class Compare_two_string_funtion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter : ");
        String first = sc.nextLine();
        System.out.print("Enter : ");
        String second = sc.nextLine();

        int result = first.compareTo(second);

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
