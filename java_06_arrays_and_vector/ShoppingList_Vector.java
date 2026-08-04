package java_06_arrays_and_vector;
import java.util.Scanner;
import java.util.Vector;

public class ShoppingList_Vector {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Vector<String> shoppingList = new Vector<>();

        System.out.println("Enter your 5 Shopping items :");

        for (int i = 0; i < 5; i++) {

            shoppingList.add(sc.nextLine());

        }

        System.out.println("Shopping List : ");

        for (int i = 0; i < shoppingList.size(); i++) {

            System.out.print(shoppingList.get(i) +" ");

        }
        sc.close();
    }

}
