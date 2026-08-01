package java_09_classes_and_objects;

import java.util.Random;

public class Array2DSize {

    static double[][] createArray(int rows, int cols, double begin, double ends) {
        double[][] arr = new double[rows][cols];
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = begin + (ends - begin) * rand.nextDouble();
            }
        }
        return arr;
    }

    static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%8/..2f ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] a1 = createArray(3, 4, 1.0, 10.0);
        double[][] a2 = createArray(3, 4, 5.0, 20.0);
        double[][] a3 = createArray(4, 2, 0.0, 100.0);

        System.out.println("Array 1:");
        printArray(a1);
        System.out.println("\nArray 2:");
        printArray(a2);
        System.out.println("\nArray 3:");
        printArray(a3);
    }

}
