package java_07_strings;

import java.util.Scanner;

public class CountSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = str.length() - str.replace(" ", "").length();

        System.out.println("Number of spaces: " + count);

        sc.close();
    }
}