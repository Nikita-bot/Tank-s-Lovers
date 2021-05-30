package sample.StartPage;

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


public class Controller{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button RegBtn;

    @FXML
    private Button EnterBtn;

    @FXML
    private TextField Email;

    @FXML
    private PasswordField Password;

    @FXML
    private Label warning;

    @FXML
    public void ClickEnter(ActionEvent Event) {
        if(Email.getText() != "" && Password.getText() != "") {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/sample/MainMenu/MainMenu.fxml"));
                Stage stage = (Stage) ((Node) Event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root, 700, 400));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            warning.setText("Поля не могут быть пустыми!");
        }
    }

    @FXML
    public void ClickReg(ActionEvent Event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/SignUp/SignUp.fxml"));
            Stage stage = (Stage) ((Node)Event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root,700,400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
