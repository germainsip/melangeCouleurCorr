package org.petersix.gui;

import com.jfoenix.controls.JFXSlider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable, ChangeListener {
    public Pane resultPane;
    public Rectangle result;
    public JFXSlider rougeSlider;
    public JFXSlider vertSlider;
    public JFXSlider bleuSlider;
    public Label detail;
    public AnchorPane fond;
    Double R =0.;
    Double G =0.;
    Double B =0.;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        detail.setText("Corrigé de l'exercice sur les changements \n" +
                "et les les écouteurs");
        rougeSlider.valueProperty().addListener(this);
        vertSlider.valueProperty().addListener(this);
        bleuSlider.valueProperty().addListener(this);
        rougeSlider.setValue(0);
        vertSlider.setValue(0);
        bleuSlider.setValue(0);
    }


    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
        R = rougeSlider.getValue();
        G = vertSlider.getValue();
        B = bleuSlider.getValue();

        result.setFill(Color.rgb( R.intValue(), G.intValue(), B.intValue()));
    }
    }

