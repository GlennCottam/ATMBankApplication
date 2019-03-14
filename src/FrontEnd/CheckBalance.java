package FrontEnd;

import Main.UserDataInterface;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckBalance
{
    @FXML private Label Balance_Label;

    private SceneInterface scene = new SceneSwitcher();

    @FXML public void initialize()
    {
        Balance_Label.setText("$" + Login.account.getBalance() + ".00");
//        Balance_Label.setText("$" + Balance_Value + ".00");
    }

    @FXML protected void BackButtonHandle() throws Exception
    {
        scene.SwitchToScene("FXML/SelectionScreen.fxml");
    }

    @FXML protected void ExitButtonHandle() throws Exception
    {
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
