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


    @FXML protected void AmountButtonHandle(ActionEvent event) throws Exception
    {
        Node node = (Node)event.getSource();
        String data = (String)node.getUserData();
        int amount = Integer.parseInt(data);
        Withdraw_Amount = amount;
        Text_Field_Amount.setText(data);
    }


    @FXML protected void BackButtonHandle(ActionEvent event) throws Exception
    {
        SceneSwitcher.root = FXMLLoader.load(getClass().getResource("SelectionScreen.fxml"));
        System.out.println("Switching to SelectionScreen.fxml");
        SceneSwitcher.SwitchToScene();
    }

    // Handles the Exit Button
    @FXML protected void ExitButtonHandle(ActionEvent event) throws Exception
    {
        // Switches back to Login Screen
        SceneSwitcher.root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        System.out.println("Switching to Login.fxml");
        SceneSwitcher.SwitchToScene();
    }
}
