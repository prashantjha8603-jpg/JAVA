package java_For_College_work;

import java.util.Scanner;

public class UserId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your user name : ");
        String userId = sc.nextLine();
        String userId2 = "admin";
        System.out.print("Enter your password : ");
        String password2 = sc.nextLine();
        String password = "12345";
        if (userId2.equals(userId) && password2.equals(password)) {
            System.out.println("FUCK ME ");
        } else {
            System.out.println("FUCK YOU ");
        }
        sc.close();
    }
}
