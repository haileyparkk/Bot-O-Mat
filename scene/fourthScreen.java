package scene;

import information.robotInfo;
import information.task;
import information.taskList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class fourthScreen extends scene {

    public fourthScreen(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    public Scene get() {
        task[] theList = taskList.getTasks();
        String task1 = theList[0].getName().toLowerCase();
        String task2 = theList[1].getName().toLowerCase();
        String task3 = theList[2].getName().toLowerCase();
        String task4 = theList[3].getName().toLowerCase();
        String task5 = theList[4].getName().toLowerCase();


        Text currentTime = new Text(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
        currentTime.setFill(Color.BLACK);
        currentTime.setStyle("-fx-font: 20 arial;");
        currentTime.setFont(new Font(60));

        Text task1Info = new Text(robotInfo.getName() + " will " + task1 + " first. Click start to complete the task, and then click the rest of the tasks!");
        task1Info.setFill(Color.BLACK);
        task1Info.setStyle("-fx-font: 20 arial;");
        task1Info.setFont(new Font(60));

        Button nextTask1 = new Button("Start");
        nextTask1.setOnAction(e -> {
            task.completeTask(theList[0]);
            if (robotInfo.getTime() < 0) {
                currentTime.setText(robotInfo.getName() + " currently doesn't have enough time left to complete this task today. Come back tomorrow!");
            } else {
                currentTime.setText(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
            }
        });

        Text task2Info = new Text(robotInfo.getName() + " will " + task2 + " second. Click start to complete the task, and then click the rest of the tasks!");
        task2Info.setFill(Color.BLACK);
        task2Info.setStyle("-fx-font: 20 arial;");
        task2Info.setFont(new Font(60));

        Button nextTask2 = new Button("Start");
        nextTask1.setOnAction(e -> {
            task.completeTask(theList[1]);
            if (robotInfo.getTime() < 0) {
                currentTime.setText(robotInfo.getName() + " currently doesn't have enough time left to complete this task today. Come back tomorrow!");
            } else {
                currentTime.setText(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
            }
        });

        Text task3Info = new Text(robotInfo.getName() + " will " + task3 + " third. Click start to complete the task, and then click the rest of the tasks!");
        task3Info.setFill(Color.BLACK);
        task3Info.setStyle("-fx-font: 20 arial;");
        task3Info.setFont(new Font(60));

        Button nextTask3 = new Button("Start");
        nextTask3.setOnAction(e -> {
            task.completeTask(theList[2]);
            if (robotInfo.getTime() < 0) {
                currentTime.setText(robotInfo.getName() + " currently doesn't have enough time left to complete this task today. Come back tomorrow!");
            } else {
                currentTime.setText(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
            }
        });

        Text task4Info = new Text(robotInfo.getName() + " will " + task4 + " fourth. Click start to complete the task, and then click the rest of the tasks!");
        task4Info.setFill(Color.BLACK);
        task4Info.setStyle("-fx-font: 20 arial;");
        task4Info.setFont(new Font(60));

        Button nextTask4 = new Button("Start");
        nextTask4.setOnAction(e -> {
            task.completeTask(theList[3]);
            if (robotInfo.getTime() < 0) {
                currentTime.setText(robotInfo.getName() + " currently doesn't have enough time left to complete this task today. Come back tomorrow!");
            } else {
                currentTime.setText(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
            }
        });

        Text task5Info = new Text(robotInfo.getName() + " will " + task5 + " fifth. Click start to complete the task.");
        task5Info.setFill(Color.BLACK);
        task5Info.setStyle("-fx-font: 20 arial;");
        task5Info.setFont(new Font(60));

        Button nextTask5 = new Button("Start");
        nextTask5.setOnAction(e -> {
            task.completeTask(theList[4]);
            if (robotInfo.getTime() < 0) {
                currentTime.setText(robotInfo.getName() + " currently doesn't have enough time left to complete this task today. Come back tomorrow!");
            } else {
                currentTime.setText(robotInfo.getName() + " currently has " + robotInfo.getTime() + " milliseconds to complete the tasks.");
            }
        });

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinSize(1000, 600);
        vbox.setBackground(new Background(new BackgroundFill(Color.LIGHTCORAL, null, null)));
        vbox.setSpacing(30);

        Text complete = new Text(robotInfo.getName() + " has completed all their tasks! You can now go back to the menu and recreate a robot or end the game here!");
        complete.setFill(Color.BLACK);
        complete.setStyle("-fx-font: 20 arial;");
        complete.setFont(new Font(60));

        vbox.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.M) {
                setScene(new Menu(primaryStage).get());
            }
        });

        vbox.getChildren().addAll(currentTime, task1Info, nextTask1, task2Info, nextTask2, task3Info, nextTask3, task4Info, nextTask4, task5Info, nextTask5, complete);

        return new Scene(vbox);
    }
}
