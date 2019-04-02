package BackEnd;

public class Account {

    private String accountID;
    private String pin;
    private int balance;

    public Account() {
    }

    public Account(String accountID, String pin, int balance) {
        this.accountID = accountID;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountID=" + accountID + ", pin=" + pin + ", balance=" + balance + "]";
    }
}
