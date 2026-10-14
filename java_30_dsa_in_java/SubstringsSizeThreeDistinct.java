
package java_30_dsa_in_java;

import java.util.Scanner;

public class SubstringsSizeThreeDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= s.length() - 3; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && a != c && b != c) {
                count++;
            }
        }

        System.out.println("Number of substrings with distinct characters: " + count);

        sc.close();
    }
}
