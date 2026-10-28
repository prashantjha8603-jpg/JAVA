package java_39_recursion;

import java.util.Scanner;

public class LinearSearchUsingRecursion {
    public static int targetIndex(int[] arr, int target, int index) {
        if (arr.length == 0) {
            return -1;
        }
        if (index == arr.length - 1) {
            if (arr[index] == target) {
                return index;
            } else {
                return -1;
            }
        }
        if (arr[index] == target) {
            return index;
        } else {
            return targetIndex(arr, target, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        if(n==0){
            System.out.print("No element is present in array");
            sc.close();
            return;
        }
        if (n < 0) {
            System.out.print("Please enter positve number");
            sc.close();
            return;
        }
        System.out.print("Enter elemnt of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your target element : ");
        int target = sc.nextInt();
        int index = targetIndex(arr, target, 0);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found At index : " + index);
        }
        sc.close();
    }
}
