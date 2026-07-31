package java_12_constructors;

public class Account_ {
    String costomerName;
    int accnumber;
    String AccType;
    double balance;

    Account_(String name, int accno, String type, double bal) {
        costomerName = name;
        accnumber = accno;
        AccType = type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited : " + amount);
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
