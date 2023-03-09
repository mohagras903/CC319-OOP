package A1Q10;
public class Main {
    public static void main(String[] args) {
        Account testAccount = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        testAccount.withdraw(2500);
        testAccount.deposit(3000);
        System.out.println(testAccount.getBalance());
        System.out.println(testAccount.getMonthlyInterest());
        System.out.println(testAccount.getDateCreated());
    }
}