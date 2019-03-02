package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        // Grabs starting UI element
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        // Sets title
        primaryStage.setTitle("ATM Banking");

        // Creates scene (900px*500px)
        primaryStage.setScene(new Scene(root, 900, 500));

        // Shows first stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
