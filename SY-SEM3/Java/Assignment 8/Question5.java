import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;


public class Question5 extends Application {
	private String message = "", gender, python, skill, finance, city, college;
	
	private String cities[] = {"Pune", "Mumbai", "Bengaluru", "Gorakhpur", "Hyderabad"};
	String pune_colleges[] = {"SP College", "FC College", "Pune University", "Garware College", "Sinhgad College"};
	String mumbai_colleges[] = {"Thakur College", "Mumbai University"};
	String bengaluru_colleges[] = {"Bengaluru University"};
	String gorakhpur_colleges[] = {"DDU University"};
	String hyderabad_colleges[] = {"Hyderabad University"};
	
	Label lblMsg = new Label();
	@Override
	public void start(Stage primaryStage) {
		try {
			//Gridpane Layout
			GridPane root = new GridPane();
			
			//Labels
			Label lblName = new Label("Name: ");
			Label lblEmail = new Label("Email: ");
			Label lblMobile = new Label("Mobile: ");
			Label lblGender = new Label("Gender: ");
			Label lblSub = new Label("Select Subjects: ");
			Label lblCity = new Label("City: ");
			Label lblCollege = new Label("College Name: ");
			Label lblSuccess = new Label();
			
			//TextFields for Name, Email and Mobile
			TextField tfName = new TextField();
			tfName.setPromptText("Enter Name..");
			
			TextField tfEmail = new TextField();
			tfEmail.setPromptText("Enter Email..");
			
			TextField tfMobile = new TextField();
			tfMobile.setPromptText("Enter Mobile no..");
			
			//Changing fonts of TextFields
			tfName.setFont(Font.font("TimesRoman", FontWeight.NORMAL, 14));
			tfEmail.setFont(Font.font("TimesRoman", FontWeight.NORMAL, 14));
			tfMobile.setFont(Font.font("TimesRoman", FontWeight.NORMAL, 14));
			
			
			//RadioButton for Gender
			RadioButton rbM = new RadioButton("Male");
			RadioButton rbF = new RadioButton("Female");
			RadioButton rbO = new RadioButton("Other");
			ToggleGroup tg = new ToggleGroup();
			
			//Adding RadioButtons into Togglegroup
			rbM.setToggleGroup(tg);
			rbF.setToggleGroup(tg);
			rbO.setToggleGroup(tg);
			
			tg.selectedToggleProperty().addListener(((observable, oldVal, newVal) -> {
				try {
					if(newVal.isSelected())
						gender = ((RadioButton)tg.getSelectedToggle()).getText();
				}catch(Exception ex) {};
			}));
			
	
			
			//CheckBoxes
			CheckBox ckPython = new CheckBox("Python");
			CheckBox ckSkill = new CheckBox("Soft skills");
			CheckBox ckFin = new CheckBox("Finance");
			ckPython.setOnAction(e->{
				if(((CheckBox)e.getSource()).isSelected()) {
					python = "Python, ";
				}if(!((CheckBox)e.getSource()).isSelected()) {
					python = " ";
				}
			});
			
			ckSkill.setOnAction(e->{
				if(((CheckBox)e.getSource()).isSelected()) {
					skill = "Soft skills, ";
				}if(!((CheckBox)e.getSource()).isSelected()) {
					skill = " ";
				}
			});
			
			ckFin.setOnAction(e->{
				if(((CheckBox)e.getSource()).isSelected()) {
					finance = "Finance";
				}if(!((CheckBox)e.getSource()).isSelected()) {
					finance = " ";
				}
			});
			
			
			// ComboBox for City
			ComboBox<String> cbCity = new ComboBox<String>();
			cbCity.setPromptText("Select City");
			cbCity.getItems().addAll(cities);
			cbCity.setPrefSize(150, 30);
			
			// ComboBox for College
			ComboBox<String> cbCollege = new ComboBox<String>();
			cbCollege.setPromptText("Select College");
			cbCollege.setPrefSize(150, 30);
			
			cbCity.setOnAction(e->{
				city = ((ComboBox<?>)e.getSource()).getValue().toString();
				
				switch(city) {
					case "Pune" : 	cbCollege.getItems().clear();
									cbCollege.getItems().addAll(pune_colleges); 
									break;
									
					case "Mumbai":	cbCollege.getItems().clear();
									cbCollege.getItems().addAll(mumbai_colleges); 
									break;
									
					case "Bengaluru":	cbCollege.getItems().clear();
										cbCollege.getItems().addAll(bengaluru_colleges); 
										break;
										
					case "Gorakhpur":	cbCollege.getItems().clear();
										cbCollege.getItems().addAll(gorakhpur_colleges); 
										break;
										
					case "Hyderabad":	cbCollege.getItems().clear();
										cbCollege.getItems().addAll(hyderabad_colleges); 
										break;
				}
			});
			
			
			cbCollege.setOnAction(e->{
				college = ((ComboBox<?>)e.getSource()).getValue().toString();
			});
			
			
			//Ok Button
			Button btnOk = new Button("Ok");
			btnOk.setFont(Font.font(16));
			btnOk.setPrefSize(100, 30);
			
			btnOk.setOnAction(e->{
				gender = (gender==null) ? "": gender;
				python = (python==null) ? "": python;
				skill = (skill==null) ? "": skill;
				finance = (finance==null) ? "": finance;
				city = (city==null) ? "": city;
				college = (college==null) ? "": college;
				
				message = "\nName: " + tfName.getText() + "\nEmail: "+tfEmail.getText() + "\nMobile: " + tfMobile.getText();
				message += "\nGender: " + gender + "\nSubjects: "+ python + skill + finance;
				message += "\nCity: " + city + "\nCollege: " + college;
				
				lblSuccess.setText("Submitted Successfully..");
				lblMsg.setText("Submitted Data is...\n" + message);
				

				StackPane s = new StackPane(); 
				s.getChildren().add(lblMsg);
				Scene msg = new Scene(s, 400, 400);
				Stage showMsg = new Stage();
				showMsg.setScene(msg);
				showMsg.show();
			});
			
			
			// Cancel Button
			Button btnCancel = new Button("Cancel");
			btnCancel.setFont(Font.font(16));
			btnCancel.setPrefSize(100, 30);
			
			btnCancel.setOnAction(e->{
				tfName.setText("");
				tfEmail.setText("");
				tfMobile.setText("");
				
				try {
					tg.getSelectedToggle().setSelected(false);
				}catch(Exception ex) {};
				
				if(ckPython.isSelected())
					ckPython.setSelected(false);
				
				if(ckSkill.isSelected())
					ckSkill.setSelected(false);
				
				if(ckFin.isSelected())
					ckFin.setSelected(false);
				
				cbCity.setValue("");
				cbCollege.setValue("");
				lblSuccess.setText("");
			});
			
			//Adding all the elements into the GridPane
			root.add(lblGender, 0, 3, 1, 3);
			root.add(lblSub, 0, 6, 1, 3);
			root.add(lblSuccess, 0, 12, 2, 1);
			
			root.addRow(0, lblName, tfName);
			root.addRow(1, lblEmail, tfEmail);
			root.addRow(2, lblMobile, tfMobile);
			root.addRow(3, rbM);
			root.addRow(4, rbF);
			root.addRow(5, rbO);
			root.addRow(6, ckPython);
			root.addRow(7, ckSkill);
			root.addRow(8, ckFin);
			root.addRow(9, lblCity, cbCity);
			root.addRow(10, lblCollege, cbCollege);
			root.addRow(11, btnOk, btnCancel);
			
			root.setPadding(new Insets(10));
			root.setHgap(10);
			root.setVgap(10);
			
			
			Scene scene = new Scene(root,350,450);
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
