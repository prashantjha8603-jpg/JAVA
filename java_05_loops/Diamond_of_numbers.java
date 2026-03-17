package java_05_loops;

import java.util.Scanner;

public class Diamond_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int n = sc.nextInt();
        int mid = (n + 1) / 2, num = 1;
        for (int i = 1; i <= mid; i++) {
            for (int j = 1; j + i <= mid; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j < 2 * i; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
        int start = n % 2 == 0 ? mid : mid - 1;
        for (int i = start; i >= 1; i--) {
            for (int j = 1; j <= mid - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print(num + "\t");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
