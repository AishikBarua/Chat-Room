/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication9;

//import java.awt.Desktop.Action;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
//import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author mahim
 */
public class FXMLDocumentController implements Initializable {
    
    //@FXML
    //private Label lblStatus;
    
    @FXML
    private CheckBox ChkBx;
    
    @FXML
    private TextField txtUserName;
    
    @FXML
    private TextField txtPassWord;
    
    @FXML
    private Hyperlink createAccnt;
    
    @FXML
    private ImageView img;
    
    @FXML
    Preferences prefer; 
    
    public void Submit(ActionEvent event) throws IOException{
        
        Parent pane = null;
        
        try{
            pane = FXMLLoader.load(getClass().getResource("Logged.fxml"));
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        Stage window = (Stage)ChkBx.getScene().getWindow();
        Scene crtAcnt = new Scene(pane);
        window.setScene(crtAcnt);
        window.show();
        
    }
    
    public void Check(ActionEvent event){
        if(ChkBx.isSelected()){
           prefer.put("txtUserName",txtUserName.getText());
           prefer.put("txtPassWord",txtPassWord.getText());
        }
        else{
           prefer.put("txtUserName","");
           prefer.put("txtPassWord","");
        }
    }

    public void CreateAccount(ActionEvent event)/*throws IOException*/{
        Parent pane = null;
        
        try{
            pane = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
        Stage window = (Stage)createAccnt.getScene().getWindow();
        Scene crtAcnt = new Scene(pane);
        window.setScene(crtAcnt);
        window.show();
    }
    
    public void HandleImage(ActionEvent event){
        Image image = new Image("");
        
        img.setImage(image);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        prefer = Preferences.userNodeForPackage(FXMLDocumentController.class);
        if(prefer.get("txtUserName", null) != null && prefer.get("txtPassWord", null) != null){
            txtUserName.setText(prefer.get("txtUserName", null));
            txtPassWord.setText(prefer.get("txtPassWord", null));
        }
        
    } 
    
}
