/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class IndexController implements Initializable {

    @FXML
    private Button btnAdminLoginPage;
    @FXML
    private Button btnPatientLoginPage;
    @FXML
    private Label choose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void showAdminLoginPage(ActionEvent event) {
    }

    @FXML
    private void showPatientLoginPage(ActionEvent event) {
    }
    
}
