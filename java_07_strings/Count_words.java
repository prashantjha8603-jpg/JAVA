package java_07_strings;

import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && (i == 0 || str.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        System.out.println("Total number of word in this sentence : " + (count));
        sc.close();
    }
}
