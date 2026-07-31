package java_11_inheritance;

public class Account {
    String costomerName;
    int accnumber;
    String AccType;
    double balance;

    void initializion(String name, int accno, String type, double bal) {
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
