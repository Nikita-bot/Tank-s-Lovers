package sample.SignIn;

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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SignInController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Enter;

    @FXML
    private TextField mail;

    @FXML
    private PasswordField Password;

    @FXML
    void ClickEn(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/MainMenu/MainMenu.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root,700,400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
