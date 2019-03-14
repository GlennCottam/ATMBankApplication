package FrontEnd;

import Main.UserDataInterface;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.*;

public class Withdraw
{

    @FXML private TextField Text_Field_Amount;

    // Use this to get the proper withdraw amount.
    @FXML public int Withdraw_Amount;

    private SceneInterface scene = new SceneSwitcher();

    // Handles all the buttons with amounts
    // Grabs their data and parses them into an int
    @FXML protected void AmountButtonHandle(ActionEvent event)
    {
        Node node = (Node)event.getSource();        // Gets userData
        String data = (String)node.getUserData();   // Converts to string
        int amount = Integer.parseInt(data);        // Parses to Int
        Withdraw_Amount = amount;                   // Sets global variable
        Text_Field_Amount.setText(data);            // Sets the text field with the button data
    }

    // Continue button handler
    @FXML protected void ContinueButtonHandle() throws Exception
    {
        Confirmation.Previous_Scene_Name = "FXML/Withdraw.fxml";
        Confirmation.Amount_Value = Integer.parseInt(Text_Field_Amount.getText());
        Confirmation.Action_Value = "Withdraw";
        scene.SwitchToScene("FXML/Confirmation.fxml");

    }

    // Back button Handler
    // Just changes scenes to the selection screen
    @FXML protected void BackButtonHandle() throws Exception
    {
        scene.SwitchToScene("FXML/SelectionScreen.fxml");
    }

    // Handles the Exit Button
    // Just changes scenes to the Login screen
    @FXML protected void ExitButtonHandle() throws Exception
    {
        // Switches back to Login Screen
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
