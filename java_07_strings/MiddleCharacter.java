package java_07_strings;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine();
        int n = str.length();
        if (n % 2 == 0) {
            System.out.println(str.substring(n / 2 - 1, n / 2 + 1));
        } else {
            System.out.println(str.substring(n / 2, n / 2 + 1));
        }
        sc.close();
    }
}
