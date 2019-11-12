package main;

import View.skyscraper_UI;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import presentationModel.skyscraper_PM;

public class main_skyscraper extends Application {

   public static void main(String[] args){
       launch(args);
   }


    @Override
    public void start(Stage primaryStage) throws Exception {
        skyscraper_PM pm = new skyscraper_PM();

        Parent rootPane = new skyscraper_UI(pm);

        Scene myScene = new Scene(rootPane);

        primaryStage.setTitle("Skyscraper");
        primaryStage.setScene(myScene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        primaryStage.show();

    }

    }
