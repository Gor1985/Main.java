package com.example.guichat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextArea textArea;
    @FXML
    private TextField textField;
    @FXML
    private Label welcomeText;

    public HelloController() {
    }

    @FXML
    protected void handlerSend() {
        String text = this.textField.getText();
        this.textArea.appendText(text + "\n");
        this.textField.clear();
    }

    @FXML
    protected void onHelloButtonClick() {
        this.welcomeText.setText("Welcome to JavaFX Application!");
    }
}