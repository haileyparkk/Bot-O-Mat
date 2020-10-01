package scene;

import information.robotInfo;
import information.task;
import information.taskList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class thirdScreen extends scene {
    public thirdScreen(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    public Scene get() {
        robotInfo.setTime(1000000);
        Text current = new Text(robotInfo.getType() + " " + robotInfo.getName() + " currently has " + robotInfo.getTime() +
                "\n" +" milliseconds to complete all their tasks.");
        current.setFill(Color.BLACK);
        current.setStyle("-fx-font: 20 arial;");
        current.setFont(new Font(60));
        VBox vbox3 = new VBox();
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setMinSize(1000, 50);
        vbox3.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));
        vbox3.setSpacing(10);
        vbox3.getChildren().add(current);

        task[] theList = taskList.getTasks();

        String task1 = String.valueOf(theList[0].getName());
        String task2 = String.valueOf(theList[1].getName());
        String task3 = String.valueOf(theList[2].getName());
        String task4 = String.valueOf(theList[3].getName());
        String task5 = String.valueOf(theList[4].getName());

        String task1Time = String.valueOf(theList[0].getTime());
        String task2Time = String.valueOf(theList[1].getTime());
        String task3Time = String.valueOf(theList[2].getTime());
        String task4Time = String.valueOf(theList[3].getTime());
        String task5Time = String.valueOf(theList[4].getTime());

        Text assigned = new Text("The robot generator has assigned your robot the following tasks: ");
        assigned.setFill(Color.BLACK);
        assigned.setStyle("-fx-font: 20 arial;");
        assigned.setFont(new Font(60));
        VBox vbox2 = new VBox();
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setMinSize(1000, 50);
        vbox2.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));
        vbox2.setSpacing(10);
        vbox2.getChildren().add(assigned);

        VBox vbox1 = new VBox();
        vbox1.setAlignment(Pos.BOTTOM_CENTER);
        vbox1.setMinSize(1000, 100);
        vbox1.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));
        vbox1.setSpacing(10);

        Text task1Stuff = new Text(task1 + " which takes " + task1Time + " milliseconds.");
        Text task2Stuff = new Text(task2 + " which takes " + task2Time+ " milliseconds.");
        Text task3Stuff = new Text(task3 + " which takes "+ task3Time+ " milliseconds.");
        Text task4Stuff = new Text(task4 + " which takes "+ task4Time+ " milliseconds.");
        Text task5Stuff = new Text(task5 + " which takes " +task5Time+ " milliseconds.");
        task1Stuff.setFill(Color.BLACK);
        task1Stuff.setStyle("-fx-font: 20 arial;");
        task1Stuff.setFont(new Font(60));
        task2Stuff.setFill(Color.BLACK);
        task2Stuff.setStyle("-fx-font: 20 arial;");
        task2Stuff.setFont(new Font(60));
        task3Stuff.setFill(Color.BLACK);
        task3Stuff.setStyle("-fx-font: 20 arial;");
        task3Stuff.setFont(new Font(60));
        task4Stuff.setFill(Color.BLACK);
        task4Stuff.setStyle("-fx-font: 20 arial;");
        task4Stuff.setFont(new Font(60));
        task5Stuff.setFill(Color.BLACK);
        task5Stuff.setStyle("-fx-font: 20 arial;");
        task5Stuff.setFont(new Font(60));

        vbox1.getChildren().addAll(task1Stuff, task2Stuff, task3Stuff, task4Stuff, task5Stuff);


        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinSize(1000, 600);
        vbox.setBackground(new Background(new BackgroundFill(Color.LIGHTGREEN, null, null)));
        vbox.setSpacing(30);

        Text goTo = new Text("Click next to get your robot to start completing these tasks!");
        goTo.setFill(Color.BLACK);
        goTo.setStyle("-fx-font: 20 arial;");
        goTo.setFont(new Font(60));

        Button nextScreen = new Button("Next");
        nextScreen.setOnAction(e -> {
            primaryStage.setScene(new fourthScreen(primaryStage).get());
        });

        vbox.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.M) {
                setScene(new Menu(primaryStage).get());
            }
        });

        vbox.getChildren().addAll(vbox3, vbox2, vbox1, goTo, nextScreen);

        return new Scene(vbox);
    }
}
