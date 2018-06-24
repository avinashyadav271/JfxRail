package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PnrController implements Initializable {

	
	
	
    @FXML
    private TextField enterpnr;

    @FXML
    private Button getpnr;

    @FXML
    private Button home;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	
	public void Home (ActionEvent ae)throws IOException{
		
		home.getScene().getWindow().hide();
		
		Stage  Pnr= new Stage();
		
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
	Scene scene = new Scene(root);
	Pnr.setScene(scene);
	Pnr.show();
	Pnr.setResizable(true);
	
		
		
		
	}
}
