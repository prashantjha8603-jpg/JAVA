package java_07_strings;

import java.util.Scanner;

public class Concatenate_two_string_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter : ");
        String first = sc.nextLine();
        System.out.print("Enter : ");
        String second = sc.nextLine();

        String result = first.concat(second);

        System.out.println(result);

        sc.close();
    }
}
