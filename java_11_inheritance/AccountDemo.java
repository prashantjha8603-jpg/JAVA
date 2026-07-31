package java_11_inheritance;

public class AccountDemo {
    public static void main(String[] args) {
        System.out.println("Current Account");
        CurrAcc a1 = new CurrAcc();
        a1.initializion("Prashant Jha", 101, "Current Account", 4500000);
        a1.deposit(5000);
        a1.withdraw(450000);
        a1.miniBalance();
        a1.displayBalance();

        System.out.println("\nSaving Account");
        SavAcc a2 = new SavAcc();
        a2.initializion("Piyush Kumar", 201, "Saving Account", 32000);
        a2.deposit(5647);
        a2.interest(5);
        a2.withdraw(5437875);
        a2.displayBalance();
    }
}
