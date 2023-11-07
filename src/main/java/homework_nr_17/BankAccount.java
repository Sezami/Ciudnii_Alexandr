package homework_nr_17;


public class BankAccount {
    private final String ownerName;
    private double balance;
    private static int nextAccountNumber = 1;
    private final int accountNumber;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public synchronized void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction failed. Amount should be positive");
            return;
        }

        balance += amount;
        System.out.println("Deposited " + amount + " to account " + accountNumber);
        notifyAll();
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Transaction failed. Amount should be positive");
            return;
        }

        while (amount > balance) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Transaction interrupted. Not sufficient funds on your bank account balance: " + balance);
                return;
            }
        }

        balance -= amount;
        System.out.println("Withdrew " + amount + " from account " + accountNumber);
    }

    public synchronized void transfer(BankAccount to, double amount) {
        if (amount <= 0) {
            System.out.println("Transaction failed. Amount should be positive");
            return;
        }

        while (amount > balance) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Transaction interrupted. Not sufficient funds on your bank account balance: " + balance);
                return;
            }
        }

        balance -= amount;
        to.deposit(amount);
        System.out.println("Transferred " + amount + " from account " + accountNumber + " to account " + to.accountNumber);
    }

    @Override
    public String toString() {
        return "BankAccount " +
                "Owner Name = " + ownerName +
                "|| balance = " + balance +
                "|| accountNumber = " + accountNumber + "\n";
    }
}


