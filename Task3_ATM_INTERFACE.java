// ATM USER INTERFACE
import java.util.Scanner;

class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double checkBalance() {
        return balance;
    }
    public boolean Withdrawing(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
    public void Depositing(double amount) {
        balance += amount;
    }
}
class ATM {
    private Scanner sc;
    private BankAccount account;
    public ATM(BankAccount account) {
        this.account = account;
        this.sc = new Scanner(System.in);
    }
    public void menu() {
        System.out.println("1. Check Balance\n2. Deposit money\n3. Withdraw money\n4. Exit");
    }
    public void ChoiceSelect(int choice) {
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                System.out.print("Enter amount to be deposited: ");
                deposit();
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                withdraw();
                break;
            case 4:
                System.out.println("Exiting...");
                System.out.println("Thank you for using the ATM!");
                System.exit(0);
                sc.close();
            default:
                System.out.println("Invalid option.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + account.checkBalance());
    }

    public void deposit() {
        double amount = sc.nextDouble();
        if (amount > 0) {
            account.Depositing(amount);
            System.out.println("The money deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    public void withdraw() {
        double amount = sc.nextDouble();
        if (amount > 0) {
            if(account.Withdrawing(amount)){
                System.out.println("Transaction successful. Please collect your money.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

public class Task3_ATM_INTERFACE{
    public static void main(String[] args) {
        System.out.println("Enter initialBalance: ");
        Scanner sc = new Scanner(System.in);
        double initialBalance = sc.nextDouble();
        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);
        while (true) {
            atm.menu();
            System.out.print("Choose the operation you want to perform: ");
            int choice = sc.nextInt();
            atm.ChoiceSelect(choice);
        }
    }
}




