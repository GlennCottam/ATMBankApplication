package Main;

import BackEnd.Reader;
import BackEnd.Account;
import java.util.ArrayList;

public class UserData implements UserDataInterface
{
    private Reader r = new Reader();
    private ArrayList<Account> Accounts = r.readAccountsFromCSV();
    private int balance = 0;
    private String accountName = "";

    // Login function
    // Function is used to login to users account and edit their entry
    public boolean LoginAttempt(String accountID, String PIN)
    {
        System.out.println(Accounts);
        if(r.accountExists(accountID, PIN, Accounts))
        {
            System.out.println("Logged in As:  " + accountID);
            balance = r.getBalance(accountID, Accounts);
            accountName = accountID;
            return true;
        }
        else
        {
            System.out.println("Login Failed");
            return false;
        }
    }

    // Function removes value from the users balance
    public void withdraw(int value)
    {
        balance = balance - value;
        r.updateCSV(Integer.toString(balance), accountName, Accounts);
    }

    // Function adds money to users balance
    public void deposit(int value)
    {
        balance = balance + value;
        r.updateCSV(Integer.toString(balance), accountName, Accounts);
    }

    // Retrieves Balance as an INT
    public int getBalance()
    {
        return balance;
    }
}
