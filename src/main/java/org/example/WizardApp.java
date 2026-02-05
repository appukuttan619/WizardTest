package org.example;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.wizard.WizardController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WizardApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        WizardController wizardController = new WizardController(stage);
        wizardController.showWelcome();
    }
}