package Main;

public class UserData implements UserDataInterface
{
    private int balance = 0;

    // Login function
    // Function is used to login to users account and edit their entry
    public boolean LoginAttempt(String AccountID, String PIN)
    {
        if(AccountID.equals("Admin") && PIN.equals("1234"))
        {
            System.out.println("Logged in As:  " + AccountID);
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
    }

    // Function adds money to users balance
    public void deposit(int value)
    {
        balance = balance + value;
    }

    // Retrieves Balance as an INT
    public int getBalance()
    {
        return balance;
    }
}
