package java_38_problem_solving;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckWhetherTwoStringsAreAnagrams {
    public static boolean isAnagaram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }
        for (char c : t.toCharArray()) {
            if (list.contains(c)) {
                list.remove((Character) c);
            } else {
                return false;
            }
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your First String : ");
        String s = sc.nextLine();
        System.out.print("Enter Your Second String : ");
        String t = sc.nextLine();
        System.out.println(isAnagaram(s, t));
        sc.close();
    }
}
