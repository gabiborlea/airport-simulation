package view;

import controller.Controller;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.util.Pair;
import model.CheckInPoint;

import java.net.URL;
import java.util.Date;

public class Window {
    @FXML
    private TableView<CheckInPoint> CheckInPointsTable;

    @FXML
    private TableColumn<CheckInPoint, Integer> ID;

    @FXML
    private TableColumn<CheckInPoint, Integer> flightID;

    @FXML
    private TableColumn<CheckInPoint, Date> startInterval;

    @FXML
    private TableColumn<CheckInPoint, Date> endInterval;


    @FXML
    private Text TextID;

    @FXML
    private Text TextFlightID;

    @FXML
    private Text TextStartInterval;

    @FXML
    private Text TextEndInterval;

    @FXML
    private Button SelectButton;

    private final ReadOnlyObjectWrapper<CheckInPoint> selectedCheckIn = new ReadOnlyObjectWrapper<>();

    Controller controller;
    public void initialize(){
        controller = new Controller();
        ID.setCellValueFactory(new PropertyValueFactory<CheckInPoint, Integer>("ID"));
        flightID.setCellValueFactory(new PropertyValueFactory<CheckInPoint, Integer>("flightID"));
        startInterval.setCellValueFactory(new PropertyValueFactory<CheckInPoint, Date>("startInterval"));
        endInterval.setCellValueFactory(new PropertyValueFactory<CheckInPoint, Date>("endInterval"));
        CheckInPointsTable.getItems().setAll(controller.getCheckInPoints());

        selectedCheckIn.bind(CheckInPointsTable.getSelectionModel().selectedItemProperty());

    }

    public static URL getFXMLPath() {
        return Window.class.getResource("Window.fxml");
    }

    public void selectCheckIn(ActionEvent actionEvent) {
        if (selectedCheckIn.get() != null) {
            TextID.setText("ID:"+selectedCheckIn.get().getID());
            TextFlightID.setText("FlightID:" +selectedCheckIn.get().getFlightID());
            TextStartInterval.setText("Start Interval:" +selectedCheckIn.get().getStartInterval());
            TextEndInterval.setText("End Interval:"+selectedCheckIn.get().getEndInterval());
        }
    }
}
