package java_07_strings;

import java.util.Scanner;

public class Reverse_Of_Each_Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String : ");
        String first = sc.nextLine();

        System.out.print("Enter your second String : ");
        String second = sc.nextLine();

        boolean isReverse = true;
        if (first.length() != second.length()) {
            isReverse = false;
        } else {
            int j = second.length() - 1;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(j)) {
                    isReverse = false;
                    break;
                }
                j--;

            }

        }
        if (isReverse) {
            System.out.println("Strings are reverse of each other");
        } else {
            System.out.println("Strings are not reverse of each other");
        }
        sc.close();
    }
}
