package secretvault.ui;

import secretvault.domain.Calculator;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class SecretVaultUI extends Application {
    
    @Override
    public void start(Stage stage) {
        VBox layout = new VBox();
        layout.setPrefWidth(300.0);
        layout.setPrefHeight(300.0);
        layout.setSpacing(10.0);
        
        StackPane top = new StackPane();
        top.setPrefHeight(50.0);
        top.setPrefWidth(200.0);
        layout.getChildren().add(top);
        
        HBox hbox = new HBox();
        hbox.setPrefHeight(50.0);
        hbox.setPrefWidth(300.0);
        hbox.setSpacing(10.0);
        Button button = new Button();
        hbox.getChildren().add(button);
        layout.getChildren().add(hbox);
        
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
