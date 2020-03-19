import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Border;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.geometry.Pos;
import javafx.scene.text.Font;

public class Task2 extends Application {
    Text item = new Text("Item");
    TextField item1 = new TextField();
    TextField item2 = new TextField();
    TextField item3 = new TextField();
    Text total = new Text("Total");
    Text num = new Text("#");
    TextField num1 = new TextField();
    TextField num2 = new TextField();
    TextField num3 = new TextField();
    Text value = new Text("Value");
    TextField value1 = new TextField();
    TextField value2 = new TextField();
    TextField value3 = new TextField();
    Text price = new Text("Price");
    Text price1 = new Text("");
    Text price2 = new Text("");
    Text price3 = new Text("");
    Text total_price = new Text("");

    /*void applyCensorRules()
    {
        String censored, replacement, rawText, censoredText;
        censored = text1.getText();
        replacement = text2.getText();
        rawText = text3.getText();
        censoredText = rawText.replace(censored, replacement);
        label7.setText(censoredText);
    }*/

    @Override
    public void start(Stage primaryStage) {

//        label7.setFont(new Font(24));

        /*text1.setOnKeyReleased(e -> applyCensorRules());
        text2.setOnKeyReleased(e -> applyCensorRules());
        text3.setOnKeyReleased(e -> applyCensorRules());*/
        HBox root = new HBox();
        VBox vbox1 = new VBox(10);
        VBox vbox2 = new VBox(10);
        VBox vbox3 = new VBox(10);
        VBox vbox4 = new VBox(10);

        root.setPadding(new Insets(5,10,0,10));
        root.setAlignment(Pos.CENTER);
        vbox4.setMinWidth(50);
        vbox4.setAlignment(Pos.BASELINE_RIGHT);
        price.setTextAlignment(TextAlignment.RIGHT);
        total.setFont(new Font(15));

        vbox1.getChildren().add(item);
        vbox1.getChildren().add(item1);
        vbox1.getChildren().add(item2);
        vbox1.getChildren().add(item3);
        vbox1.getChildren().add(total);
        vbox2.getChildren().add(num);
        vbox2.getChildren().add(num1);
        vbox2.getChildren().add(num2);
        vbox2.getChildren().add(num3);
        vbox3.getChildren().add(value);
        vbox3.getChildren().add(value1);
        vbox3.getChildren().add(value2);
        vbox3.getChildren().add(value3);
        vbox4.getChildren().add(price);
        vbox4.getChildren().add(price1);
        vbox4.getChildren().add(price2);
        vbox4.getChildren().add(price3);
        vbox4.getChildren().add(total_price);
        root.getChildren().add(vbox1);
        root.getChildren().add(vbox2);
        root.getChildren().add(vbox3);
        root.getChildren().add(vbox4);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Price Calculation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}