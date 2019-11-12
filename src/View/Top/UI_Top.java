package View.Top;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class UI_Top extends VBox {

    private Button Save;
    private Button Delete;
    private Button New;
    private TextField suchFeld;
    private HBox Hbox;

    public UI_Top(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls() {

        Save = createButton("save");
        Delete = createButton("delete");
        New = createButton("new");
        suchFeld = new TextField();
        Hbox = new HBox();

    }

    public void layoutControls() {
        getChildren().addAll(Hbox);
        Hbox.getChildren().addAll(Save, Delete, New,suchFeld);
        setVgrow(this, Priority.NEVER);
        setMargin(suchFeld, new Insets(0,0,0,150));
      //  suchFeld.setPadding(new Insets(0,0,0,150));
        prefHeight(30);
        setMaxSize(Double.MAX_VALUE, 10);


    }

    private Button createButton(String text){
        Button button = new Button(text);
        button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        setMargin(button, new Insets(5));
        return button;
    }
}
