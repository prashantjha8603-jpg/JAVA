package java_02_variable_and_data_types;
import java.util.Scanner;
public class Rupee_to_paise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter The Price in Rupees : ");
        double price = sc.nextDouble();
        price*=100;
        System.out.printf("Price in paise : %.0f", price);
        sc.close();

    }
}
