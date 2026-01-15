package zad2;

public record BankAccount(String accountNumber, double balance) {


    public BankAccount(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public BankAccount withInterest(double percentage) {
        double newBalance = this.balance + (this.balance * percentage / 100);

        return new BankAccount(this.accountNumber, newBalance);
    }
}
