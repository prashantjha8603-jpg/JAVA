package java_11_inheritance;

public class SavAcc extends Account {
    void interest(double rate) {
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest Added : " + interest);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}
