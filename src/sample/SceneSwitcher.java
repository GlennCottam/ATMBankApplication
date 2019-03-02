package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneSwitcher {

    // To Switch to new Scene:
        // SceneSwitcher.root = FXMLLoader.load(getClass().getResource("fxml.fxml"));
        // SceneSwitcher.SwitchToScene();

    public static Parent root;

    public static void SwitchToScene() throws Exception
    {
        Main.window.setScene(new Scene(root, 900, 500));
    }
}
