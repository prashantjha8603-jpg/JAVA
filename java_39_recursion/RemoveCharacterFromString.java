package java_39_recursion;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static String newString(String s, char ch, int index) {
        if (index == s.length()) {
            return "";
        }
        String remaining = newString(s, ch, index + 1);
        if (ch != s.charAt(index)) {
            return s.charAt(index) + remaining;

        } else {
            return remaining;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String s = sc.nextLine();
        System.out.print("Enter Character you want to delete : ");
        char ch = sc.next().charAt(0);
        System.out.println("New String is : " + newString(s, ch, 0));
        sc.close();
    }
}
