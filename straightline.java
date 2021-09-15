package straightline;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class straightline extends Application
{
    public void start(Stage primaryStage) throws Exception
    {
        //Creating a line object
        Line line=new Line();
        // Setting Properties to the Line
        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndX(500.0);
        line.setEndY(150.0);
        Group root=new Group(line);
        Scene scene=new Scene(root,600,400);
        scene.setFill(Color.BROWN);
        primaryStage.setTitle("straight line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}