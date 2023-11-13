package homework_nr_17;



import java.util.List;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Boris Johnson", 1000);
        BankAccount account2 = new BankAccount("Donald Trump", 1000);
        List<BankAccount> accounts = List.of(account1, account2);
        System.out.println(accounts);


        Thread depositThread = new Thread(new DepositOperation(account1, 1000));
        depositThread.setName("Deposit Thread");
        System.out.println(Constants.ANSI_GREEN + "Starting deposit thread " + Thread.currentThread().getName() + " Account: " + account1.getOwnerName() + " Balance: " + account1.getBalance()
        + " Account: " + account2.getOwnerName() + " Balance: " + account2.getBalance());
        System.out.println("_________________________________________________________________________________");

        Thread withdrawThread = new Thread(new WithdrawOperation(account1, 500));
        withdrawThread.setName("Withdraw Thread ");
        System.out.println(Constants.ANSI_BLUE + "Starting withdraw thread " + Thread.currentThread().getName() + " Account: " + account1.getOwnerName() + " Balance: " + account1.getBalance()
                + " Account: " + account2.getOwnerName() + " Balance: " + account2.getBalance());
        System.out.println("_________________________________________________________________________________");

        Thread transferThread = new Thread(new TransferOperation(account1, account2, 250));
        transferThread.setName("Transfer Thread ");
        System.out.println(Constants.ANSI_PURPLE + "Starting transfer thread " + Thread.currentThread().getName() + " Account: " + account1.getOwnerName() + " Balance: " + account1.getBalance()
                + " Account: " + account2.getOwnerName() + " Balance: " + account2.getBalance());
        System.out.println("_________________________________________________________________________________");

        depositThread.start();
        withdrawThread.start();
        transferThread.start();


        System.out.println("Final account balances: " + account1.getBalance() + " " + account2.getBalance());


    }
}