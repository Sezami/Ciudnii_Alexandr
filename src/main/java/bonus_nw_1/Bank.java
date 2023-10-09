package bonus_nw_1;


import java.util.List;

public class Bank {
    List<BankAccount> bankAccountList;

    public Bank(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public void addAccountInBankCatalog(BankAccount newBankAccount) {
        bankAccountList.add(newBankAccount);
        System.out.println("Account added: " + newBankAccount.getAccountNumber() + "\n" + " Account owner: " + newBankAccount.getAccountOwnerName() + "\n" + " Account balance: " + newBankAccount.getAccountBalance() + " USD");

    }

    public void transactionsDepositAndWithdrawal(BankAccount account, int amountDeposit, int amountWithdrawal) {
        DepositTransaction depositTransaction = new DepositTransaction(account, amountDeposit);
        depositTransaction.process();
        WithdrawalTransaction withdrawalTransaction = new WithdrawalTransaction(account, amountWithdrawal);
        withdrawalTransaction.process();

    }




    public void displayAccountInfo(BankAccount bankAccount) {
        System.out.println("Account number: " + bankAccount.getAccountNumber() + "\n" +
                " Account owner: " + bankAccount.getAccountOwnerName() + "\n" +
                " Account balance: " + bankAccount.getAccountBalance());
    }

    public void listingAllAccountsAndTheirBalances() {
        for (BankAccount bankAccount : bankAccountList) {
            displayAccountInfo(bankAccount);

        }

    }




}






