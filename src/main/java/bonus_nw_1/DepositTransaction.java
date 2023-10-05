package bonus_nw_1;

public class DepositTransaction implements Transaction {
    private final BankAccount account;
    private final int amount;

    public DepositTransaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }


    @Override
    public void process() {
        account.deposit(amount);

    }

}

