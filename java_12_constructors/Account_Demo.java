package java_12_constructors;

public class Account_Demo {
    public static void main(String[] args) {
        System.out.println("Current Account");
        CurrAccount a1 = new CurrAccount("Prashant Jha", 101, "Current Account", 4500000);
        
        a1.deposit(5000);
        a1.withdraw(450000);
        a1.miniBalance();
        a1.displayBalance();

        System.out.println("\nSaving Account");
        SavAccount a2 = new SavAccount("Piyush Kumar", 201, "Saving Account", 32000);
        a2.deposit(59847);
        a2.interest(5);
        a2.withdraw(5475);
        a2.displayBalance();
    }
}
