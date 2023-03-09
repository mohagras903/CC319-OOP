package A1Q10;
import java.util.Date;
public class Account {

    private int id = 0;
    private double balance = 0;
    static private double annualInterestRate = 0;
    private Date DateCreated = new Date();

    public Account() {

    }

    public Account(int id, double balance) {
        setId(id);
        setBalance(balance);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    static public void setAnnualInterestRate(double annualInterestRate) {

        Account.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    static public double getMonthlyInterestRate() {
        return (annualInterestRate/100)/12;
    }

     public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
