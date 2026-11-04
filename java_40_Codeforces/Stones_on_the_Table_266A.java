package java_40_Codeforces;

import java.util.Scanner;

public class Stones_on_the_Table_266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            char ch = s.charAt(i);
            char ph = s.charAt(i + 1);
            if (ch == ph) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
