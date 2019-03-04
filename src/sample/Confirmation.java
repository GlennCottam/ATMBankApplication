package sample;

import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class Confirmation {

    @FXML private Button Continue_Button;
    @FXML private Button Back_Button;
    @FXML private Button Exit_Button;

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
            CheckBalance.Balance_Value = CheckBalance.Balance_Value + Amount_Value;
            System.out.println("Added " + Amount_Value + " To Balance");
        }
        else if(Action_Value == "Withdraw")
        {
            CheckBalance.Balance_Value = CheckBalance.Balance_Value - Amount_Value;
            System.out.println("Removed " + Amount_Value + " From Balance");
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
