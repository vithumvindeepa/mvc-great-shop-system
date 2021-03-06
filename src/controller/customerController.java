package controller;

import Util.UtilController;
import assest.tm.customerTm;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class customerController implements Initializable {

    public AnchorPane customerContext;
    public JFXTextField txtcustomerId;
    public TableView<customerTm> tblCustomer;
    public TableColumn colId;
    public TableColumn colTital;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colCity;
    public TableColumn colProvide;
    public TableColumn colPostalCode;
    public JFXTextField txtTitle;
    public JFXTextField txtPostalCode;
    public JFXTextField txtName;
    public JFXTextField txtProvince;
    public JFXTextField txtAddress;
    public JFXTextField txtCity;
    public JFXButton btnSave;

//        .............Validations..........

    LinkedHashMap<TextField, Pattern> map = new LinkedHashMap<>();
    Pattern titlePattern = Pattern.compile("^[A-z]{3,40}$");
    Pattern namePattern = Pattern.compile("^[A-z]{3,40}$");
    Pattern addressPattern = Pattern.compile("^[A-z]{3,40}$");
    Pattern cityPattern = Pattern.compile("^[A-z]{3,40}$");
    Pattern provincePattern = Pattern.compile("^[A-z]{3,40}$");
    Pattern postalcodePattern = Pattern.compile("^{3,40}$");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnSave.setDisable(true);
        txtNavigations();
        loadtxtCusromerId();
        getAllcustomer();

    }

         // .........Text field navigations...........
    
    private void txtNavigations() {
        map.put(txtTitle, titlePattern);
        map.put(txtName, namePattern);
        map.put(txtAddress, addressPattern);
        map.put(txtCity, cityPattern);
        map.put(txtProvince, provincePattern);
        map.put(txtPostalCode, postalcodePattern);

    }

          //..........Save button disable...........

    public void validationOnAction(KeyEvent keyEvent) {
        Object response = UtilController.validate(map, btnSave);
        if (keyEvent.getCode() == KeyCode.ENTER)
            if (response instanceof TextField) {
                TextField errorText = (TextField) response;
                errorText.requestFocus();
            } else if (response instanceof Boolean) {

            }
    }

    //..........Customer id auto generate method...........

    private void loadtxtCusromerId() {
        try {
            int c = 0;
            ResultSet rs = DbConnection.search("select count(cust_id) AS x from Customer");
            if (rs.next()) {
                c = Integer.parseInt(rs.getString("x"));
                c++;
                txtcustomerId.setText("C00" + c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //set valuse to coustomrtm form Coustomer model
    
    private void getAllcustomer() {

    }
    
    public void btnSave(ActionEvent actionEvent) {

    }

    public void SearchOnAction(KeyEvent keyEvent) {

    }

    public void btnUpdate(ActionEvent actionEvent) {

    }

    public void btnDelete(ActionEvent actionEvent) {
        
    }

}
