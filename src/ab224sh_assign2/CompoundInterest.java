package ab224sh_assign2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class CompoundInterest extends Application
{
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Compound Interest");
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.4));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		pane.add(new Label("Starting amount:"), 0, 0);
		pane.add(new Label("Interest:"), 0, 1);
		pane.add(new Label("Years:"), 0, 2);
		TextField amount = new TextField();
		TextField interest = new TextField();
		TextField years = new TextField();
		pane.add(amount, 1, 0);
		pane.add(interest, 1, 1);
		pane.add(years, 1, 2);
		Button calculate = new Button("Calculate");
		pane.add(calculate, 0, 3);
		GridPane.setHalignment(calculate, HPos.LEFT);
		Label result=new Label();
		pane.add(result, 0, 4);
		calculate.setOnAction(e -> {
			int res=interest(Integer.parseInt(amount.getText()),Integer.parseInt(interest.getText()),Integer.parseInt(years.getText()));
			result.setText("total: " + res);
		});
		Scene scene= new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static int interest(int startAmount, int interest, int years)
	{
		int total = startAmount;
		for (int i = 0; i < years; i++)
		{
			total += (interest * total) / 100;
		}
		return total;
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}
