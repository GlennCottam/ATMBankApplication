package FrontEnd;

import Main.UserData;
import Main.UserDataInterface;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Confirmation
{

    @FXML private Label Amount_Field;
    @FXML private Label Action_Label;

    private SceneInterface scene = new SceneSwitcher();

    public static String Previous_Scene_Name;
    public static int Amount_Value;
    public static String Action_Value;

    @FXML public void initialize()
    {
        Action_Label.setText(Action_Value);
        Amount_Field.setText("$" + Amount_Value + ".00");
    }

    @FXML protected void ContinueButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/TransactionSuccess.fxml");
        scene.SwitchToScene("FXML/TransactionSuccess.fxml");

        if(Action_Value == "Deposit")
        {
            Login.account.deposit(Amount_Value);
            System.out.println("Current Balance: $" + Login.account.getBalance() + ".00");
//            CheckBalance.Balance_Value = CheckBalance.Balance_Value + Amount_Value;
//            System.out.println("Added " + Amount_Value + " To Balance");
        }
        else if(Action_Value == "Withdraw")
        {
            Login.account.withdraw(Amount_Value);
            System.out.println("Current Balance: $" + Login.account.getBalance() + ".00");
//            CheckBalance.Balance_Value = CheckBalance.Balance_Value - Amount_Value;
//            System.out.println("Removed " + Amount_Value + " From Balance");
        }
        else
        {
            System.out.println("Error: Shits fucked");
        }

    }

    @FXML protected void BackButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/Withdraw.fxml");
        scene.SwitchToScene(Previous_Scene_Name);
    }

    @FXML protected void ExitButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/Login.fxml");
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
