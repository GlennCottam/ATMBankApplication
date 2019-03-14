package FrontEnd;

import Main.UserData;
import Main.UserDataInterface;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Login
{
    @FXML private TextField Account_ID_Field;
    @FXML private PasswordField Password_Field;
    @FXML private Label Login_Validator;

    public String Account_ID;
    public String Password;

    public static UserDataInterface account = new UserData();

    private SceneInterface scene = new SceneSwitcher();

    @FXML protected void Submit_Button_Handler() throws Exception
    {
        // Gets text from fields
        Account_ID = Account_ID_Field.getText();
        Password = Password_Field.getText();

        // Prints login attempt
//        System.out.println(
//                "Login Attempt" +
//                "\nAccount: " + Account_ID +
//                "\nPassword: " + Password
//        );

        boolean SuccessfulLogin = account.LoginAttempt(Account_ID, Password);

        if(SuccessfulLogin)
        {
            scene.SwitchToScene("FXML/SelectionScreen.fxml");
        }
        else
        {
            Login_Validator.setText("Either Account ID or Pin is incorrect.");
            Login_Validator.setVisible(true);
        }


        // Login checker
        // This will need some sort of interface that checks with the CSV file or however you are
        //checking login information
//        if (Account_ID.equals("Admin") && Password.equals("1234"))
//        {
//            System.out.println("Login Accepted!");
//
//            // Sets new Stage
//            scene.SwitchToScene("FXML/SelectionScreen.fxml");
//        }

        // Login Failed
//        else
//        {
//            Login_Validator.setText("Either Account ID or Pin is incorrect.");
//            Login_Validator.setVisible(true);
//            System.out.println("Login Failed");
//        }
    }
}
