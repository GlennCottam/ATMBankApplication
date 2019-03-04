package sample;

import javafx.fxml.FXML;

public class TransactionSuccess {

    private SceneInterface scene = new SceneSwitcher();

    @FXML protected void BackButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/SelectionScreen.fxml");
        scene.SwitchToScene("FXML/SelectionScreen.fxml");
    }

    @FXML protected void ExitButtonHandle() throws Exception
    {
        System.out.println("Switching to FXML/Login.fxml");
        scene.SwitchToScene("FXML/Login.fxml");
    }
}
