package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;


public class SelectionScreen {
    @FXML private Button Withdraw_Button;
    @FXML private Button Deposit_Button;
    @FXML private Button Check_Balance;
    @FXML private Button Exit_Button;

    private SceneInterface scene = new SceneSwitcher();


    @FXML protected void WithdrawButtonHandle() throws Exception
    {
        // Switches to Withdraw Screen
        System.out.println("Switching to FXML/Withdraw.fxml");
        scene.SwitchToScene("FXML/Withdraw.fxml");
    }

    @FXML protected void DepositButtonHandle()
    {
        // Switches to Deposit Screen
        System.out.println("Switching to FXML/Deposit.fxml");
    }

    @FXML protected void CheckBalanceHandle()
    {
        // Switches to Deposit Screen
        System.out.println("Switching to FXML/CheckBalance.fxml");
    }

    // Handles the Exit Button
    @FXML protected void ExitButtonHandle() throws Exception
    {
        // Switches back to Login Screen
        System.out.println("Switching to FXML/Login.fxml");
        scene.SwitchToScene("FXML/Login.fxml");
    }

}
