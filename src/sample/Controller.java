package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

public class Controller {
    @FXML private TextField Account_ID_Field;
    @FXML private PasswordField Password_Field;
    @FXML private Label Login_Validator;

    public String Account_ID;
    public String Password;

    private SceneInterface scene = new SceneSwitcher();

    @FXML protected void Submit_Button_Handler() throws Exception
    {

        Account_ID = Account_ID_Field.getText();
        Password = Password_Field.getText();

        System.out.println(
                "Login Attempt" +
                "\nAccount: " + Account_ID +
                "\nPassword: " + Password
        );

        // Login checker
        // This will need some sort of interface that checks with the CSV file or however you are
        //checking login information
        if (Account_ID.equals("Admin") && Password.equals("1234"))
        {
            System.out.println("Login Accepted, switching to FXML/SelectionScreen.fxml");

            // Sets new Stage
            scene.SwitchToScene("FXML/SelectionScreen.fxml");
        }
        else
        {
            Login_Validator.setText("Either Account ID or Pin is incorrect.");
            System.out.println("Login Failed");
        }
    }
}
