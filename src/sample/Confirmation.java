package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Confirmation {

    @FXML private Button Continue_Button;
    @FXML private Button Back_Button;
    @FXML private Button Exit_Button;

    @FXML private TextField Amount_Field;

    private SceneInterface scene = new SceneSwitcher();

    @FXML protected void ContinueButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/TransactionSuccess.fxml");
        scene.SwitchToScene("FXML/TransactionSuccess.fxml");
    }

    @FXML protected void BackButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/Withdraw.fxml");
        scene.SwitchToScene("FXML/Withdraw.fxml");
    }

    @FXML protected void ExitButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/Login.fxml");
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
