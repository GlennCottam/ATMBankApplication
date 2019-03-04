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
        scene.SwitchToScene("FXML/Withdraw.fxml");
    }

    @FXML protected void DepositButtonHandle() throws Exception
    {
        // Switches to Deposit Screen
        scene.SwitchToScene("FXML/Deposit.fxml");
    }

    @FXML protected void CheckBalanceHandle() throws Exception
    {
        // Switches to Deposit Screen
        scene.SwitchToScene("FXML/CheckBalance.fxml");
    }

    // Handles the Exit Button
    @FXML protected void ExitButtonHandle() throws Exception
    {
        // Switches back to Login Screen
        scene.SwitchToScene("FXML/Login.fxml");
    }

}
