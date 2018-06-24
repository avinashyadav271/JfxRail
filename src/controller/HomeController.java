package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController implements Initializable{


    @FXML
    private Button book;

    @FXML
    private Button seat;

    @FXML
    private Button passgen;

    @FXML
    private Button contact;

    @FXML
    private Button service;
    
    @FXML
    private Button exit;
    

    @FXML
    private Button logout;

	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		
	
		
	}
	
	
	
	public void Exit(ActionEvent ae1)throws IOException{
		
		Platform.exit();
	}
	
	
public void Pnr(ActionEvent ae2)throws IOException{
		
		logout.getScene().getWindow().hide();
		Stage pnr = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Pnr.fxml"));
		Scene scene = new Scene(root);
		pnr.setScene(scene);
		pnr.show();
		pnr.setResizable(true);
		
	
	}
	
	
public void Passgen(ActionEvent ae3)throws IOException{
	
	logout.getScene().getWindow().hide();
	Stage home = new Stage();
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/PassGen.fxml"));
	Scene scene = new Scene(root);
	home.setScene(scene);
	home.show();
	home.setResizable(true);
	

}

	
	
	public void logOut(ActionEvent ae2)throws IOException{
		
		logout.getScene().getWindow().hide();
		Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
		Scene scene = new Scene(root);
		login.setScene(scene);
		login.show();
		login.setResizable(true);
		
	
	}
	
	
	public void ContactUs(ActionEvent ae)throws IOException
	
	{
		service.getScene().getWindow().hide();
	
		Stage  contact= new Stage();
		
	Parent root = FXMLLoader.load(getClass().getResource("/FXML/Contact.fxml"));
	Scene scene = new Scene(root);
	contact.setScene(scene);
	contact.show();
	contact.setResizable(true);
	
	}
	
	
		public void book(ActionEvent ae2)throws IOException{
			
			book.getScene().getWindow().hide();
			Stage  book= new Stage();
			
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Booking.fxml"));
			Scene scene = new Scene(root);
			book.setScene(scene);
			book.show();
			book.setResizable(true);
			
			
		}
	
		public void Service( ActionEvent ae)throws IOException {
			
			service.getScene().getWindow().hide();
			Stage home = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/FXML/Experience.fxml"));
			Scene scene = new Scene(root);
			home.setScene(scene);
			home.show();
			home.setResizable(true);
			
		
			
		}

}
