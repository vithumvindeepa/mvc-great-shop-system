package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;


public class dashboardFormController implements Initializable {
    public AnchorPane DashboardForm;
    public AnchorPane LoginContext;
    public ImageView LoardContext;
    public Label lblTime;
    public Label lblDate;



    public void btnCustomer(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/customer.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginContext.getChildren().clear();
        LoginContext.getChildren().add(load);
    }

    public void btnOrderDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/orderDetails.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginContext.getChildren().clear();
        LoginContext.getChildren().add(load);
    }

    public void btnOrder(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/order.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginContext.getChildren().clear();
        LoginContext.getChildren().add(load);
    }

    public void btnItem(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/item.fxml");
        assert resource != null;
        Parent load= FXMLLoader.load(resource);
        LoginContext.getChildren().clear();
        LoginContext.getChildren().add(load);
    }

    private void initClock() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            lblTime.setText(LocalDateTime.now().format(formatter));


            SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            lblDate.setText(formatter2.format(date));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initClock();
    }

    public void btnHome(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) DashboardForm.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        window.centerOnScreen();
        window.show();
    }

    public void btnLogOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 638, 498);
        Stage stage = (Stage) LoginContext.getScene().getWindow();
        stage.setScene(scene);
        stage.close();
        stage.show();
    }
}

