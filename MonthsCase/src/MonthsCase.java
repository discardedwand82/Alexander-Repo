/*
Alexander Abrams
CSC 200
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MonthsCase extends Application {

    public static void main(String[] args){
        launch(args);
    }

    public enum TotalMonths{
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public void start(Stage primaryStage)throws Exception{

        ComboBox<TotalMonths> combo = new ComboBox<>();
        combo.getItems().addAll(TotalMonths.values());
        combo.setOnAction(e->{

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Your Month Choice");

            switch (combo.getValue().name()) {
                //Winter
                case "December":
                    alert.setContentText("Do you want to build a snowman?");
                    alert.showAndWait();
                case "January":
                    alert.setContentText("Do you want to build a snowman?");
                    alert.showAndWait();
                case "February":
                    alert.setContentText("Do you want to build a snowman?");
                    alert.showAndWait();
                    break;

                //Spring
                case "March":
                    alert.setContentText("Happy Spring days!");
                    alert.showAndWait();
                case "April":
                    alert.setContentText("Happy Spring days!");
                    alert.showAndWait();
                case "May":
                    alert.setContentText("Happy Spring days!");
                    alert.showAndWait();
                    break;

                //Summer
                case "June":
                    alert.setContentText("It's a summer time.");
                    alert.showAndWait();
                case "July":
                    alert.setContentText("It's a summer time.");
                    alert.showAndWait();
                case "August":
                    alert.setContentText("It's a summer time.");
                    alert.showAndWait();
                    break;

                //Fall
                case "September":
                    alert.setContentText("Welcome to the foliage season!");
                    alert.showAndWait();
                case "October":
                    alert.setContentText("Welcome to the foliage season!");
                    alert.showAndWait();
                case "November":
                    alert.setContentText("Welcome to the foliage season!");
                    alert.showAndWait();
                    break;
                default:
                    alert.setContentText("Try Again!");
                    alert.showAndWait();
                    break;
            }

        });

        Scene scene = new Scene(combo);
        primaryStage.setScene(scene);
        primaryStage.show();

        }
    }

