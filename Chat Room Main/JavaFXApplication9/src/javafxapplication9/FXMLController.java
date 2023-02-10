/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahim
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     * @param event
     */
    
    @FXML
    public void GoTOopeningPage(ActionEvent event){
        Parent pane = null;
        
        try{
            pane = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene crtAcnt = new Scene(pane);
        window.setScene(crtAcnt);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
