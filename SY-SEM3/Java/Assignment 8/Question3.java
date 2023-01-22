import javafx.application.Application;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;


public class Question3 extends Application {
	BallPane ball = new BallPane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			HBox buttons = new HBox();
			VBox vb = new VBox();
			BorderPane root = new BorderPane();
		
			Label lblTitle = new Label("Moving Circle");
			lblTitle.setFont(Font.font("consolas", FontWeight.BLACK, 20));
			
			
			buttons.getChildren().addAll(createButton("Left"), createButton("Right"), createButton("UP"), createButton("Down"), createButton("Expand"), createButton("Shrink"));
			buttons.setPadding(new Insets(10));
			buttons.setSpacing(10);
			
			
			vb.getChildren().addAll(lblTitle, buttons);
			vb.setAlignment(Pos.TOP_CENTER);
			
			root.setPadding(new Insets(10));
			
			root.setTop(vb);
			root.setCenter(ball);
			
			Scene scene = new Scene(root,600,500);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Moving Circle");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private Button createButton(String name) {
		Button btn = new Button(name);
		btn.setFont(Font.font(16));
		btn.setPrefSize(90, 30);
		btn.setOnAction(e->{
			String b = ((Button)e.getSource()).getText();
			switch(b) {
				case "Left" : 	ball.moveLeft(); break;
				case "Right" : 	ball.moveRight(); break;
				case "UP" : 	ball.moveUp(); break;
				case "Down" :	ball.moveDown(); break;
				case "Expand" : ball.expand(); break;
				case "Shrink" : ball.shrink(); break;
			}
		});
		
		return btn;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

class BallPane extends Pane{
	private double radius = 15;
	private double width = 600;
	private double height = 400;
	Circle ball = new Circle(width / 3, height / 2, radius);
	
	BallPane(){
		ball.setFill(Color.PURPLE);
		ball.setStroke(Color.BLACK);
		getChildren().add(ball);
	}
	
	public void moveLeft() {
		if(ball.getRadius() < ball.getCenterX()) {
			ball.setCenterX(ball.getCenterX() - 10);
		}
	}
	
	public void moveRight() {
		if(ball.getCenterX() < width - ball.getRadius()) {
			ball.setCenterX(ball.getCenterX() + 10);
		}
	}
	
	public void moveUp() {
		if(ball.getRadius() < ball.getCenterY()) {
			ball.setCenterY(ball.getCenterY() - 10);
		}
	}
	
	public void moveDown() {
		if(ball.getCenterY() < height - ball.getRadius()) {
			ball.setCenterY(ball.getCenterY() + 10);
		}
	}
	
	public void expand() {
		if(ball.getRadius() < 200)
			ball.setRadius(ball.getRadius()+10);
	}
	
	public void shrink() {
		if(ball.getRadius() > 10)
			ball.setRadius(ball.getRadius()-10);
	}
}



