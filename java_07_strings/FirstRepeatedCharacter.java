package java_07_strings;

import java.util.Scanner;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    result = str.charAt(i);
                    break;
                }
            }

            if (result != '\0') {
                break;
            }
        }

        if (result == '\0') {
            System.out.println("No repeated character");
        } else {
            System.out.println("First repeated character: " + result);
        }

        sc.close();
    }

}
