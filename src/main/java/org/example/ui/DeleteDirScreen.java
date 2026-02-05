package org.example.ui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.example.wizard.*;

public class DeleteDirScreen {

    private final WizardController controller;
    private final WizardState state;

    public DeleteDirScreen(WizardController controller, WizardState state) {
        this.controller = controller;
        this.state = state;
    }

    public Scene scene() {
        TextField pathField = new TextField();
        Button next = new Button("Next");

        next.setOnAction(e -> {
            state.setDeleteDirPath(pathField.getText());
            controller.showSummary();
        });

        VBox root = new VBox(15,
                new Label("Directory to DELETE (optional):"),
                pathField,
                next
        );

        return new Scene(root, 500, 300);
    }
}
