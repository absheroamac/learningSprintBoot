package encapsulation;

// Problem 1: Bank Account Management
// Create a BankAccount class with:

// Private fields: accountNumber, accountHolderName, balance.
// Public methods: deposit(amount), withdraw(amount), getBalance().
// Add validation:

// Ensure balance doesn’t go negative.
// Prevent withdrawal of amounts greater than the balance.


public class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName, double balance){

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String deposit(double amount){
        if(amount>0){
            this.balance+=amount;
            return "Successfull! new Balance is "+ this.balance;
        }
        else{
            return "Amount should be more than zero";
        }
    }

    public String withdraw(double amount){
        if(this.balance-amount<0){
            return "Insufficient Balance";
        }
        else{
            this.balance -= amount;
            return "Successfull! new Balance is "+this.balance;
        }
    }

    public double getBalance(){
        return this.balance;
    }



    
}