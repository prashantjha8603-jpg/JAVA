package java_04_control_statements;
import java.util.*;
public class Discount_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of purchase \nEnter 1 for 'Mill cloth'\nEnter 2 for 'Handllom items");
        System.out.print("Enter number : ");
        int x = sc.nextInt();
        System.out.println("Enter Purchase Amount : ");
        double purchase_amount = sc.nextDouble();
        switch (x) {
            case 1:
                if (purchase_amount <= 100 && purchase_amount > 0) {
                    System.out.println("Your total amount paid to be " + purchase_amount);
                } else if (purchase_amount <= 200 && purchase_amount > 101) {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.95);
                } else if (purchase_amount <= 300 && purchase_amount > 201) {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.925);
                } else if (purchase_amount < 0) {
                    System.out.print("You entered Invailid purchase amount");
                } else {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.9);
                }
                break;
            case 2:
                if (purchase_amount <= 100 && purchase_amount > 0) {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.95);
                } else if (purchase_amount <= 200 && purchase_amount > 101) {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.925);
                } else if (purchase_amount <= 300 && purchase_amount > 201) {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.9);
                } else if (purchase_amount < 0) {
                    System.out.print("You entered Invailid purchase amount");
                } else {
                    System.out.println("Your total amount paid to be " + purchase_amount * 0.85);
                }
                break;
            default:
                System.out.println("You enter wrong type of purchase");
                break;
        }
        sc.close();
    }
}
