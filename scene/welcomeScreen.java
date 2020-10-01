package scene;

import information.robotInfo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

import java.awt.*;


public class welcomeScreen extends scene {

    /**
     * constructor for all the scenes.
     *
     * @param primaryStage the stage
     */

    public welcomeScreen(Stage primaryStage) {
        super(primaryStage);
    }

    private TextField nameInput;
    private Text warningText;
    private ComboBox comboBox;

    @Override
    public Scene get() {
        Text titleText = new Text("Welcome to Bot-O-Mat!");
        titleText.setFill(Color.BLACK);
        titleText.setStyle("-fx-font: 20 arial;");
        titleText.setFont(new Font(200));

        Text introText = new Text("Before you can choose tasks for your robot, we have to create it!");

        introText.setFill(Color.BLACK);
        introText.setStyle("-fx-font: 20 arial;");
        introText.setFont(new Font(60));

        Text robotType = new Text("Robot Type:");
        robotType.setFill(Color.BLACK);
        robotType.setStyle("-fx-font: 20 arial;");
        robotType.setFont(new Font(60));

        Text name = new Text("Robot Name:");
        name.setFill(Color.BLACK);
        name.setStyle("-fx-font: 20 arial;");
        name.setFont(new Font(60));

        Text chooseRobot = new Text("Please choose your robot type, give your robot a name, click submit, and then click next!");
        chooseRobot.setFill(Color.BLACK);
        chooseRobot.setStyle("-fx-font: 20 arial;");
        chooseRobot.setFont(new Font(60));
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "Unipedal",
                        "Bipedal",
                        "Quadrupedal",
                        "Arachnid",
                        "Radial",
                        "Aeronautical"
                );
        ComboBox comboBox = new ComboBox(options);
        Button selected = new Button("Submit Type");

        TextField nameInput = new TextField("");
        nameInput.setMaxWidth(150);

        Text menu = new Text("Remember that you can always click 'm' on your keyboard to get to the menu!");
        menu.setFill(Color.BLACK);
        menu.setStyle("-fx-font: 20 arial;");
        menu.setFont(new Font(60));


        Background background;
        Image theImage = new Image("Images/robots.jpg");
        BackgroundImage backgroundImage = new
                BackgroundImage(theImage, BackgroundRepeat.REPEAT,
                BackgroundRepeat.REPEAT, BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        background = new Background(backgroundImage);

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinSize(1000, 600);
        vbox.setBackground(background);
        vbox.setSpacing(30);

        vbox.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.M) {
                setScene(new Menu(primaryStage).get());
            }
        });

        vbox.getChildren().addAll(titleText, introText, robotType, chooseRobot, comboBox, name, nameInput, selected, menu);

        selected.setOnAction(e -> {
            robotInfo.setName(nameInput.getText());
            String selectedOne = comboBox.getValue().toString();
            robotInfo.setType(selectedOne);
            primaryStage.setScene(new secondScreen(primaryStage).get());
        });

        return new Scene(vbox);
    }
}
