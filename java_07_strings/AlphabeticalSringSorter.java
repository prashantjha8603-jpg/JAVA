package java_07_strings;

import java.util.Scanner;
import java.util.Arrays;

public class AlphabeticalSringSorter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        String result = new String(ch);

        System.out.println("Sorted String : " + result);

        sc.close();

    }
}
