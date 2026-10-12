package java_38_problem_solving;

import java.util.Scanner;

public class ValidAnagram {
    public static boolean isanagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            char ph = t.charAt(i);
            freq[ph - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 word in lower case only");
        System.out.print("Enter your first String : ");
        String s = sc.next();
        System.out.print("Enter your second String : ");
        String t = sc.next();
        System.out.println("Are Anagram : " + isanagram(s, t));
        
        sc.close();
    }
}
