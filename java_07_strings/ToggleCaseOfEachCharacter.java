package java_07_strings;

import java.util.Scanner;

public class ToggleCaseOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your string : ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            sb.append(ch);
        }

        System.out.println("Your String After Toggle Each Charater is : " + sb);

        sc.close();
    }
}
