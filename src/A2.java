import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

public class A2 extends Application {

	Text label1 = new Text("Censored");
	Text label2 = new Text("     ");
	Text label3 = new Text("Replacement");
	Text label4 = new Text(" ");
	Text label5 = new Text("Raw Input");
	Text label6 = new Text(" ");
	Text label7 = new Text("Censored Version");
	Text label8 = new Text(" ");
    TextField text1 = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();

	void applyCensorRules()
	{
		String censored, replacement, rawText, censoredText;
		censored = text1.getText();
		replacement = text2.getText();
		rawText = text3.getText();
		censoredText = rawText.replace(censored, replacement);
		label7.setText(censoredText);
	}
	
	@Override
    public void start(Stage primaryStage) {

        label7.setFont(new Font(24));

        text1.setOnKeyReleased(e -> applyCensorRules());
        text2.setOnKeyReleased(e -> applyCensorRules());
        text3.setOnKeyReleased(e -> applyCensorRules());

        VBox root = new VBox();
        root.setAlignment(Pos.BASELINE_LEFT);

		HBox hbox1 = new HBox();

		VBox vbox11 = new VBox();
		vbox11.getChildren().add(label1);
		vbox11.getChildren().add(text1);
		hbox1.getChildren().add(vbox11);

		hbox1.getChildren().add(label2);

		VBox vbox12 = new VBox();
		vbox12.getChildren().add(label3);
		vbox12.getChildren().add(text2);

		hbox1.getChildren().add(vbox12);

		root.getChildren().add(hbox1);
		
        root.getChildren().add(label4);
		root.getChildren().add(label5);
        root.getChildren().add(text3);
        root.getChildren().add(label6);
        root.getChildren().add(label7);
        root.getChildren().add(label8);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Assignment 2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}