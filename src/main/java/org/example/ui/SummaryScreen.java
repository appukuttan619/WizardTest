package org.example.ui;

import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import org.example.core.FileSystemService;
import org.example.wizard.*;


public class SummaryScreen {

    private final WizardController controller;
    private final WizardState state;

    public SummaryScreen(WizardController controller, WizardState state) {
        this.controller = controller;
        this.state = state;
    }

    public Scene scene() {
        FileSystemService fs = new FileSystemService();

        Label summary = new Label(
                "Create: " + state.getCreateDirPath() +
                        "\nDelete: " + state.getDeleteDirPath()
        );

        Button finish = new Button("Finish");

        finish.setOnAction(e -> {
            try {
                if (state.getCreateDirPath() != null) {
                    fs.createDir(state.getCreateDirPath());
                }
                if (state.getDeleteDirPath() != null && !state.getDeleteDirPath().isBlank()) {
                    fs.deleteDir(state.getDeleteDirPath());
                }
                new Alert(Alert.AlertType.INFORMATION, "Done!").show();
            } catch (Exception ex) {
                new Alert(Alert.AlertType.ERROR, ex.getMessage()).show();
            }
        });

        VBox root = new VBox(15,
                new Label("Summary"),
                summary,
                finish
        );

        return new Scene(root, 500, 300);
    }
}
