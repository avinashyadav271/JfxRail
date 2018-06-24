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

public class MapController implements Initializable{
	
	
	   @FXML
	    private Button Home;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	
	
	}
		
		public void mapControl(ActionEvent e1)throws IOException{

			Home.getScene().getWindow().hide();
			Stage map = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
			Scene scene = new Scene(root);
			map.setScene(scene);
			map.show();
			map.setResizable(true);
		
		
	}
	

}
