package java_40_Codeforces;

import java.util.Scanner;

public class Beautiful_Matrix_263A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int r = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    r = i + 1;
                    c = j + 1;
                }
            }
        }
        int numberOfSetps = Math.abs(r - 3) + Math.abs(c - 3);
        System.out.println(numberOfSetps);
        sc.close();
    }
}
