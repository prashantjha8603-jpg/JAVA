package java_07_strings;

import java.util.Scanner;

public class AsciiValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            System.out.println(ch + " = " + (int) ch);
        }

        sc.close();
    }
}