package Main;

public interface UserDataInterface
{
    boolean LoginAttempt(String AccountID, String PIN);
    void withdraw(int value);
    void deposit(int value);
    int getBalance();
}
