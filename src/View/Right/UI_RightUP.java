package View.Right;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;



public class UI_RightUP extends GridPane {
    private Label HausName;



        public UI_RightUP(){
            initializeControls();
            layoutControls();
        }

        public void initializeControls(){
            HausName = new Label("Haus Name:");

        }
        public void layoutControls(){
            setHgrow(this, Priority.ALWAYS);
            setVgrow(this, Priority.ALWAYS);
            setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

            getChildren().add(HausName);

        }


}
