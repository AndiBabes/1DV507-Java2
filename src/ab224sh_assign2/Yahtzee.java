package ab224sh_assign2;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class Yahtzee
{
	public void start(Stage primaryStage)
	{
		VBox root=new VBox();
		root.setSpacing(5);
		Label title=new Label("Yahtzee");
		GridPane pane=new GridPane();
		int[] dice=new int[5];
		Image die1=new Image("1.png");
		Image die2=new Image("2.png");
		Image die3=new Image("3.png");
		Image die4=new Image("4.png");
		Image die5=new Image("5.png");
		Image die6=new Image("6.png");
		ImageView view1=new ImageView(die1);
		ImageView view2=new ImageView(die2);
		ImageView view3=new ImageView(die3);
		ImageView view4=new ImageView(die4);
		ImageView view5=new ImageView(die5);
		pane.add(view1, 0, 0);
		pane.add(view2, 1, 0);
		pane.add(view3, 2, 0);
		pane.add(view4, 3, 0);
		pane.add(view5, 4, 0);
		root.getChildren().addAll(title,pane);
		Scene scene=new Scene(root, 600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
