package java_30_dsa_in_java;

import java.util.Scanner;

public class MaximumNumberOfVowels {
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String s = sc.nextLine();
        System.out.print("Enter your substring length : ");
        int k = sc.nextInt();
        if (k <= 0 || k > s.length()) {
            System.out.println("Substring length must be in range 1 to " + s.length());
            sc.close();
            return;
        }
        int numberOfVowels = 0;
        for (int i = 0; i < k; i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (isVowel(ch)) {
                numberOfVowels++;
            }
        }
        int max = numberOfVowels;
        for (int i = k; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            char ph = Character.toLowerCase(s.charAt(i - k));
            if (isVowel(ch)) {
                numberOfVowels++;
            }
            if (isVowel(ph)) {
                numberOfVowels--;
            }
            if (max < numberOfVowels) {
                max = numberOfVowels;
            }
        }
        System.out.println("Maximum number of vowels in any substring of length " + k + " is : " + max);
        sc.close();
    }
}
