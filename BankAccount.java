
public class BankAccount {

    // Field to store the current balance
    private final double currentBalance; //Private access modifier is used to protect data within a class

    // Constructor to initialize the balance "m" which is the argument. Public access modifier means the method can be accessible outside the define class
    public BankAccount(double m) {
        currentBalance = m;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating BankAccount instances
        BankAccount maryAccount = new BankAccount(200);
        BankAccount johnAccount = new BankAccount(1000);
        
        // Printing out the current balances
        System.out.println("John's current balance is " + johnAccount.currentBalance);
        System.out.println("Mary's current balance is " + maryAccount.currentBalance);
    }
}
