package View;

import View.Left.UI_Left;
import View.Right.UI_RightDown;
import View.Right.UI_RightUP;
import View.Top.UI_Top;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import presentationModel.skyscraper_PM;

public class skyscraper_UI extends BorderPane {
    private final skyscraper_PM pm;

    private HBox TopBorder;
    private TableView ListLeft;
    private GridPane RightDown;
    private VBox Top;
    private SplitPane splitpane;
    private VBox RightBox;
    private ScrollPane scrollpane;
    private UI_RightUP RightUP;

    public skyscraper_UI(skyscraper_PM pm){
        this.pm = pm;
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        Top = new UI_Top();
        RightDown = new UI_RightDown();
        ListLeft =new UI_Left();
        splitpane = new SplitPane();
        RightBox = new VBox();
        scrollpane = new ScrollPane();
        RightUP = new UI_RightUP();

    }

    private void layoutControls() {
        setTop(Top);
        setCenter(splitpane);
        RightBox.getChildren().addAll(RightUP, RightDown);
        scrollpane.setContent(RightDown);
 /*       scrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollpane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scrollpane.setPannable(true);
        scrollpane.setVvalue(1.0);
        scrollpane.setFitToHeight(true);
        scrollpane.setFitToWidth(true);
  */
        splitpane.getItems().addAll(ListLeft, RightBox);


    }


}
