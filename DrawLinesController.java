// Fig. 4.26: DrawLinesController.java
// Using strokeLine to draw the fanning
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;  // Canvas provides the drawing area
import javafx.scene.canvas.GraphicsContext; // provides various methods
											// for drawing onto canvas
public class DrawLinesController {

    @FXML
    private Canvas canvas; // used to get the GraphicsContext
 
    // when user presses Draw Lines button, draw a fanning in the Canvas  
    @FXML
    void drawLinesButtonPressed(ActionEvent event) {
    	// get the GraphicsContext, which is used to draw Lines in the Canvas
    	GraphicsContext gc = canvas.getGraphicsContext2D();

    	// draw the fanning
    	int counter = 0;
    	double deltaX = canvas.getHeight()/ 20;
    	double deltaY = canvas.getWidth() / 20;
    	
    	while (counter <= 20) {
    		gc.strokeLine(0, 0, canvas.getHeight() - deltaY * counter, deltaX * counter);
    		
    		counter++;
    	}
    }

}
