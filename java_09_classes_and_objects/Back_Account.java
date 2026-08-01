package java_09_classes_and_objects;

import java.util.*;

public class Back_Account {
    String depositorName;
    int accountNumber;
    String accountType;
    double balance;

    void assinValue(String name, int acc_no, String acc_type, double bal) {
        depositorName = name;
        accountNumber = acc_no;
        accountType = acc_type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposit = " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrow : " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Depositor Name : " + depositorName);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back_Account account = new Back_Account();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number : ");
        int acc_no = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Type : ");
        String acc_type = sc.nextLine();

        System.out.print("Enter Initial Balance : ");
        double bal = sc.nextDouble();

        account.assinValue(name, acc_no, acc_type, bal);

        System.out.print("Enter Deposit Amount : ");
        double dep_amount = sc.nextDouble();

        account.deposit(dep_amount);

        System.out.print("Enter Withdraw Amount : ");
        double withdrow_amount = sc.nextDouble();

        account.withdraw(withdrow_amount);
        System.out.println("\nAccount Details");

        account.display();
        sc.close();
    }
}