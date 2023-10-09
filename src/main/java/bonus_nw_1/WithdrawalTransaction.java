package bonus_nw_1;

public class WithdrawalTransaction implements Transaction {
    private final BankAccount account;
    private final int amount;

    public WithdrawalTransaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void process() {
        account.withdrawal(amount);
    }
}

