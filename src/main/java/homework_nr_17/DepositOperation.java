package homework_nr_17;

public class DepositOperation implements Runnable {
private final BankAccount bankAccount;
private final double amount;

    public DepositOperation(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        if(amount > 0)
            bankAccount.deposit(amount);

        }

    }
