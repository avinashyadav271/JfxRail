package controller;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import dbcontroller.DBHandler;


public class SignupController implements Initializable{

	  @FXML
	    private TextArea Address;

	    @FXML
	    private TextField country;

	    @FXML
	    private TextField Mobile;

	    @FXML
	    private TextField Email;

	    @FXML
	    private RadioButton male;

	    @FXML
	    private RadioButton female;

	    @FXML
	    private Button Submit;

	    @FXML
	    private Button Reset;

	    @FXML
	    private TextField surname;

	    @FXML
	    private TextField name;

	    @FXML
	    private Button Login;
	    
	    @FXML
	    private DatePicker dob;

	    @FXML
	    private TextField password;

	    
	    
	private Connection connection;
	
	private DBHandler handler;
	
	public PreparedStatement pst;	
	
	@Override
	public void initialize(URL args0, ResourceBundle args1)
	{
		
		name.setStyle("fx-text-innercolor: #D2D7D3;");
		password.setStyle("fx-text-innercolor: #D2D7D3;");
		surname.setStyle("fx-text-innercolor: #D2D7D3;");
		handler =new DBHandler();
	}
	
	

    public void Submit(ActionEvent as) {
    	int count=0;
   
		if(count!=10) {
			
			Alert alert = new  Alert(AlertType.ERROR);
			
			alert.setHeaderText(null);
			alert.setContentText("MobileNO is incorrect");
			alert.show();
			
		}
    }
		
	
	@FXML
	public void SignupAction(ActionEvent ae) throws Exception{
		System.out.println("Signup succesfully");
	

		
		
		String insert ="INSERT INTO inform(name,surname,password,dob,Address,country,mobile,Email,Gender)"
				+"VALUES(?,?,?,?,?,?,?,?,?)";
		
		connection =handler.getConnection();
		try {
			pst =connection.prepareStatement(insert);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		try {
			pst.setString(1, name.getText());

			
			
			pst.setString(2, surname.getText());
			

			pst.setString(3, password.getText());

			
			pst.setString(4, dob.getPromptText());
		

			pst.setString(5, Address.getText());
			
			

			pst.setString(6, country.getText());
			

			pst.setString(7, Mobile.getText());

			pst.setString(8, Email.getText());

			

			
			pst.setString(9, getGender());
			
			
			pst.executeUpdate();
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();		
		}	
	}
	
	
	
	
	
	
	@FXML
	public void loginAction(ActionEvent ae1)throws IOException {
		
		Submit.getScene().getWindow().hide();
		
		
		Stage login = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginMain.fxml"));
		Scene scene = new Scene(root);
		login.setScene(scene);
		login.show();
		login.setResizable(true);
	}
	
	public String getGender()
	{
		String gen="";
		
		if(male.isSelected())
		{
			gen="Male";
			
		}
		
		else if(female.isSelected())
		{
			gen="feMale";
			
		}
	
	
	    return gen;
	}

	
		
	
	
}
		
		
		
		
	
 

		