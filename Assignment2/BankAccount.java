package Assignment2;

public class BankAccount {
    public int amount = 50000;
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.totalCash();
        BankAccount b2 = new SavingAccount();
        b2.totalCash();
        BankAccount b3 = new CurrentAccount();
        b3.totalCash();
    }
    public void totalCash() {
        System.out.println("Total cash is " + amount);
    }
}
class SavingAccount extends BankAccount{
    private int fixedDeposit = 10000;
    @Override
    public void totalCash(){
        System.out.println("Total Cash in Savings Account is "+ (amount+fixedDeposit));
    }
}
class CurrentAccount extends BankAccount {
    private int cashCredit = 20000;
    @Override
    public void totalCash(){
        System.out.println("Total cash in Current Account is "+ (amount+cashCredit));
    }
}
