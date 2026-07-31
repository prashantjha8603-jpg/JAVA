package java_05_loops_and_patterns;

import java.util.*;

public class Hand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row : ");
        int n = sc.nextInt();
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 14; j++) {
                if (j == 1 || j == 2) {
                    if (i <= 3 * n / 4) {
                        System.out.print("  ");
                    }
                    if (i > 3 * n / 4) {
                        System.out.print("* ");
                    }
                }
                if (j == 3) {
                    if (i <= (3 * n / 4) + (n / 6)) {
                        System.out.print("  ");
                    }
                    if (i > (3 * n / 4) + (n / 6)) {
                        System.out.print("* ");
                    }
                }
                if (j == 4 || j == 5 || j == 10 || j == 11) {
                    if (i <= n / 2) {
                        System.out.print("  ");
                    }
                    if (i > n / 2) {
                        System.out.print("* ");
                    }
                }
                if (j == 6 || j == 9 || j == 13 || j == 14) {
                    if (i <= n / 2 + (n / 6)) {
                        System.out.print("  ");
                    }
                    if (i > n / 2 + (n / 6)) {
                        System.out.print("* ");
                    }
                }
                if (j == 7 || j == 8) {
                    System.out.print("* ");
                }
                if (j == 12) {
                    if (i <= n / 2 + (n / 6) + (n / 6)) {
                        System.out.print("  ");
                    }
                    if (i > n / 2 + (n / 6) + (n / 6)) {
                        System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
