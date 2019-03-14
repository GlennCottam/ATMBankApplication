package FrontEnd;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Deposit {

    @FXML private TextField Text_Field_Amount;

    private SceneInterface scene = new SceneSwitcher();

    @FXML protected void BackButtonHandle() throws Exception
    {
        scene.SwitchToScene("FXML/SelectionScreen.fxml");
    }

    @FXML protected void ExitButtonHandle() throws Exception
    {
        scene.SwitchToScene("FXML/Login.fxml");
    }

    @FXML protected void ContinueButtonHandle() throws Exception
    {
        Confirmation.Previous_Scene_Name = "FXML/Deposit.fxml";
        Confirmation.Action_Value = "Deposit";
        Confirmation.Amount_Value = Integer.parseInt(Text_Field_Amount.getText());
        scene.SwitchToScene("FXML/Confirmation.fxml");
    }
}
