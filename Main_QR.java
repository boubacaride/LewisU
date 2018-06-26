package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main_QR extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group root = new Group();
		Scene scene = new Scene(root, 500, 500, Color.WHITE);

		// Filled rectangle
		Rectangle rect1 = new Rectangle(40, 40, 50, 50);
		rect1.setFill(Color.BLACK);

		// Transparent rectangle with Stroke
		Rectangle rect2 = new Rectangle(5, 10, 120, 120);
		rect2.setFill(Color.TRANSPARENT);
		rect2.setStroke(Color.BLACK);
		rect2.setStrokeWidth(20);

		// Rectangle with Stroke, no Fill color specified
		Rectangle rect3 = new Rectangle(40, 410, 50, 50);
		rect3.setStroke(Color.BLACK);
		rect3.setStrokeWidth(10);

		// Transparent rectangle with Stroke
		Rectangle rect4 = new Rectangle(5, 375, 120, 120);
		rect4.setFill(Color.TRANSPARENT);
		rect4.setStroke(Color.BLACK);
		rect4.setStrokeWidth(20);

		// Rectangle with Stroke, no Fill color specified
		Rectangle rect5 = new Rectangle(410, 45, 50, 50);
		rect5.setStroke(Color.BLACK);
		rect5.setStrokeWidth(10);

		// Transparent rectangle with Stroke
		Rectangle rect6 = new Rectangle(375, 10, 120, 120);
		rect6.setFill(Color.TRANSPARENT);
		rect6.setStroke(Color.BLACK);
		rect6.setStrokeWidth(20);

		// Rectangle with Stroke, no Fill color specified
		Rectangle rect7 = new Rectangle(370, 380, 20, 20);
		rect7.setStroke(Color.BLACK);
		rect7.setStrokeWidth(10);
		// Rectangle with Stroke, no Fill color specified
		Rectangle rect8 = new Rectangle(340, 350, 80, 80);
		rect8.setFill(Color.TRANSPARENT);
		rect8.setStroke(Color.BLACK);
		rect8.setStrokeWidth(15);

		for (int i = 0; i <= 800; i++) {
			float x = (float) (Math.random() * 500);
			float y = (float) (Math.random() * 500);

			Rectangle r = new Rectangle(x, y, 5, 15);
			root.getChildren().add(r);// Add each rectangle to the Group.

		}

		for (int j = 0; j <= 800; j++) {
			float xo = (float) (Math.random() * 500);
			float yo = (float) (Math.random() * 500);

			Rectangle ro = new Rectangle(xo, yo, 10, 5);
			root.getChildren().add(ro);// Add each rectangle to the Group

		}

		root.getChildren().addAll(rect1, rect2, rect3, rect4, rect5, rect6, rect7, rect8);

		primaryStage.setTitle("SU18-CPSC-50100-XX Programming Fundamentals");

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
