package FrontEnd;

import javafx.fxml.FXML;

public class SelectionScreen
{
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
