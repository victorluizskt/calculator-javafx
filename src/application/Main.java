package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
            /// Parent é a classe mais generica possível.
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
            primaryStage.setScene(new Scene(parent, 400, 300));
            primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
