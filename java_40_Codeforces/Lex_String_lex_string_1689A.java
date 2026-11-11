package java_40_Codeforces;

import java.util.Scanner;
import java.util.Arrays;

public class Lex_String_lex_string_1689A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int p = 0; p < t; p++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            String a = sc.next();
            String b = sc.next();

            char[] arrA = a.toCharArray();
            char[] arrB = b.toCharArray();

            Arrays.sort(arrA);
            Arrays.sort(arrB);

            StringBuilder c = new StringBuilder();

            int g = 0, h = 0;
            int count = 0;
            int f = 0;

            while (g < n && h < m) {
                if (count == k) {
                    if (f == 0) {
                        c.append(arrB[h]);
                        h++;
                        f = 1;
                    } else {
                        c.append(arrA[g]);
                        g++;
                        f = 0;
                    }
                    count = 1;
                } else if (arrA[g] < arrB[h]) {
                    c.append(arrA[g]);
                    g++;

                    if (f == 1) {
                        count = 0;
                    }
                    f = 0;
                    count++;
                } else {
                    c.append(arrB[h]);
                    h++;
                    if (f == 0) {
                        count = 0;
                    }
                    f = 1;
                    count++;
                }

            }
            System.out.println(c);
        }

        sc.close();
    }
}
