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

import java.awt.event.KeyEvent;
import java.util.logging.Handler;

public class Task3_keyRelease extends Application{
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
    Text price_space = new Text("");
    Text price1 = new Text("");
    Text price1_space = new Text("");
    Text price2 = new Text("");
    Text price2_space = new Text("");
    Text price3 = new Text("");
    Text price3_space = new Text("");
    Text total_price = new Text("");

    double price_item1,price_item2,price_item3,sum;

    public void Calculator1() {
        try{
            price_item1 = Double.parseDouble(num1.getText())*Double.parseDouble(value1.getText());
            price1.setText(String.format("%.2f",price_item1));
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
        catch(NumberFormatException ex){
            price1.setText("");
            price_item1 = 0;
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
    }
    public void Calculator2(){
        try{
            price_item2 = Double.parseDouble(num2.getText())*Double.parseDouble(value2.getText());
            price2.setText(String.format("%.2f",price_item2));
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
        catch(NumberFormatException ex){
            price2.setText("");
            price_item2 = 0;
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
    }
    public void Calculator3(){
        try{
            price_item3 = Double.parseDouble(num3.getText())*Double.parseDouble(value3.getText());
            price3.setText(String.format("%.2f",price_item3));
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
        catch(NumberFormatException ex){
            price3.setText("");
            price_item3 = 0;
            sum = price_item1+price_item2+price_item3;
            total_price.setText(String.format("%.2f",sum));
        }
    }
//    public void Calculator(TextField lable_num, TextField lable_value, Text lable_price, double record){ }

    public void start(Stage primaryStage){
        HBox root = new HBox();
        VBox vbox1 = new VBox(10);
        VBox vbox2 = new VBox(10);
        VBox vbox3 = new VBox(10);
        VBox vbox4 = new VBox();

        root.setPadding(new Insets(5,10,0,10));
        root.setAlignment(Pos.CENTER);
        vbox4.setMinWidth(50);
        vbox4.setAlignment(Pos.BASELINE_RIGHT);
        price.setTextAlignment(TextAlignment.RIGHT);
        total.setFont(new Font(15));
        total_price.setFont(new Font(15));

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
        vbox4.getChildren().add(price_space);
        vbox4.getChildren().add(price1);
        vbox4.getChildren().add(price1_space);
        vbox4.getChildren().add(price2);
        vbox4.getChildren().add(price2_space);
        vbox4.getChildren().add(price3);
        vbox4.getChildren().add(price3_space);
        vbox4.getChildren().add(total_price);
        root.getChildren().add(vbox1);
        root.getChildren().add(vbox2);
        root.getChildren().add(vbox3);
        root.getChildren().add(vbox4);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Price Calculation");
        primaryStage.setScene(scene);
        primaryStage.show();

        num1.setOnKeyReleased(e ->Calculator1());
        num2.setOnKeyReleased(e -> Calculator2());
        num3.setOnKeyReleased(e -> Calculator3());
        value1.setOnKeyReleased(e -> Calculator1());
        value2.setOnKeyReleased(e -> Calculator2());
        value3.setOnKeyReleased(e -> Calculator3());
    }
    public static void main(String[] args) {
        launch(args);
    }

}
