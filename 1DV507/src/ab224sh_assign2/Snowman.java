package ab224sh_assign2;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Snowman extends Application
{
	public void start(Stage primaryStage)
	{
		Group root=new Group();
		Rectangle sky=new Rectangle();
		sky.setWidth(680);
		sky.setHeight(350);
		sky.setFill(Color.DODGERBLUE);
		Circle sun=new Circle(550,95,50,Color.YELLOW);
		Circle bottom=new Circle(340,320,50,Color.WHITE);
		Circle middle=new Circle(340,250,35,Color.WHITE);
		Circle head=new Circle(340,197,25,Color.WHITE);
		Circle rightEye=new Circle(330,190,3,Color.BLACK);
		Circle leftEye=new Circle (350,190,3,Color.BLACK);
		Circle nose=new Circle(340,197,4,Color.ORANGERED);
		Line mouth=new Line(333,205,347,205);
		mouth.setStroke(Color.BLACK);
		mouth.setStrokeWidth(2);
		Circle button1=new Circle(340,220,3,Color.BLACK);
		Circle button2=new Circle(340,235,3,Color.BLACK);
		Circle button3=new Circle(340,250,3,Color.BLACK);
		root.getChildren().addAll(sky,sun,bottom,middle,head,leftEye,rightEye,mouth,nose,button1,button2,button3);
		Scene scene=new Scene(root, 640, 480);
		primaryStage.setTitle("Snowman");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
