package java_07_strings;

import java.util.Scanner;

public class WordsEndingWithS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();

        int count = 0;

        if (!sentence.isEmpty()) {

            String[] words = sentence.split("\\s+");

            for (String word : words) {

                if (word.toLowerCase().endsWith("s")) {
                    count++;
                }
            }
        }

        System.out.println("Words ending with s: " + count);

        sc.close();
    }
}
