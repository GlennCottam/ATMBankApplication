package FrontEnd;

import Main.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class SceneSwitcher implements SceneInterface
{
    public void SwitchToScene(String fxmlName) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlName));
        System.out.println("Switching to: " + fxmlName);
        Main.MainScene.setRoot(root);
        Main.window.setScene(Main.MainScene);
        Main.window.minWidthProperty().bind(Main.MainScene.widthProperty());
        Main.window.minHeightProperty().bind(Main.MainScene.heightProperty());
    }
}
