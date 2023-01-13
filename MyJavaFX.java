//Chingwing Yeung
//Assignment11
//11/25/2022

package myJavaFXpkg;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class MyJavaFX extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
double sum = 45.6;
		
		// Create a scene and place a button in the scene.
		Pane pane = new Pane();
		Button btOK = new Button("OK");
		btOK.setLayoutX(20);
		btOK.setLayoutY(80);
		pane.getChildren().add(btOK);
			
		Button SecondBtn = new Button("Second");
		SecondBtn.setLayoutX(100);
		SecondBtn.setLayoutY(80);
		pane.getChildren().add(SecondBtn);
		
		/**Add buttons for all the number in a calculator (0-9)*/
		Button one = new Button("1");
		one.setLayoutX(20);          
		one.setLayoutY(500);
		pane.getChildren().add(one);
		
		Button two = new Button("2");
		two.setLayoutX(60);      //move right
		two.setLayoutY(500);
		pane.getChildren().add(two);
		
		Button three = new Button("3");
		three.setLayoutX(100);   //move right
		three.setLayoutY(500);
		pane.getChildren().add(three);
		
		Button four = new Button("4");
		four.setLayoutX(20);     //same x as one
		four.setLayoutY(460);    //move higher
		pane.getChildren().add(four);
		
		Button five = new Button("5");
		five.setLayoutX(60);     //move right
		five.setLayoutY(460);
		pane.getChildren().add(five);
		
		Button six = new Button("6");
		six.setLayoutX(100);    //move right
		six.setLayoutY(460);
		pane.getChildren().add(six);
		
		Button seven = new Button("7");
		seven.setLayoutX(20);    //same x as one
		seven.setLayoutY(420);   //move higher
		pane.getChildren().add(seven);
		
		Button eight = new Button("8");
		eight.setLayoutX(60);    //move right
		eight.setLayoutY(420);
		pane.getChildren().add(eight);
		
		Button nine = new Button("9");
		nine.setLayoutX(100);    //move right
		nine.setLayoutY(420);   
		pane.getChildren().add(nine);
		
		Button zero = new Button("0");
		zero.setLayoutX(60);      //same x as two
		zero.setLayoutY(540);     //mover lower
		pane.getChildren().add(zero);
		
		/**(+/-)positive and negative sign and (.)decimal point : subject to change*/
		Button positiveornegative = new Button("+/-");
		positiveornegative.setLayoutX(20);      //move left
		positiveornegative.setLayoutY(540);     
		pane.getChildren().add(positiveornegative);
		
		Button decimalpoint = new Button(".");
		decimalpoint.setLayoutX(100);      //move right of zero
		decimalpoint.setLayoutY(540);     
		pane.getChildren().add(decimalpoint);
		
		/**Add buttons for addition, subtraction, multiplication and division*/
		Button additon = new Button("+");
		additon.setLayoutX(140);  
		additon.setLayoutY(500);    //same y as one
		pane.getChildren().add(additon);
		
		Button subtraction = new Button("-");
		subtraction.setLayoutX(140);  
		subtraction.setLayoutY(460);    //move higher
		pane.getChildren().add(subtraction);
		
		Button multiplication = new Button("*");
		multiplication.setLayoutX(140);  
		multiplication.setLayoutY(420);    //move higher
		pane.getChildren().add(multiplication);
		
		Button divison = new Button("/");
		divison.setLayoutX(140);  
		divison.setLayoutY(380);    //move higher
		pane.getChildren().add(divison);
		
		/**Add button for the equal sign(=) */
		Button equalsign = new Button("=");
		equalsign.setLayoutX(140);  
		equalsign.setLayoutY(540);    //same y as zero
		pane.getChildren().add(equalsign);
		
		
		Label myLabel = new Label("123456");
		myLabel.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.REGULAR,20));
		myLabel.setStyle("-fx-border-color: blue;");
		myLabel.setAlignment(Pos.BASELINE_RIGHT); // align text to the right side of the label.
		myLabel.setLayoutX(10);       // set the x location of the label
		myLabel.setLayoutY(10);       // set the y location of the label
		myLabel.setPrefSize(250, 20); // set the width and height of the label
		myLabel.setText("123456789"); // put some numbers into the label
		pane.getChildren().add(myLabel);
		myLabel.setText(Double.toString(sum));
		
		Scene scene = new Scene(pane,280,600);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
