package scene;

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

public class Menu extends scene {

    public Menu(Stage primaryStage) {
        super(primaryStage);
    }

    @Override
    public Scene get() {
        VBox menuOptions = new VBox();
        menuOptions.setMinSize(500, 500);
        menuOptions.setMaxSize(500, 500);
        menuOptions.setStyle("-fx-background-color: WHITE");
        menuOptions.setAlignment(Pos.CENTER);
        menuOptions.setSpacing(30);
        menuOptions.setOpacity(0.85);

        Text menuText = new Text("Bot-O-Mat Menu!");
        menuText.setFill(Color.BLACK);
        menuText.setStyle("-fx-font: 20 arial;");
        menuText.setFont(new Font(60));

        Text howToLeaveText = new Text("Press 'm' to go back to the game!");
        howToLeaveText.setStyle("-fx-font: 15 arial");
        howToLeaveText.setFill(Color.BLACK);

        Button exitButton = new Button("QUIT GAME");
        exitButton.setOnAction(e -> {
            primaryStage.close();
        });

        Button startOver = new Button("START OVER");
        startOver.setOnAction(e -> {
            primaryStage.setScene(new welcomeScreen(primaryStage).get());
        });

        menuOptions.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.M) {
                goBackOneScene();
            }
        });

        menuOptions.getChildren().addAll(menuText, howToLeaveText, exitButton, startOver);

        return new Scene(menuOptions);
    }

}
