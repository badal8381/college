import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;


public class Question2 extends Application {
	private TextField tfTexts = new TextField();
	private long result = 0;
	private long num1 = 0;
	private String op="";
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			StackPane sp = new StackPane();
			GridPane gp = new GridPane();
			
			
			tfTexts.setFont(Font.font(20));
			tfTexts.setPrefHeight(50);
			tfTexts.setAlignment(Pos.CENTER_RIGHT);
			
			sp.getChildren().add(tfTexts);
			sp.setPadding(new Insets(10));
			tfTexts.setEditable(false);

			//Adding Components to the gridpane
			gp.setHgap(10);
			gp.setVgap(10);
			gp.setPadding(new Insets(10));
			gp.addRow(1, createNumButton("7"), createNumButton("8"), createNumButton("9"), createOpButton("+"));
			gp.addRow(2, createNumButton("4"), createNumButton("5"), createNumButton("6"), createOpButton("-"));
			gp.addRow(3, createNumButton("1"), createNumButton("2"), createNumButton("3"), createOpButton("x"));
			gp.addRow(4, createClearButton("C"), createNumButton("0"), createOpButton("="), createOpButton("/"));
			
			//Adding stackpane to top and borderpan to center
			root.setTop(sp);
			root.setCenter(gp);
			Scene scene = new Scene(root,350,300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Calculator");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Button createNumButton(String s) {
		Button btn = new Button(s);
		btn.setFont(Font.font(20));
		btn.setPrefSize(80, 40);
		btn.setOnAction(e -> {
			String value = ((Button)e.getSource()).getText();
			tfTexts.setText(tfTexts.getText() + value);
		});
		return btn;
	}
	
	public Button createOpButton(String s) {
		Button btn = new Button(s);
		btn.setFont(Font.font(20));
		btn.setPrefSize(80, 40);
		btn.setOnAction(e -> {
			String value = ((Button)e.getSource()).getText();
			if(!tfTexts.getText().isEmpty()) {
				if(!value.equals("=")) {
					if(!op.isEmpty())
						return;
					num1 = Long.parseLong(tfTexts.getText());
					op = value;
					tfTexts.setText("");
				}else {
					if(op.isEmpty())
						return;
					long num2 = Long.parseLong(tfTexts.getText());
					result = calculate(num1, num2, op);
					op="";
					tfTexts.setText(String.valueOf(result));
				}
			}
		});
		return btn;
	}
	
	private long calculate(long num1, long num2, String op) {
		switch(op) {
			case "+": return num1+num2;
			case "-": return num1-num2;
			case "x": return num1*num2;
			case "/": return (num2 == 0) ? (0) : (num1/num2); 
		}
		return 0;
	}
	
	public Button createClearButton(String s) {
		Button btn = new Button(s);
		btn.setFont(Font.font(20));
		btn.setPrefSize(80, 40);
		btn.setOnAction(e -> {
			tfTexts.setText("");
		});
		return btn;
	}
	
	public void handleButton(ActionEvent e) {
		tfTexts.setText("Hello World!!");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
