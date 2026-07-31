package java_12_constructors;

public class CurrAccount extends Account_ {
    CurrAccount(String name, int accno, String type, double bal) {
        super(name, accno, type, bal);
    }

    double mini = 1000;
    double charge = 100;

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw amount : " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void miniBalance() {
        if (balance < mini) {
            balance -= charge;
            System.out.println("Service Charge Deducted: " + charge);
        }
    }
}