package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;

public class Withdraw {

    @FXML private Button Exit_Button;
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
        System.out.println("Switching to FXML/Confirmation.fxml");
        scene.SwitchToScene("FXML/Confirmation.fxml");

    }

    // Back button Handler
    // Just changes scenes to the selection screen
    @FXML protected void BackButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/SelectionScreen.fxml");
        scene.SwitchToScene("FXML/SelectionScreen.fxml");
    }

    // Handles the Exit Button
    // Just changes scenes to the Login screen
    @FXML protected void ExitButtonHandle() throws Exception
    {
        // Switches back to Login Screen
        System.out.println("Switching to FXML/Login.fxml");
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
