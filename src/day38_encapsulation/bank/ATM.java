package day38_encapsulation.bank;

public class ATM {

    // this file will be getter only (no setter) --> can not change any info
    private long accountNumber;
    private double balance;

    public ATM(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
