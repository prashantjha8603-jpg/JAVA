package java_30_dsa_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();

        int freq[] = new int[26];
        int[] windowFreq = new int[26];

        int n = s.length();
        int m = p.length();
        if (m > n) {
            return list;
        }
        for (int i = 0; i < m; i++) {
            freq[p.charAt(i) - 'a']++;
            windowFreq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= n - m; i++) {
            if (Arrays.equals(freq, windowFreq)) {
                list.add(i);
            }
            if (i < n - m) {
                windowFreq[s.charAt(i) - 'a']--;
                windowFreq[s.charAt(i + m) - 'a']++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your String Only Small letter");

        System.out.print("Enter first string (s): ");
        String s = sc.nextLine();

        System.out.print("Enter second string (p): ");
        String p = sc.nextLine();

        List<Integer> result = findAnagrams(s, p);
        System.out.println("Indexes of anagrams: " + result);

        sc.close();
    }
}