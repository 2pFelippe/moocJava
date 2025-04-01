package myFirstApplication;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {
    

    public static void main(String[] args) {
        launch(MyFirstApplication.class, args);
    }

   @Override
    public void start(Stage window) {
        // Define o título da janela
        window.setTitle("My first application");

        // Cria um nó raiz (StackPane é um layout simples)
        StackPane root = new StackPane();

        // Adiciona um Label ao nó raiz
        Label label = new Label("Hello, JavaFX!");
        root.getChildren().add(label);

        // Cria uma cena com o nó raiz e define o tamanho
        Scene scene = new Scene(root, 300, 200);

        // Define a cena no palco (Stage)
        window.setScene(scene);

        // Exibe a janela
        window.show();
    }

}
