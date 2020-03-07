import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Scanner;


public class TrainBookingInterface extends Application implements EventHandler<ActionEvent> {
    Scanner capture = new Scanner(System.in);
    public static final int SEATING_CAPACITY = 42; //first class single compartment
    private Button[] buttonArray = new Button[42];

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Denuwara Manike Booking System");

        //following with create the information top row
        BorderPane container = new BorderPane();
        Label customerName = new Label("Name");
        Label seatNumbers = new Label("Seat Numbers");
        HBox infoRow = new HBox();
        infoRow.getChildren().addAll(customerName, seatNumbers);
        container.setTop(infoRow);

        // following will create the seat layout
        GridPane seatLayout = new GridPane();
        seatLayout.setPadding(new Insets(10, 10, 10, 10));
        seatLayout.setVgap(8.0);
        seatLayout.setHgap(12.0);
        for (int i = 0; i < buttonArray.length; i++) {
            buttonArray[i] = new Button("" + (i + 1));
            buttonArray[i].setPrefSize(42, 40);
            buttonArray[i].setOnAction(this);
        }

        int counter = 0;
        for (int i = 0; i < 11; i++) {
            for (int x = 0; x < 4; x++) {
                if (counter < 42) {
                    GridPane.setConstraints(buttonArray[counter], x, i);
                    counter++;
                }
            }
        }
        seatLayout.getChildren().addAll(buttonArray);


        //Following will generate Action Buttons
        Button reset = new Button("Reset");
        Button confirm = new Button("Confirm");
        Button cancel = new Button("Cancel");
        HBox actionBar = new HBox();
        reset.setPrefSize(75, 30);
        confirm.setPrefSize(75, 30);
        cancel.setPrefSize(75, 30);
        actionBar.getChildren().addAll(reset, confirm, cancel);
        actionBar.setSpacing(20);
        actionBar.setAlignment(Pos.CENTER);
        container.setBottom(actionBar);

        //Set the visuals
        container.setCenter(seatLayout);
        Scene addCustomer = new Scene(container, 380, 520);
        primaryStage.setScene(addCustomer);
        primaryStage.show();


    }

    public static void main(String[] args) {
        Application.launch(args);

    }

    private String menu() {
        System.out.println("Denuwara Manike Seat Booking System \n");
        System.out.println("To add a customer\t(a)");
        System.out.println("To view all seats\t(v)");
        System.out.println("To view empty seats\t(e)");
        System.out.println("To delete a entry\t(d)\n");
        System.out.println("Select an Option : ");
        TrainBookingInterface sc =new TrainBookingInterface();
        return sc.capture.next();

    }
    private void addCustomer(){
        System.out.println("Enter Customer name");
        String customerName =new TrainBookingInterface().capture.next();


    }

    @Override
    public void handle(ActionEvent event) {
        String seatNo =((Button)event.getSource()).getText();
        ((Button) event.getSource()).setStyle("-fx-background-color:#F5B7B1");
        System.out.println(seatNo);
    }
}
