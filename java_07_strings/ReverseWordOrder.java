package java_07_strings;

import java.util.Scanner;

public class ReverseWordOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();

        String[] words = sentence.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result.trim());

        sc.close();
    }
}
