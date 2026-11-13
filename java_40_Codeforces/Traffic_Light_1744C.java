package java_40_Codeforces;

import java.util.Scanner;

public class Traffic_Light_1744C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();
            int count = 0;
            int max = 0;
            int r = 0;
            boolean x = true;
            int first = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);

                if (ch == 'g') {
                    max = Math.max(max, count);
                    count = 0;
                    r = 0;
                    x = false;
                }
                if (ch == c && c != 'g') {
                    r = 1;
                }
                if (x) {
                    first++;
                }
                if (r == 1) {
                    count++;
                }

            }
            if (r == 1) {
                max = Math.max(max, first + count);
            }
            System.out.println(max);

        }
        sc.close();
    }
}
