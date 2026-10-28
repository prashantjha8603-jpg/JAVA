package java_39_recursion;

import java.util.Scanner;

public class CheckArraySorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1 || arr.length == 0) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Enter positive size for array : ");
            sc.close();
            return;
        }
        int[] arr = new int[size];
        System.out.print("Enter Element Of Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ArraySorted = isSorted(arr, 0);
        if (ArraySorted) {
            System.out.print("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        sc.close();
    }
}
