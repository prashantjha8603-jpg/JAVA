package java_06_arrays_and_vector;

import java.util.Scanner;
import java.util.Vector;

public class ShoppingListOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<String> shoppingList = new Vector<>();

        System.out.println("Enter 5 shopping items:");

        for (int i = 0; i < 5; i++) {
            shoppingList.add(sc.nextLine());
        }
        System.out.println("Enter Item name to delete it : ");
        String deleteItem = sc.nextLine();
        shoppingList.remove(deleteItem);

        System.out.print("Enter index ( 0 to " + shoppingList.size() + " ) to add item : ");
        int addindex = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter item name : ");
        String addItem = sc.nextLine();

        shoppingList.add(addindex, addItem);

        System.out.print("Enter item name to add at end : ");
        String addItemEnd = sc.nextLine();

        shoppingList.add(addItemEnd);

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.print(shoppingList.get(i) + " ");
        }
        sc.close();
    }
}