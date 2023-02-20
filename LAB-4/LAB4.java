import java.util.ArrayList;
import java.util.Scanner;

public class LAB4 {
    // declaring global variables
    private static int accountNumber;
    private static String accountHolderName;
    private static double accountBalance;
    private static ArrayList<String> transactions = new ArrayList<>();

    public static void initializeCustomer() {
        //creating function to initialize cutomer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNumber = input.nextInt();
        input.nextLine(); // Consume newline left-over
        System.out.print("Enter account holder name: ");
        accountHolderName = input.nextLine();
        System.out.print("Enter initial account balance: ");
        accountBalance = input.nextDouble();
        transactions.add("Initial balance: " + accountBalance);
        System.out.println("Customer created successfully.");
    }

    public static void depositMoney() {
        //creating funtion to deposit money
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        accountBalance += depositAmount;
        transactions.add("Deposit: " + depositAmount);
        System.out.println("Deposit successful, Your New balance is " + accountBalance);
    }

    public static void withdrawMoney() {
        // creating function to withdraw money
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        if (withdrawAmount > accountBalance) {
            System.out.println("Insufficient balance, Your Withdrawal unsuccessful.");
        } else {
            accountBalance -= withdrawAmount;
            transactions.add("Withdrawal: " + withdrawAmount);
            System.out.println("Withdrawal successful, Your New balance is " + accountBalance);
        }
    }

    public static void printTransactions() {
        //creating function to print transactions
        System.out.println("Transaction history:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public static void printAccountSummary() {
        //creating funtion to print account summary
        System.out.println("Account summary:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            //creating a menu
            System.out.println("\nMenu:");
            System.out.println("1. Initialize customer");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Print transactions");
            System.out.println("5. Print account summary");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                //switch case for selecting from the menu
                case 1:
                    initializeCustomer();
                    break;

                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    printTransactions();
                    break;
                case 5:
                    printAccountSummary();
                    break;
                case 0:
                    System.out.println("Thankyou vivit again!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}

