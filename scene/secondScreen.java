package scene;

import information.robotInfo;
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

public class secondScreen extends scene {

    public secondScreen(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    public Scene get() {
        Text congratulations = new Text("Congratulations! You have successfully created your robot!");
        congratulations.setFill(Color.BLACK);
        congratulations.setStyle("-fx-font: 20 arial;");
        congratulations.setFont(new Font(100));

        Text nameAndType = new Text("Their name is: " + robotInfo.getType() + " " + robotInfo.getName() + ".");
        nameAndType.setFill(Color.BLACK);
        nameAndType.setStyle("-fx-font: 20 arial;");
        nameAndType.setFont(new Font(60));

        Text click = new Text("Click next to see the tasks assigned to " + robotInfo.getType() + " " + robotInfo.getName() + ".");
        click.setFill(Color.BLACK);
        click.setStyle("-fx-font: 20 arial;");
        click.setFont(new Font(60));

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setMinSize(1000, 600);
        vbox.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, null, null)));
        vbox.setSpacing(30);

        Button nextScreen = new Button("Next");
        nextScreen.setOnAction(e -> {
            primaryStage.setScene(new thirdScreen(primaryStage).get());
        });

        vbox.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.M) {
                setScene(new Menu(primaryStage).get());
            }
        });

        vbox.getChildren().addAll(congratulations, nameAndType, click, nextScreen);

        return new Scene(vbox);
    }


}
