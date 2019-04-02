package BackEnd;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Reader {

    public void updateCSV(String replace, String accountID, ArrayList<Account> accounts)
    {
        int row = findRow(accountID, accounts);
        try {
            File inputFile = new File("accounts.csv");

            // Read existing file
            CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
            List<String[]> csvBody = reader.readAll();
            // get CSV row column  and replace with by using row and column
            csvBody.get(row)[2] = replace;
            reader.close();

            // Write to CSV file which is open
            CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
            writer.writeAll(csvBody);
            writer.flush();
            writer.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public ArrayList<Account> readAccountsFromCSV()
    {
        ArrayList<Account> accounts = new ArrayList();
        try{
            CSVReader reader = new CSVReader(new FileReader("accounts.csv"));
            String[] nextLine;
            for(int i = 0; i < getLines(); i++)
            {
                nextLine = reader.readNext();
                if(nextLine != null)
                {
                    Account New = new Account(nextLine[0], nextLine[1], Integer.parseInt(nextLine[2]));
                    accounts.add(New);
//                    System.out.println(Arrays.toString(nextLine));
                }
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        return accounts;
    }

    public int getLines()
    {
        int result = 0;
        try{
            FileReader input = new FileReader("accounts.csv");
            LineNumberReader count = new LineNumberReader(input);
            while (count.skip(Long.MAX_VALUE) > 0)
            {
                // Loop just in case the file is > Long.MAX_VALUE or skip() decides to not read the entire file
            }

            result = count.getLineNumber() + 1;                                    // +1 because line index starts at 0

        } catch(Exception e) { System.out.println(e); }
        return result;
    }

    public int findRow(String accountID, ArrayList<Account> accounts)
    {
        int row = 0;
        for (int x = 0; x < accounts.size(); x++)
        {
            if (accounts.get(x).getAccountID().equals(accountID))
                break;
            row++;
        }
        return row;
    }

    public boolean accountExists(String accountID, String pin, ArrayList<Account> accounts)
    {
        boolean exists = false;

        for(int x = 0; x < accounts.size(); x++)
        {
            if (accounts.get(x).getAccountID().equals(accountID) && accounts.get(x).getPin().equals(pin))
            {
                exists = true;
            }
        }

        return exists;
    }

    public int getBalance(String accountID, ArrayList<Account> accounts)
    {
        int balance = 0;

        for(int x = 0; x < accounts.size(); x++)
        {
            if (accounts.get(x).getAccountID().equals(accountID))
            {
                balance = accounts.get(x).getBalance();
            }
        }

        return balance;
    }
}