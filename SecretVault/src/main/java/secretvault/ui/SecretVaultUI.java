package secretvault.ui;

import secretvault.domain.Calculator;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;

public class SecretVaultUI extends Application {
    
    @Override
    public void start(Stage stage) {
        VBox layout = new VBox();
        layout.setPrefSize(300, 300);
        layout.getChildren().add(new StackPane());
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void stop() {
        System.out.println("Sovellus sulkeutuu...");
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
