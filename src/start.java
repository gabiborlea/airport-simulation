import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import repository.FlightRepository;
import view.Window;

import java.sql.*;

public class start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Window.getFXMLPath());
        stage.setTitle("Airport Simulation");
        stage.setScene(new Scene(root, 800, 400));
        stage.show();
        stage.centerOnScreen();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.test();
        launch(args);
    }
}
