package bonus_nw_1;


import java.util.*;

public class BankAccount {
    private String accountNumber;
    private String accountOwnerName;
    private double accountBalance;
    private static final Set<String> accountNumberSet = new HashSet<>();

    public BankAccount(String accountNumber, String accountOwnerName, double accountBalance) {
        if (!isAccountNumberUnique(accountNumber)) {
            System.out.println("Account number already exists. Please add a unique account number.");
            return;
        }
        if (!isValidateAccountNumber(accountNumber)) {
            System.out.println("Account number is not valid. Account number must be 24 characters long and start with MD");
            return;
        }
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.accountBalance = accountBalance;
        accountNumberSet.add(accountNumber);


    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Dear: " + accountOwnerName + ", Account: " + accountNumber + " was successful deposit with amount: " + amount + " USD" + "\n" + " Your account balance is: " + accountBalance + " USD");
        } else {
            System.out.println("Deposit failed, please enter a positive amount");
        }
    }

    public void withdrawal(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Dear: "+ accountOwnerName + ", From account: " + accountNumber + " was successful withdrawal amount: " + amount + " USD" + "\n" + " Your account balance is: " + accountBalance + " USD");
        } else {
            System.out.println("Withdrawal failed. You have insufficient funds.");
        }
    }

    public void checkAccountBalance() {
        System.out.println("Your account balance is: " + accountBalance + " USD");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public void setAccountBalance(double accountBalance) {
        if (accountBalance >= 0) {
            this.accountBalance = accountBalance;
            System.out.println("Account balance is: " + accountBalance + " USD");
        } else {
            System.out.println("Invalid account balance. Account balance cannot be negative");
        }
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public double getAccountBalance() {
        return accountBalance;


    }

    private boolean isAccountNumberUnique(String accountNumber) {
        return !accountNumberSet.contains(accountNumber);
    }

    private boolean isValidateAccountNumber(String accountNumber) {
        return accountNumber.length() == 24 && accountNumber.startsWith("MD");
    }

}

