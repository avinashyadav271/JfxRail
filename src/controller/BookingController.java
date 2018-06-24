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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class BookingController implements Initializable {

	 @FXML
	    private TextField FName;

	    @FXML
	    private TextField LName;

	    @FXML
	    private TextField Mobile;

	    @FXML
	    private TextField Email;

	    @FXML
	    private RadioButton Male;

	    @FXML
	    private RadioButton Female;

	    @FXML
	    private RadioButton Other;

	    @FXML
	    private TextField Age;

	    @FXML
	    private DatePicker DateJourney;

	    @FXML
	    private TextField Source;

	    @FXML
	    private TextField Destination;

	    @FXML
	    private ComboBox<String> ChooseTrain;

	    @FXML
	    private Button Home;

	    @FXML
	    private RadioButton IClass;

	    @FXML
	    private RadioButton IIClass;
	    
	    
	    private Connection connection;
		
		private DBHandler handler;
		
		public PreparedStatement pst;	
		
		
		
		

	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		handler =new DBHandler();
		
	
			
		
		ChooseTrain.getItems().add("mumbai exp");
		
		ChooseTrain.getItems().add("Delhi exp");
		
		ChooseTrain.getItems().add("Ajmer exp");
		
		ChooseTrain.getItems().add("pune exp");
		
		ChooseTrain.getItems().add("kolkata exp");
		
		ChooseTrain.getItems().add("varanasi exp");
		
		ChooseTrain.getItems().add("Lucknow exp");
		
		ChooseTrain.getItems().add("patna exp");
		
		ChooseTrain.getItems().add("Jaipur exp");
		
		ChooseTrain.getItems().add("udaipur exp");
		
		ChooseTrain.getItems().add("Chennai exp");
		
		
		
		
		
	}
	

		
		
		
		
		@FXML
		public void BookingAction(ActionEvent ae1) throws Exception{
			System.out.println("Booking succesfull");
		

			
			
			String insert ="INSERT INTO booking(Fname,Lname,Mobile,Email,Gender,age,DOJ,Source,Destination,Train)"
					+"VALUES(?,?,?,?,?,?,?,?,?,?)";
			
			connection =handler.getConnection();
			try {
				pst =connection.prepareStatement(insert);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			try {
				pst.setString(1, FName.getText());

				
				
				pst.setString(2, LName.getText());
				

				pst.setString(3, Mobile.getText());
				
				pst.setString(4, Email.getText());
				

				pst.setString(5, getGender());

			
				
				pst.setString(6, Age.getText());
				
				pst.setString(7, DateJourney.getPromptText());
			
	

				pst.setString(8, Source.getText());
				

				pst.setString(9, Destination.getText());
				
				
				
				pst.setString(10, getClas());
				
				
				pst.executeUpdate();
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();		
			}	
		
		
		
		
		
		
	}
	
	public void Home( ActionEvent ae)throws IOException {
		
		Home.getScene().getWindow().hide();
		Stage home = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
		Scene scene = new Scene(root);
		home.setScene(scene);
		home.show();
		home.setResizable(true);
		
	
		
	}
	
	public String getClas()
	{
		String clas="";
		if(IClass.isSelected()) {
			clas="I Class";
			
		}
		else if(IIClass.isSelected()) {
			
			clas="II Class";
		}
		
		
		return clas;
		
	}
	
	public String getGender()
	{
		String gen="";
		
		if(Male.isSelected())
		{
			gen="Male";
			
		}
		
		else if(Female.isSelected())
		{
			gen="feMale";
			
		}
		return gen;
		
	
	
	

}
}


