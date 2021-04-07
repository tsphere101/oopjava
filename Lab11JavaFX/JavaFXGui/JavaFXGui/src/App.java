import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class App extends Application {
    public static void main(String[] args) throws Exception {

        Application.launch(args); // invoke a static method from Application class ( parental class ).

    }

    @Override
    public void start(Stage stage) throws Exception {

        StackPane pane = new StackPane();
        Button okBtn = new Button("OK");

        pane.getChildren().add(okBtn);

        Scene scene = new Scene(pane, 400, 300);

        stage.setScene(scene);
        stage.setTitle("Test JavaFX Layout");
        stage.show();

    }

}
