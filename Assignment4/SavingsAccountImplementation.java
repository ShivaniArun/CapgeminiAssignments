package Assignment4;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(){}
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
class IllegalBankTransactionException extends Exception{
    public IllegalBankTransactionException() {
    }
    public IllegalBankTransactionException(String message) {
        super(message);
    }
}
public class SavingsAccountImplementation {
    public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {
        SavingAccount s = new SavingAccount(101, 1000);
        s.withdraw(10001);
        try{
            s.withdraw(-10);
        } catch(IllegalBankTransactionException e){
            e.printStackTrace();
        }
    }
}
class SavingAccount{
    private int id;
    private double balance;

    public SavingAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    double withdraw(double amount) throws  InsufficientBalanceException , IllegalBankTransactionException{
        if(amount > 0){
            if(balance < amount){
                throw new InsufficientBalanceException(this.id +" has insufficient balance");
            }
            else {
                return (this.balance - amount);
            }
        }
        else {
            throw new IllegalBankTransactionException();
        }
    }
    double deposit(double amount){
        return (this.balance + amount);
    }
}
