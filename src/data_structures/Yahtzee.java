package data_structures;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class Yahtzee extends Application
{
	public void start(Stage primaryStage)
	{
		VBox layout = new VBox();
		layout.setSpacing(5);
		Label title = new Label("Yahtzee");
		title.setFont(new Font("Comfortaa", 42));
		GridPane pane = new GridPane();
		int die1 = 1, die2 = 2, die3 = 3, die4 = 4, die5 = 5;
		Image img1=new Image("1.png");
		Image img2=new Image("2.png");
		Image img3=new Image("3.png");
		Image img4=new Image("4.png");
		Image img5=new Image("5.png");
		Image img6=new Image("6.png");
		ImageView view1=new ImageView(img1);
		ImageView view2=new ImageView(img2);
		ImageView view3=new ImageView(img3);
		ImageView view4=new ImageView(img4);
		ImageView view5=new ImageView(img5);
		/*pane.add(view1, 0, 0);
		pane.add(view2, 1, 0);
		pane.add(view3, 2, 0);
		pane.add(view4, 3, 0);
		pane.add(view5, 4, 0);*/
		pane.add(new Label("aaa"), 0, 0);
		layout.getChildren().addAll(title,pane);
		
		Scene scene=new Scene(layout,600,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
