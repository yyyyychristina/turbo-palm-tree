package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;

import javafx.scene.Group;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Create a border pane 
	    Pane pane = new Pane();
		pane.setStyle(
	    	      "-fx-border-color: green; -fx-background-color: lightblue;");
		
		//Create a rectangle to hold the fan body
		Rectangle fanholder = new Rectangle();
		fanholder.setX(450);
		fanholder.setY(500);
		
		//bind fanholder's width and height with pane's width and height
		/**fanholder's width is much smaller, so pane.widthProperty is smaller, divided by 10
		 * fanholder's height is much larger(longer), so pane.heightProperty is larger */
		fanholder.widthProperty().bind(pane.widthProperty().divide(10));
		fanholder.heightProperty().bind(pane.heightProperty().divide(4));
		fanholder.setStroke(Color.CHOCOLATE);
		fanholder.setStrokeWidth(5);
		fanholder.setFill(Color.CORAL);
		pane.getChildren().add(fanholder);
		
		
		
		//Create a circle called fan body and set its properties
		Circle fanbody = new Circle();
		fanbody.centerXProperty().bind(pane.widthProperty().divide(2));
		fanbody.centerYProperty().bind(pane.heightProperty().divide(2.75));
		/**bind pane's width and height, fanbody's height is higher, so smaller no.*/
		fanbody.setRadius(240);
		fanbody.setStroke(Color.BLACK);
		fanbody.setStrokeWidth(4.0);
		fanbody.setFill(Color.WHITE);
		pane.getChildren().add(fanbody);
		
		//Create a group and add nodes to the group
		Group group = new Group();
		
		//Create eight polygons(having three sides) with random color(Fill) using for loop and rotate them
		for (int i = 0; i < 8; i++) {
			
			/**first loop*/
			//Create a polygon with points
			Polygon blade = new Polygon(450, 240, 290, 160, 370, 150);
		
			blade.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			blade.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			
			//Using a Rotate class to set e.g.(new Rotate(angle, pivotX, pivotY)
			blade.getTransforms().add(new Rotate(i * 45, 500, 274));
			
			//Add polygon to the group
			group.getChildren().add(blade);
		
			//Add listeners when fanbody's centerX and centerY change 
			/**centerX change -> blade's first point(0)(x- coordinate) change regarding pane's width
			 * centerY change -> blade's second point(1)(y- coordinate) change regarding pane's height
			 * pane's width and pane's height similar to fanbody's */
			fanbody.centerXProperty().addListener(ov -> {blade.getPoints().set(0, pane.getWidth() / 2);});
			fanbody.centerYProperty().addListener(ov -> {blade.getPoints().set(1, pane.getHeight() / 2.75);});	
			/**first loop*/
		}
		
		//Add group to the pane
		pane.getChildren().add(group);

		// create sixteen fan grill with black color using for loop and rotate them
		for (int i = 0; i < 16; i++) {
        /**first loop*/
		Line fangrill = new Line(330, 100, 470, 240);
		
		fangrill.setStroke(Color.BLACK);
		fangrill.setStrokeWidth(5);
		
		//Using a Rotate class to set i.e(new Rotate(angle, pivotX, pivotY)
		/**for 16 fangrill lines, the angle will be half of blade's rotation angle
		 * the pivotX and pivotY are the same as blade's pivotX and pivotY*/
		fangrill.getTransforms().add(new Rotate(i * 22.5, 500, 274));
		
		//Add line to the pane
		pane.getChildren().add(fangrill);
		
		//add listener when fanbody's centerX and centerY change
		/**centerX change -> fangrill's endX change regarding pane's width
		 * centerY change - > fangrill's endY change regarding pane's height
		 * pane's width and height similar to fanbody's*/
		fanbody.centerXProperty().addListener(ov -> {fangrill.setEndX(pane.getWidth() / 2);});
		fanbody.centerYProperty().addListener(ov -> {fangrill.setEndY(pane.getHeight() / 2.75);});
		/**first loop*/
		}
		
		//Create a circle called fancenter in the middle of the fan body and set its properties
		Circle fancenter = new Circle();
		fancenter.centerXProperty().bind(pane.widthProperty().divide(2));
		fancenter.centerYProperty().bind(pane.heightProperty().divide(2.75));
		/**fancenter has the same radius as fanbody which bind pane's width and height*/
		fancenter.setRadius(fanbody.getRadius() / 4);
		fancenter.setStroke(Color.PALEGOLDENROD);
		fancenter.setStrokeWidth(2.5);
		fancenter.setFill(Color.NAVY);
		pane.getChildren().add(fancenter);
		

		//Create an arc for holding buttons
		
		//Three buttons in the arc
		

		//Create a rotate transition
		RotateTransition pt = new RotateTransition();
		pt.setDuration(Duration.millis(4000));
		pt.setNode(group);		
		pt.setByAngle(360);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		//Create a event handler to pause and resume animation
		/**when mouse clicks on pane
		 * if animation is paused, play the animation
		 * if animation is played, pause the animation */
		pane.setOnMouseClicked(e -> {
			if (pt.getStatus() == Animation.Status.PAUSED )
				pt.play();
			else
				pt.pause();
		});
		
		//Create a text and add it to the pane
		Text text1 = new Text(600, 600, "Product with Quality");
		text1.setFont((Font.font("Times New Roman", FontPosture.ITALIC, 48)));
		pane.getChildren().add(text1);
		
		// Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 1000, 740);
	    primaryStage.setTitle("Draw Fan"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
