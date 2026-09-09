package java_07_strings;

import java.util.Scanner;

public class Count_digit_Character_digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String str = sc.nextLine();

        int letters = 0;
        int digits = 0;
        int special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);

        sc.close();
    }
}