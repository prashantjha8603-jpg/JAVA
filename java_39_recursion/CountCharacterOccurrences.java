package java_39_recursion;

import java.util.Scanner;

public class CountCharacterOccurrences {
    public static int count(String s, char ch, int index) {
        if (index == s.length()) {
            return 0;
        }
        int count = (s.charAt(index) == ch) ? 1 : 0;
        return count + count(s, ch, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word : ");
        String s = sc.nextLine();
        System.out.print("Enter your Character : ");
        char ch = sc.next().charAt(0);
        System.out.print("Count of Character : " + count(s, ch, 0));
        sc.close();
    }
}
