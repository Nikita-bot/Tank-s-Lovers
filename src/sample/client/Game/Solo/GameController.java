package sample.client.Game.Solo;

import java.io.IOException;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import sample.client.Game.Движок.Mechanic;


public class GameController{
    @FXML
    private Stage stage;
    private Scene scene;

    @FXML
    private Button back;
    @FXML
    private Circle MyTank;
    @FXML
    private Rectangle barrier;

    private Mechanic m;

    @FXML
    private void initialize(){
        System.out.println("Inicialzie");
        m = new Mechanic();
        //barrier.
    }


    @FXML
    void ClickBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/sample/client/MainMenu/MainMenu.fxml"));
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
           // System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterY()!= -335) {
                MyTank.setCenterY(MyTank.getCenterY() - 5);
               // System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.A) {
            System.out.println("Left");
            //System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterX() != -325) {
                MyTank.setCenterX(m.moveLeft((int) MyTank.getCenterX()));
                //System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.S) {
            System.out.println("Down");
            //System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            if(MyTank.getCenterY() != 15) {
                MyTank.setCenterY(m.moveDown((int) MyTank.getCenterY()));
                //System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.D){
            System.out.println("Right");
           // System.out.println("y= " + MyTank.getCenterY()+ " x= " + MyTank.getCenterX());
            if(MyTank.getCenterX()!= 325) {
                MyTank.setCenterX(m.moveRight((int) MyTank.getCenterX()));
                //System.out.println("y= " + MyTank.getCenterY() + " x= " + MyTank.getCenterX());
            }
        }
        if(KE.getCode() == KeyCode.SHIFT) System.out.println("Piu");
    }
}
