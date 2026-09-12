package java_07_strings;

import java.util.Scanner;

public class WordsStartingWithVowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();

        int count = 0;

        if (!sentence.isEmpty()) {

            String[] words = sentence.split("\\s+");

            for (String word : words) {

                if ("aeiou".indexOf(
                        word.toLowerCase().charAt(0)) != -1) {

                    count++;
                }
            }
        }

        System.out.println("Words starting with a vowel: " + count);

        sc.close();
    }
}
