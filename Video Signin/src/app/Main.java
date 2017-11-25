package app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

   private Stage stage;
  
   private AnchorPane anchorPane;

    @Override
    public void start(Stage primaryStage) throws Exception{
      this.stage=primaryStage;
      mainWindow();
    }

    public void mainWindow(){

      FXMLLoader loader = new FXMLLoader(getClass().getResource("../src/view/signIn.fxml"));
        try {
            anchorPane = (AnchorPane) loader.load();

            Scene scene=new Scene(anchorPane);
            scene.getStylesheets().addAll(getClass().getResource("style.css").toExternalForm());
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public static void main(String[] args) {
        launch(args);
    }
}
