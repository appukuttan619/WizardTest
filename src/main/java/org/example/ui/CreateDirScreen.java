package org.example.ui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.example.wizard.*;

public class CreateDirScreen {

    private final WizardController controller;
    private final WizardState state;

    public CreateDirScreen(WizardController controller, WizardState state) {
        this.controller = controller;
        this.state = state;
    }

    public Scene scene() {
        TextField pathField = new TextField();
        Button next = new Button("Next");

        next.setOnAction(e -> {
            if (pathField.getText().isBlank()) {
                new Alert(Alert.AlertType.ERROR, "Path is required").show();
                return;
            }
            state.setCreateDirPath(pathField.getText());
            controller.showDeleteDir();
        });

        VBox root = new VBox(15,
                new Label("Directory to CREATE:"),
                pathField,
                next
        );

        return new Scene(root, 500, 300);
    }
}