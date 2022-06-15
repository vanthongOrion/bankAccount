import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int accountId;
    private double balance;
    private double annualInterestRate;
    private Date date;
    private ArrayList<Transaction> transactions;

    public Account(int accountId, double balance, double annualInterestRate){
        this.accountId = accountId;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;

        this.date = new Date();
        transactions = new ArrayList<Transaction>();
    }
    public boolean deposit(double amount){
        this.balance += amount;
        this.transactions.add(new Transaction('D',amount,balance,"Deposit : " + amount));
        return true;
    }

    public boolean withDraw(double amount){
        if (amount>this.balance) return false;
        else
            this.balance -= amount;
            this.transactions.add(new Transaction('W',amount,balance,"Withdraw : " + amount));
            return true;
    }

    public int countTransaction(char type){
        int count = 0;
        for(Transaction transaction:transactions)
            if (transaction.getType()==type)
                count+= 1;
        return count;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDate() {
        return date;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", transactions=" + transactions +
                this.date.toString() + '}';
    }
}
