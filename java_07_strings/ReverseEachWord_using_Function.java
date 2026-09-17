package java_07_strings;

import java.util.Scanner;

public class ReverseEachWord_using_Function {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();

        String[] words = sentence.split("\\s+");
        String result = "";

        for (String word : words) {
            result += new StringBuilder(word).reverse().toString() + " ";
        }

        System.out.println(result.trim());

        sc.close();
    }
}
