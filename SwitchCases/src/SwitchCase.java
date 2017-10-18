/*
Alexander Abrams
CSC 200
 */
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.Optional;

public class SwitchCase extends Application {

    public static void main(String[] args){
        launch(args);
    }


    public void start(Stage primaryStage)throws Exception{

        ChoiceDialog<String>dialog = new ChoiceDialog<String>("Administrator","Administrator","Faculty"
                , "Staff", "Student", "Guest");
        Optional<String> input = dialog.showAndWait();

        String value = input.get();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Welcome");

        switch (value){
            case "Administrator":
                alert.setContentText("Welcome Administrator");
                alert.showAndWait();
                break;

            case "Faculty":
                alert.setTitle("Welcome Faculty");
                alert.showAndWait();
                break;
            case "Staff":
                alert.setTitle("Welcome  Staff");
                alert.showAndWait();
                break;
            case "Student":
                alert.setTitle("Welcome  Student");
                alert.showAndWait();
                break;
            case "Guest":
                alert.setTitle("Welcome  Quest");
                alert.showAndWait();
                break;
            default:
                alert.setTitle("Invalid Optioni");
                alert.showAndWait();
                break;














        }



    }
}
