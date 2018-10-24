package bluffjack;

import bluffjack.scenes.SceneController;
import bluffjack.styles.java.RootStyles;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import bluffjack.constants.GeneralConstants;

public class Main extends Application {

    RootStyles rootStyles = new RootStyles();
    SceneController sceneController = new SceneController();

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();

        primaryStage.setTitle(GeneralConstants.projectName);
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, 960, 540));
        primaryStage.show();

        rootStyles.setRootStyles(root);
        sceneController.manageScenes(root);

        //set fixed aspect ratio
        primaryStage.setMinHeight(GeneralConstants.minWindowHeight);
        primaryStage.setMinWidth(GeneralConstants.minWindowWidth);

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() {
        //
    }
}
