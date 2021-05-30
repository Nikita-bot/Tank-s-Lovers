package sample.Game.Solo;

import java.io.IOException;

import com.sun.prism.paint.Color;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Game.Движок.Mechanic;

import static com.sun.prism.paint.Color.GREEN;


public class GameController{
    @FXML
    private Stage stage;
    private Scene scene;

    @FXML
    private Button back;
    @FXML
    private Circle MyTank;

    @FXML
    private void initialize(){
        System.out.println("Inicialzie");
    }


    @FXML
    void ClickBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/MainMenu/MainMenu.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root,700,400);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleKeyPressed(KeyEvent KE) {
        if(KE.getCode() == KeyCode.W) {
            System.out.println("Up");
            System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterY()!= -335) {
                MyTank.setCenterY(MyTank.getCenterY() - 5);
                System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.A) {
            System.out.println("Left");
            System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterX() != -325) {
                MyTank.setCenterX(MyTank.getCenterX() - 5);
                System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.S) {
            System.out.println("Down");
            System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            if(MyTank.getCenterY() != 15) {
                MyTank.setCenterY(MyTank.getCenterY() + 5);
                System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.D){
            System.out.println("Right");
            System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterX()!= 325) {
                MyTank.setCenterX(MyTank.getCenterX() + 5);
                System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.SHIFT) System.out.println("Piu");
    }
}
