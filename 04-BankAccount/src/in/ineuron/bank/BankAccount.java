package in.ineuron.bank;
import java.util.Scanner;

	public class BankAccount {
	    private String accountNumber;
	    private double balance;

	    public BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("INR." + amount + " deposited. New balance: INR." + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("INR." + amount + " withdrawn. New balance: " + balance);
	        } else {
	            System.out.println("Insufficient funds. Current balance: INR." + balance);
	        }
	    }

	    public void checkBalance() {
	        System.out.println("Current balance: INR." + balance);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter account number: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("Enter initial balance: INR.");
	        double initialBalance = scanner.nextDouble();
	        BankAccount account = new BankAccount(accountNumber, initialBalance);

	        while (true) {
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter deposit amount: INR.");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter withdrawal amount: INR.");
	                    double withdrawalAmount = scanner.nextDouble();
	                    account.withdraw(withdrawalAmount);
	                    break;
	                case 3:
	                    account.checkBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank You. Goodbye!");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	            }
	        }
	    }
	}

