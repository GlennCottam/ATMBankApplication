package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneSwitcher implements SceneInterface
{

    public void SwitchToScene(String fxmlName) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlName));
        Main.window.setScene(new Scene(root, 900, 500));
    }
}
