package java_06_arrays_and_vector;

import java.util.Scanner;

public class StraightLineFitting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of points : ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        double sx = 0;
        double sy = 0;
        double sxy = 0;
        double sxx = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + i + " y" + i + " ");
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();

            sx += x[i];
            sy += y[i];
            sxy += x[i] * y[i];
            sxx += x[i] * x[i];
            
        }
        double m = (n * sxy - sx * sy) / (n * sxx - sx * sx);
        double c = (sy - m * sx) / n;

        System.out.print("\nSlope (m) = " + m);
        System.out.print("\nIntercept (c) = " + c);

        System.out.println("\nEquation:");
        System.out.println("y = " + m + "x + " + c);

        sc.close();
    }

}
