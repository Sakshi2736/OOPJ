 class BankBalanceTest {
        double balance;
        
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + " dollars.");
            System.out.println("New balance: " + balance);
        }
        
        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " dollars.");
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        }
        
        void checkBalance() {
            System.out.println("Current balance: " + balance);
        }
    }

    class BankBalance{
        public static void main(String[] args) {
    BankBalanceTest myAccount = new BankBalanceTest();
    myAccount.deposit(1000);
    myAccount.withdraw(650);
    myAccount.checkBalance();  
}
    }