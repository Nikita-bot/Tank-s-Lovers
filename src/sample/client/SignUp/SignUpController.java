package sample.client.SignUp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    protected String Em;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Register;

    @FXML
    private TextField RegEmail;

    @FXML
    private PasswordField RegPassword;

    @FXML
    private TextField NikName;

    @FXML
    private Label warning;

    @FXML
    void ClickReg(ActionEvent event) {
        if(RegEmail.getText() != "" && RegPassword.getText() != "" && NikName.getText() != "") {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/client/SignIn/SignIn.fxml"));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root, 700, 400));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            warning.setText("Все поля должны быть запонены!");
        }

    }


}
