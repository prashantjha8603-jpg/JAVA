package java_39_recursion;

import java.util.Scanner;

public class ReplaceCharacterInString {
    public static String replaceCharacter(String s, char ch, char ph, int index) {
        if (index == s.length()) {
            return "";
        }
        char gh = s.charAt(index);
        if (ch == gh) {
            gh = ph;
        }
        String ans = gh + replaceCharacter(s, ch, ph, index + 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String s = sc.nextLine();
        System.out.print("Enter character you want to replace : ");
        char ch = sc.next().charAt(0);
        System.out.print("Enter character which replace " + ch + " : ");
        char ph = sc.next().charAt(0);
        System.out.println("New String is : " + replaceCharacter(s, ch, ph, 0));
        sc.close();
    }
}
