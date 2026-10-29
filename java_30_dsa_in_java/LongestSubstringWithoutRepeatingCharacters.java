package java_30_dsa_in_java;

import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String : ");
        String s = sc.nextLine();

        int freq[] = new int[65536];
        int max = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;

            while (freq[ch] > 1) {
                char leftchar = s.charAt(j);
                freq[leftchar]--;
                j++;
            }

            int length = i - j + 1;
            max = Math.max(max, length);
        }

        System.out.println("Longest substring length: " + max);
        sc.close();
    }
}