package java_07_string;

import java.util.*;

public class Count_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence : ");
        String str = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                vowelCount++;
            }
        }
        System.out.println(vowelCount + " Vowel is present");
        sc.close();
    }
}