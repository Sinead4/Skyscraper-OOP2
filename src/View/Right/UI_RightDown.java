package View.Right;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class UI_RightDown extends GridPane {

    private Label name;
    private Label stadt;
    private Label land;
    private Label hoeheM;
    private Label hoeheFT;
    private Label laengengrad;
    private Label breitengrad;
    private Label stockwerke;
    private Label baujahr;
    private Label architekt;
    private Label architekturstil;
    private Label kosten;
    private Label materialien;
    private Label bild;

    private TextField nameField;
    private TextField stadtField;
    private TextField landField;
    private TextField hoeheMField;
    private TextField hoeheFTField;
    private TextField laengengradField;
    private TextField breitengradField;
    private TextField stockwerkeField;
    private TextField baujahrField;
    private TextField architektField;
    private TextField architekturstilField;
    private TextField kostenField;
    private TextField materialienField;
    private TextField bildField;

    public UI_RightDown(){
        initializeControls();
        layoutControls();
    }

    public void initializeControls() {
        name = createLabel("Name*");
        stadt = createLabel("Stadt");
        land = createLabel("Land");
        hoeheM = createLabel("Höhe(m)*");
        hoeheFT = createLabel("Höhe(ft)");
        laengengrad = createLabel("Längengrad");
        breitengrad = createLabel("Breitengrad");
        stockwerke = createLabel("Stockwerke");
        baujahr = createLabel("Baujahr");
        architekt = createLabel("Architekt");
        architekturstil = createLabel("Architekturstil");
        kosten = createLabel("Kosten");
        materialien = createLabel("Materialien");
        bild = createLabel("Bild");


        nameField = createTextField();
        stadtField = createTextField();
        landField = createTextField();
        hoeheMField = createTextField();
        hoeheFTField = createTextField();
        laengengradField = createTextField();
        breitengradField = createTextField();
        stockwerkeField = createTextField();
        baujahrField = createTextField();
        architektField = createTextField();
        architekturstilField = createTextField();
        kostenField = createTextField();
        materialienField = createTextField();
        bildField = createTextField();


    }

    public void layoutControls() {
        add(name, 0, 0);
        add(nameField, 1, 0, 3, 1);
        add(stadt, 0, 1);
        add(stadtField, 1, 1);
        add(land, 2, 1);
        add(landField, 3, 1);
        add(hoeheM, 0, 2);
        add(hoeheMField, 1, 2);
        add(hoeheFT, 2, 2);
        add(hoeheFTField, 3, 2);
        add(laengengrad, 0, 3);
        add(laengengradField, 1, 3);
        add(breitengrad, 2, 3);
        add(breitengradField, 3, 3);
        add(stockwerke, 0, 4);
        add(stockwerkeField, 1, 4);
        add(baujahr, 2, 4);
        add(baujahrField, 3, 4);
        add(architekt, 0, 5);
        add(architektField, 1, 5);

        setPadding(new Insets(10));

        setHgrow(this, Priority.ALWAYS);
        setVgrow(this, Priority.ALWAYS);
        setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);



    /*    ColumnConstraints cc = new ColumnConstraints();
        cc.setHgrow(Priority.ALWAYS);
        getColumnConstraints().addAll(cc, cc, cc);

        RowConstraints rc = new RowConstraints();
        rc.setVgrow(Priority.ALWAYS);
        getRowConstraints().addAll(rc, rc, rc);
      */
    }

    private TextField createTextField(){
        TextField field = new TextField();
        field.setMinSize(60,20);
        field.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        setMargin(field, new Insets(5));


        return field;
    }

    private Label createLabel(String text) {
        Label label = new Label(text);
        label.setMinSize(60, 10);
        label.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        setMargin(label, new Insets(5));


        return label;
    }
}
