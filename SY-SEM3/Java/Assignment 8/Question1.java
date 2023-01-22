import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;


public class Question1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Label lblName = new Label("Name: ");
			lblName.setTextFill(Color.BLACK);
			lblName.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
			lblName.setBorder(Border.stroke(Color.YELLOW));
			
			Label lblId = new Label("ID: ");
			lblId.setTextFill(Color.BLUE);
			lblId.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
			lblId.setBorder(Border.stroke(Color.YELLOW));
			
			Label lblAddress = new Label("Address: ");
			lblAddress.setTextFill(Color.CYAN);
			lblAddress.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
			lblAddress.setBorder(Border.stroke(Color.YELLOW));
			
			Label lblPhone = new Label("Phone: ");
			lblPhone.setTextFill(Color.GREEN);
			lblPhone.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
			lblPhone.setBorder(Border.stroke(Color.YELLOW));
			
			VBox vb = new VBox();
			vb.getChildren().addAll(lblName, lblId, lblAddress, lblPhone);
			
			root.setCenter(vb);
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
