
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 class DI extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a label
        Label label = new Label("Hello, JavaFX!");

        // Load an image from a file
        Image image = new Image("b1.jfif");

        // Create an ImageView
        ImageView imageView = new ImageView(image);

        // Set image dimensions
        imageView.setFitWidth(400);
        imageView.setFitHeight(250);
        imageView.setPreserveRatio(true);

        // Create VBox layout
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(label, imageView);

        // Create a scene
        Scene scene = new Scene(vbox, 600, 400);

        // Set stage title and scene
        primaryStage.setTitle("Text and Image Display");
        primaryStage.setScene(scene);

        // Display the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
