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
import javafx.stage.Stage;


public class ContactController implements Initializable{

	 @FXML
	    private Button home;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	@FXML
	public void Home(ActionEvent e1)throws IOException
	
	{
		home.getScene().getWindow().hide();
	
		Stage back = new Stage();
		
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
	Scene scene = new Scene(root);
	back.setScene(scene);
	back.show();
	back.setResizable(true);
	
	}
}

