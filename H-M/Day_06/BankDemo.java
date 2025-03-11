// Customer class - Stores simple customer details and displays them
class Customer {
    int id;
    String name;
    int age;
    String phone;

    // Constructor to initialize customer details
    Customer(int i, String n, int a, String p) {
        id = i;
        name = n;
        age = a;
        phone = p;
    }

    // Method to display customer details
    void showCustomer() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }
}

// Bank class-Manages a balance and has deposit, withdraw, and balance check methods.
class Bank {
    double balance;

    // Constructor to set initial balance
    Bank(double b) {
        balance = b;
    }

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Method to check balance
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Main class
public class BankDemo {
    public static void main(String[] args) {
        // Create a customer
        Customer c1 = new Customer(11, "Siya", 24, "1234567890");
        c1.showCustomer();

        // Create a bank account with 10000 balance
        Bank myBank = new Bank(10000);

        // Performs deposit and withdrawal.
        myBank.showBalance();
        myBank.deposit(500);
        myBank.withdraw(12000);
        myBank.showBalance();//Displays balance.
    }
}
