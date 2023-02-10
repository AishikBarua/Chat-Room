/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahim
 */
public class LoggedController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassWord;
    
    
    @FXML
    Preferences prefer; 
    
    @FXML
    public void LogOut(ActionEvent event){
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
        /*prefer = Preferences.userNodeForPackage(FXMLDocumentController.class);
        if(prefer.get("txtUserName", null) != null && prefer.get("txtPassWord", null) != null){
            txtUserName.setText(prefer.get("txtUserName", null));
            txtPassWord.setText(prefer.get("txtPassWord", null));*/
        }
    }    
    

