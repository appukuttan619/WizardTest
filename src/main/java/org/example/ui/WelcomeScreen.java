package org.example.ui;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.example.wizard.WizardController;

public class WelcomeScreen {

    private final WizardController controller;

    public WelcomeScreen(WizardController controller) {
        this.controller = controller;
    }

    public Scene scene() {
        Button next = new Button("Next");

        next.setOnAction(e -> controller.showCreateDir());

        VBox root = new VBox(15,
                new Label("Welcome to Migration Wizard"),
                new Label("This wizard will guide you step by step."),
                next
        );

        return new Scene(root, 500, 300);
    }
}