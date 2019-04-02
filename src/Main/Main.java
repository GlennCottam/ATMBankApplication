package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application
{
    public static Stage window;
    public static Scene MainScene;

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window = primaryStage;

        // Grabs starting UI element
        // To start at the start point of the application, set it to Login.fxml
        Parent root = FXMLLoader.load(getClass().getResource("/FrontEnd/FXML/Login.fxml"));

        // Sets title
        window.setTitle("ATM Banking Application");

        // Sets icon
        window.getIcons().add(new Image(getClass().getResourceAsStream("/icon.png")));

        // Creates scene (900px*500px)
//        window.setScene(MainScene);
        MainScene = new Scene(root, 900, 500);
        window.setScene(MainScene);

        // Shows first stage
        window.show();
    }
    // Launches App
    public static void main(String[] args) {
        launch(args);
    }
}
