package javafx;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.*;
import javafx.event.*;

import java.util.*;

public class Calculator_javafx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label l1=new Label("First number: ");
		l1.setMaxWidth(200);
		TextField t1=new TextField(); //input 1
		t1.setMaxWidth(200);
		
		Label l2=new Label("Second number: ");
		l2.setMaxWidth(200);
		TextField t2=new TextField(); //input 2
		t2.setMaxWidth(200);
		
		Label t3=new Label(""); //output
		t3.setMaxHeight(20);
		
		Label t4=new Label("--------------------------------"); //output
		t4.setMaxHeight(20);
		Label t5=new Label("Hello 18BCI0174 Aryan Chandrakar"); //output
		t5.setMaxHeight(20);
		
		Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        
        Font font = Font.font("Courier New", FontWeight.BOLD, 20);
        plus.setFont(font);
        minus.setFont(font);
        multiply.setFont(font);
        divide.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);
        t4.setFont(font);
        t5.setFont(font);
        l1.setFont(font);
        l2.setFont(font);
        
        plus.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String a=t1.getText();
				String b=t2.getText();
				int sum=Integer.valueOf(a)+Integer.valueOf(b);
				t3.setText("Sum of "+a+" & "+b+" = "+sum);
			}
        });
        minus.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String a=t1.getText();
				String b=t2.getText();
				int diff=Integer.valueOf(a)-Integer.valueOf(b);
				t3.setText("Difference of "+a+" & "+b+" = "+diff);
			}
        });
        multiply.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String a=t1.getText();
				String b=t2.getText();
				int pdt=Integer.valueOf(a)*Integer.valueOf(b);
				t3.setText("Product of "+a+" & "+b+" = "+pdt);
			}
        });
        divide.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String a=t1.getText();
				String b=t2.getText();
				int div=Integer.valueOf(a)/Integer.valueOf(b);
				t3.setText("Division of "+a+" & "+b+" = "+div);
			}
        });
        
		GridPane gp=new GridPane();
		gp.setVgap(5);
		gp.setHgap(5);
		gp.setAlignment(Pos.CENTER);
		
		gp.add(t5, 0, 0);
		gp.add(l1, 0, 1);
		gp.add(t1,1, 1);
		gp.add(l2, 0, 2);
		gp.add(t2,1, 2);
		gp.add(plus,2,1);
		gp.add(minus,2,2);
		gp.add(multiply,2,3);
		gp.add(divide,2,4);
		gp.add(t3, 0, 4);
		gp.add(t4, 0, 3);
		//gp.addRow(1,plus,minus,multiply,divide);
		//gp.addRow(2,t3);
		
		Scene scene=new Scene(gp,600,600);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Calculator");  
	    primaryStage.show(); 
	}

}
