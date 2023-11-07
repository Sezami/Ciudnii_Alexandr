package homework_nr_17;

public class TransferOperation implements Runnable {
    private final BankAccount from;
    private final BankAccount to;
    private final double amount;

    public TransferOperation(BankAccount from, BankAccount to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }


    @Override
    public synchronized void run() {
        if (amount > 0 && amount <= from.getBalance())
            from.transfer(to, amount);
        System.out.println("Transferred " + amount + " from account " + from.getAccountNumber() + " to account " + to.getAccountNumber());
    }

}
