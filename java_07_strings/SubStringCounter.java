package java_07_strings;

import java.util.*;

public class SubStringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Sentence : ");
        String sentence = sc.nextLine();

        System.out.print("Enter Word : ");
        String word = sc.nextLine();

        int count = 0;
        int index =0;
        while ((index = sentence.indexOf(word, index)) != -1) {
            count++;
            index = index + word.length();
        }
        sc.close();
        System.out.println("Occurrences = " + count);
    }
}
