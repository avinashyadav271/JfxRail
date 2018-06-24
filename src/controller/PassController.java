package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import dbcontroller.DBHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PassController implements Initializable {

	
	
	
	
	  @FXML
	    private TextField source;

	    @FXML
	    private TextField destination;

	    @FXML
	    private RadioButton mth1;

	    @FXML
	    private RadioButton mth2;

	    @FXML
	    private RadioButton mth3;

	    @FXML
	    private RadioButton class1;

	    @FXML
	    private RadioButton class2;

	    @FXML
	    private Button getpass;

	    @FXML
	    private Button home;
	    
	    private Connection connection;
		
	  		private DBHandler handler;
	  		
	  		public PreparedStatement pst;	
	  		
	  		

	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
		handler =new DBHandler();
		
	}
	
	
	@FXML
	public void BookingAction(ActionEvent ae1) throws Exception{
		System.out.println("Booking succesfull");
	

		
		
		String insert ="INSERT INTO pass(Source,Destination,duration,class)"
				+"VALUES(?,?,?,?)";
		
		connection =handler.getConnection();
		try {
			pst =connection.prepareStatement(insert);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		try {
			pst.setString(1, source.getText());

			
			
			pst.setString(2, destination.getText());
			

			pst.setString(3, getDuration());
			
			pst.setString(4, getClas());
			
			
			pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();		
		}	
	}
	
		
		public String getClas()
		{
			String clas="";
			if(class1.isSelected()) {
				clas="I Class";
				
			}
			else if(class2.isSelected()) {
				
				clas="II Class";
			}
			
			
			
			return clas;
		}
			
			
			public String getDuration()
			{
				String Duration="";
				if(mth1.isSelected()) {
					Duration="mth 1";
					
				}
				else if(mth2.isSelected()) {
					
					Duration="mth 2";
				}
				
				else if(mth3.isSelected()) {
					
					Duration="mth 3";
				}
				
				
				
				return Duration;
				
		}
	
	
	public void Home(ActionEvent ae)throws IOException {
		
		getpass.getScene().getWindow().hide();
		Stage home = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
		Scene scene = new Scene(root);
		home.setScene(scene);
		home.show();
		home.setResizable(true);
		
		
	}
	}
	
	


