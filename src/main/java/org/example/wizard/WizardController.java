package org.example.wizard;

import javafx.stage.Stage;
import org.example.ui.CreateDirScreen;
import org.example.ui.DeleteDirScreen;
import org.example.ui.SummaryScreen;
import org.example.ui.WelcomeScreen;

public class WizardController{

    private final Stage stage;
    private final WizardState state = new WizardState();

    public WizardController(Stage stage) {
        this.stage = stage;
    }

    public void showWelcome() {
        stage.setScene(new WelcomeScreen(this).scene());
        stage.show();
    }

    public void showCreateDir() {
        stage.setScene(new CreateDirScreen(this, state).scene());
    }

    public void showDeleteDir() {
        stage.setScene(new DeleteDirScreen(this, state).scene());
    }

    public void showSummary() {
        stage.setScene(new SummaryScreen(this, state).scene());
    }
}