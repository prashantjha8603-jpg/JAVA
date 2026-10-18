package java_30_dsa_in_java;

import java.util.Scanner;

public class FindAllNumbersAppearingTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }
        int arr[] = new int[n];
        int ans[] = new int[n + 1];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] <= 0 || arr[i] > n) {
                System.out.println("Enter number between 1 to " + n);
                sc.close();
                return;
            }
            ans[arr[i]]++;
        }
        System.out.print("Duplicate numbers: ");

        boolean found = false;
        for (int i = 0; i < n + 1; i++) {

            if (ans[i] == 2) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
        sc.close();
    }
}
