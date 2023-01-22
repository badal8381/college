import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class Question4 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			TextField tf = new TextField();
			tf.setFont(Font.font("TimesRoman", FontWeight.BOLD, 20));
			
			RadioButton rb1 = new RadioButton("Uppercase");
			RadioButton rb2 = new RadioButton("Lowercase");
			ToggleGroup tg = new ToggleGroup();
			rb1.setToggleGroup(tg);
			rb2.setToggleGroup(tg);
			
			
			tg.selectedToggleProperty().addListener(((observable, oldVal, newVal) -> {
				String value = ((RadioButton)tg.getSelectedToggle()).getText();
				if(value.equals("Uppercase")) {
					tf.setText(tf.getText().toUpperCase());
				}else if(value.equals("Lowercase")) {
					tf.setText(tf.getText().toLowerCase());
				}
			}));
			
			
			VBox vb = new VBox();
			vb.setSpacing(10);
			vb.getChildren().addAll(tf, rb1, rb2);
			
			root.setPadding(new Insets(10));
			root.setCenter(vb);
			Scene scene = new Scene(root,400,200);
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
