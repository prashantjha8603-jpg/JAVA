package java_07_strings;

import java.util.Scanner;

public class Concatenate_two_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        String s2 = sc.nextLine();
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result += s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            result += s2.charAt(i);
        }
        System.out.println(result);
        sc.close();
    }
}
