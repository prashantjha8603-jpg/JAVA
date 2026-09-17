package java_07_strings;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String result = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {

                for (int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }

                result += ' ';
                word = "";
            }
        }

        for (int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        System.out.println(result);

        sc.close();
    }
}
