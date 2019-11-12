package View.Left;

import javafx.scene.control.TableView;

public class UI_Left extends TableView{

    public UI_Left(){

    }

    public void layoutControls(){
      /*  setHgrow(this, Priority.ALWAYS);
        setVgrow(this, Priority.ALWAYS);

       */
        setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);

    }
}
