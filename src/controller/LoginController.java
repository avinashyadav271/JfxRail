package controller;

import javafx.event.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import dbcontroller.*;
public class LoginController implements Initializable {
  
	
	@FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @FXML
    private CheckBox remember;

    @FXML
    private Button signup;

    @FXML
    private Button forgotpassword;
    
    
    
	private Connection connection;
	
	private DBHandler handler;
	
	private PreparedStatement pst;	


	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		username.setStyle("fx-text-innercolor: #D2D7D3;");
		password.setStyle("fx-text-innercolor: #D2D7D3;");
		
		handler =new DBHandler();
	}
      
	
	
	@FXML
	public void loginAction(ActionEvent e) throws IOException 
	{
		
		connection =handler.getConnection();
		String ql= "SELECT * from inform where name=? and password=?";
		
		try {
			pst=connection.prepareStatement(ql);
			
			pst.setString(1, username.getText());
			pst.setString(2, password.getText());
				ResultSet rs=pst.executeQuery();
		
		
			int count=0;
			
			while (rs.next());
			{
				count=count+1;
			}
			
			if (count==1){
				
				login.getScene().getWindow().hide();
				Stage home =new Stage();
				
				Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
				Scene scene =new Scene(root);
				home.setScene(scene);
				home.show();
				
				
			}
			else
			{
				Alert alert = new  Alert(AlertType.ERROR);
				
				alert.setHeaderText(null);
				alert.setContentText("username and password is incorrect");
				alert.show();
				
			}
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	
		
	
			

		finally {
		try {
			connection.close();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		}
	}
		
		@FXML
		public void signUp(ActionEvent e1)throws IOException
		
		{
			login.getScene().getWindow().hide();
		
			Stage signup = new Stage();
			
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/SignUp.fxml"));
		Scene scene = new Scene(root);
		signup.setScene(scene);
		signup.show();
		signup.setResizable(true);
		
		}
	}

