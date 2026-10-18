package java_30_dsa_in_java;

import java.util.Scanner;
import java.util.Arrays;

public class PermutationInString {
    public static boolean isPermutation(String s1, String s2) {

        int p = s1.length();
        int q = s2.length();

        if (q > p) {
            return false;
        }

        int[] freq = new int[26];
        int[] wfreq = new int[26];

        for (int i = 0; i < q; i++) {
            freq[s2.charAt(i) - 'a']++;
            wfreq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= p - q; i++) {
            if (Arrays.equals(freq, wfreq)) {
                return true;
            }
            if (i < p - q) {
                wfreq[s1.charAt(i) - 'a']--;
                wfreq[s1.charAt(i + q) - 'a']++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Main String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter Pattern String : ");
        String s2 = sc.nextLine();
        boolean ans = isPermutation(s1, s2);
        System.out.println(ans);
        sc.close();
    }
}
