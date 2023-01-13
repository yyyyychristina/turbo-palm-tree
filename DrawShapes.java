// Zareh Gorjian
// Program that draws shapes using JavaFX libraries

package drawShapesPKG;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class DrawShapes extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a circle and set its properties
    Circle circle = new Circle();
    circle.setCenterX(100);
    circle.setCenterY(100);
    circle.setRadius(50);
    circle.setStroke(Color.BLACK);
    circle.setStrokeWidth(3.0);
    circle.setFill(Color.BLUE);
    
    Rectangle r = new Rectangle();
    r.setX(250);
    r.setY(50);
    r.setWidth(200);
    r.setHeight(100);
    r.setArcWidth(20);
    r.setArcHeight(20);
    r.setFill(Color.RED);
    
    // Create a pane to hold the circle 
    Pane pane = new Pane();
    pane.getChildren().add(circle);
    
    pane.getChildren().add(r);
    
        
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 500, 200);
    primaryStage.setTitle("Draw Shapes"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  void DrawMyStuff(Pane myPane, Shape myShape)
  {
	  myPane.getChildren().add(myShape);
  }
  
  
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
  
  
}

