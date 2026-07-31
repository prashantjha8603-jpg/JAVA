package java_08_methods;

import java.util.*;

public class Prime {
    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean x = prime(n);
        if (x) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
        sc.close();
    }
}
