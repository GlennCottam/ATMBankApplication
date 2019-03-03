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


    @FXML protected void WithdrawButtonHandle(ActionEvent event) throws Exception
    {
        // Switches to Withdraw Screen
        System.out.println("Switching to Withdraw.fxml");
        SceneSwitcher.root = FXMLLoader.load(getClass().getResource("Withdraw.fxml"));
        SceneSwitcher.SwitchToScene();
    }

    @FXML protected void DepositButtonHandle(ActionEvent event)
    {
        // Switches to Deposit Screen
        System.out.println("Switching to Deposit.fxml");
    }

    @FXML protected void CheckBalanceHandle(ActionEvent event)
    {
        // Switches to Deposit Screen
        System.out.println("Switching to CheckBalance.fxml");
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
