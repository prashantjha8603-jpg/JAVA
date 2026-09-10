package java_07_strings;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        while (!str.isEmpty()) {

            char ch = str.charAt(0);

            int count = str.length() - str.replace(String.valueOf(ch), "").length();

            System.out.println(ch + " = " + count);

            str = str.replace(String.valueOf(ch), "");
        }
        sc.close();
    }
}
