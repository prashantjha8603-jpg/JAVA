package java_07_strings;

import java.util.Scanner;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char result = '\0';

        for (char ch : str.toCharArray()) {

            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if (first == last) {
                result = ch;
                break;
            }
        }

        if (result == '\0') {
            System.out.println("No non-repeated character");
        } else {
            System.out.println("First non-repeated character: " + result);
        }

        sc.close();
    }
}
