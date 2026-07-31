package java_11_inheritance;

public class CurrAcc extends Account {
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
