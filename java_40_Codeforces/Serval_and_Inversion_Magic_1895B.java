package java_40_Codeforces;

import java.util.Scanner;

public class Serval_and_Inversion_Magic_1895B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 1; z <= t; z++) {
            int n = sc.nextInt();
            String s = sc.next();

            int left = 0;
            int right = n - 1;
            int a = -1, b = -1,c=-1;
            int x = 0;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    if (x == 0) {
                        a = left;
                        x = 1;
                        c=right;
                    }
                    b = left;

                }
                left++;
                right--;
            }
            if (x == 0) {
                System.out.println("Yes");
                continue;
            }
            int y = 0;
            while (a <= b) {
                if (s.charAt(a) == s.charAt(c)) {
                    y = 1;
                    break;
                }
                a++;
                c--;
            }

            if (y == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
        sc.close();
    }
}
