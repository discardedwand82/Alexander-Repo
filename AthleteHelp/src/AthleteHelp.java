/*
Alexander Abrams
CSC 200
 */


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.util.Optional;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class AthleteHelp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        int realPass = 1234;
        String realUser = "Bob";

        int count = 0;
        while(count<1){

            System.out.print(count);

            TextInputDialog user = new TextInputDialog();
            TextInputDialog pass = new TextInputDialog();

            user.setTitle("Login");
            pass.setTitle("Password");

            user.setContentText("Enter Your Username: ");
            pass.setContentText("Enter Your Numbers Only Password: ");

            Optional<String>uUser=user.showAndWait();
            Optional<String>uPass=pass.showAndWait();

            String uUserFinal = uUser.get();
            String uPassFinal = uPass.get();

            int passInt = Integer.parseInt(uPassFinal);

            if(uUserFinal.equals(realUser) && uPassFinal.equals(realPass)){

           }else if(uUserFinal != realUser){
                Alert uAlert = new Alert(Alert.AlertType.INFORMATION);
                uAlert.setTitle("Wrong User");
                uAlert.setContentText("Invalid Username");
                uAlert.showAndWait();
            }

            System.out.println("Hi");
            count++;
        }



        primaryStage.setTitle("Athlete Help");
        TextInputDialog input1 = new TextInputDialog();

        input1.setTitle("Players");
        input1.setContentText("Enter the Number of Players you have: ");
        Optional<String> uInput = input1.showAndWait();
        String result = uInput.get();
        int finalInput = Integer.parseInt(result);
        System.out.println(finalInput);

        int groupSize = 0;

        if (finalInput > 10) {
            groupSize = finalInput / 2;
            System.out.print(groupSize);
        } else if (finalInput > 3 && finalInput < 10) {
            groupSize = finalInput / 3;
            System.out.print(groupSize);
        } else {
            System.out.println("The number of people has to be at least 3");
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Final Results");
        alert.setContentText("The number of people is " + finalInput +" and the number of groups is " + groupSize);
        alert.showAndWait();

    }
}
