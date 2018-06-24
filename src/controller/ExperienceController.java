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




public class ExperienceController implements Initializable {
	
	

    @FXML
    private Button Catering;

    @FXML
    private Button Maps;

    @FXML
    private Button Fares;

    @FXML
    private Button Refund;

    @FXML
    private Button Home;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		
		
		
	}

	public void HomeControl(ActionEvent e)throws IOException{
		
		Fares.getScene().getWindow().hide();
		Stage home = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
		Scene scene = new Scene(root);
		home.setScene(scene);
		home.show();
		home.setResizable(true);
		
		
		
		
	}
	
public void mapControl(ActionEvent e1)throws IOException{
		
		Fares.getScene().getWindow().hide();
		Stage map = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Maps.fxml"));
		Scene scene = new Scene(root);
		map.setScene(scene);
		map.show();
		map.setResizable(true);
		
}

public void FareControl(ActionEvent e12)throws IOException{
	
	Home.getScene().getWindow().hide();
	Stage fare = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Fare.fxml"));
	Scene scene = new Scene(root);
	fare.setScene(scene);
	fare.show();
	fare.setResizable(true);
}

public void CaterControl(ActionEvent e12)throws IOException{
	
	Home.getScene().getWindow().hide();
	Stage Cater = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Catering.fxml"));
	Scene scene = new Scene(root);
	Cater.setScene(scene);
	Cater.show();
	Cater.setResizable(true);
}
	
}
