package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;

public class Controller {
    @FXML private TextField Account_ID_Field;
    @FXML private PasswordField Password_Field;
    @FXML private Label Login_Validator;

    public String Account_ID;
    public String Password;

    @FXML protected void Submit_Button_Handler(ActionEvent event) throws Exception
    {

        Account_ID = Account_ID_Field.getText();
        Password = Password_Field.getText();

        System.out.println(
                "Login Attempt" +
                "\nAccount: " + Account_ID +
                "\nPassword: " + Password
        );

        if (Account_ID.equals("Admin") && Password.equals("1234"))
        {
            Login_Validator.setText("Login is Valid!");
            System.out.println("Login Successful");

            // Sets new Stage
            SceneSwitcher.root = FXMLLoader.load(getClass().getResource("SelectionScreen.fxml"));
            SceneSwitcher.SwitchToScene();


        }
        else
        {
            Login_Validator.setText("Either Account ID or Pin is incorrect.");
            System.out.println("Login Failed");
        }

        System.out.println("-------------------");
    }
}
