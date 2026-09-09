package java_07_strings;

import java.util.Scanner;

public class Count_Upper_And_LowerCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;

        for (char ch : str.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }

        System.out.println("Uppercase: " + uppercase);
        System.out.println("Lowercase: " + lowercase);

        sc.close();
    }
}
