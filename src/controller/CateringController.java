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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CateringController implements Initializable {
	
    @FXML
    private ImageView Home;

    @FXML
    private Button GetFood;

    @FXML
    private Button home;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	
public void home( ActionEvent ae)throws IOException {
		
		GetFood.getScene().getWindow().hide();
		Stage home = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Homepage.fxml"));
		Scene scene = new Scene(root);
		home.setScene(scene);
		home.show();
		home.setResizable(true);

}
}
