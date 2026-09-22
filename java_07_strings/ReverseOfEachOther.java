package java_07_strings;

import java.util.Scanner;

public class ReverseOfEachOther {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String second = sc.nextLine();

        String reverse = new StringBuilder(second).reverse().toString();
        if (first.equals(reverse)) {
            System.out.println("Strings are reverse of each other");
        } else {
            System.out.println("Strings are not reverse of each other");
        }

        sc.close();
    }
}