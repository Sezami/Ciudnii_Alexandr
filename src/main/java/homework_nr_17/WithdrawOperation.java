package homework_nr_17;

public class WithdrawOperation implements Runnable {
    private final BankAccount bankAccount;
    private final double amount;

    public WithdrawOperation(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(amount >0 && amount <= bankAccount.getBalance())
            bankAccount.withdraw(amount);
    }
}


