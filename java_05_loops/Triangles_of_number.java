package java_05_loops;
import java.util.Scanner;
public class Triangles_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row : ");
        int row = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= row; i++) {
            int j=1;
            int x=row-1;
            while(i<=x){
                System.out.print(" \t");
                x--;
            }
            while (j <= i) {
                System.out.print(num + "\t");
                num++;
                j++;
            }
            System.out.println();
        }
        sc.close();
    }
}
