package bonus_nw_1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<BankAccount> bankAccountList = new ArrayList<>();
        BankAccount bankAccount1 = new BankAccount("MD24AG000225100013104168", "Maria Sanchez", 1000);
        BankAccount bankAccount2 = new BankAccount("MD24AG000225100013104169", "Poul Murray", 2000);
        BankAccount bankAccount3 = new BankAccount("MD24AG000225100013104170", "Eva Mendez", 3000);
        bankAccountList.add(bankAccount1);
        bankAccountList.add(bankAccount2);
        bankAccountList.add(bankAccount3);


        Bank bank = new Bank(bankAccountList);

        bank.listingAllAccountsAndTheirBalances();
        System.out.println("--------------------------------------------------");
        bank.transactionsDepositAndWithdrawal(bankAccount1, 1000, 500);
        bank.transactionsDepositAndWithdrawal(bankAccount2, 1000, 250);
        bank.transactionsDepositAndWithdrawal(bankAccount3, 1000, 100);
        System.out.println("--------------------------------------------------");
        bank.displayAccountInfo(bankAccount1);
        System.out.println("--------------------------------------------------");
        bank.displayAccountInfo(bankAccount2);
        System.out.println("--------------------------------------------------");
        bank.displayAccountInfo(bankAccount3);
        System.out.println("--------------------------------------------------");

        bank.addAccountInBankCatalog(new BankAccount("MD24AG000225100013104171", "Patrik Lewis", 10000));
        System.out.println("--------------------------------------------------");
        bank.listingAllAccountsAndTheirBalances();
        System.out.println("--------------------------------------------------");


    }


}