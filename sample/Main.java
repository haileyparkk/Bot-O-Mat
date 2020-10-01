package sample;
import scene.welcomeScreen;
import javafx.stage.Stage;
import javafx.application.Application;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage stage) {
        primaryStage = stage;
        welcomeScreen welcomeS = new welcomeScreen(primaryStage);
        stage.setScene(welcomeS.get());

        stage.show();
    }
}
