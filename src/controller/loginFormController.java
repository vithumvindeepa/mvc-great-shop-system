package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class loginFormController {
    public JFXPasswordField txtPassword;
    public JFXTextField txtUsername;
    public AnchorPane MainContext;

    public void btnlogin(ActionEvent actionEvent) throws IOException {
        String user = "admin";
        String password = "123";
        if (txtUsername.getText().equals(user) && txtPassword.getText().equals(password)) {
            Stage window = (Stage) MainContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));

        }else {
            new Alert(Alert.AlertType.CONFIRMATION, "Try Again").show();
        }
    }
}
