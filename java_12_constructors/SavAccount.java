package java_12_constructors;

public class SavAccount extends Account_ {
    SavAccount(String name, int accno, String type, double bal){
        super(name, accno, type, bal);
    }

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