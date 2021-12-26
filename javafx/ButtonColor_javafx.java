package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ButtonColor_javafx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button red = new Button("RED");
        Button green = new Button("GREEN");
        Button blue = new Button("BLUE");
        Button pink = new Button("PINK");
        Button black = new Button("BLACK");
        Font font = Font.font("Courier New", FontWeight.BOLD, 20);
        red.setFont(font);
        green.setFont(font);
        blue.setFont(font);
        pink.setFont(font);
        black.setFont(font);
        Label l1=new Label("Aryan Chandrakar\n18BCI0174");
        l1.setFont(Font.font("Courier New", FontWeight.BOLD, 15));
        
        red.setStyle("-fx-background-color: red");
        green.setStyle("-fx-background-color: green");
        blue.setStyle("-fx-background-color: blue");
        pink.setStyle("-fx-background-color: pink");
        black.setStyle("-fx-background-color: black");
        
		// print on console
        red.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                   System.out.println("RED was clicked");
	    }});
        green.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                   System.out.println("GREEN was clicked");
	    }});
        blue.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                   System.out.println("BLUE was clicked");
	    }});
        pink.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                   System.out.println("PINK was clicked");
	    }});
        black.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event){
                   System.out.println("BLACK was clicked");
	    }});
        
        GridPane gp=new GridPane();
		gp.setVgap(5);
		gp.setHgap(5);
		gp.setAlignment(Pos.CENTER);
		gp.add(red, 2, 0);
		gp.add(green, 2, 1);
		gp.add(blue, 2, 2);
		gp.add(pink, 2, 3);
		gp.add(black, 2, 4);
		gp.add(l1, 0, 2);
		
		Scene scene=new Scene(gp,600,600);  
	    primaryStage.setScene(scene);  
	    primaryStage.setTitle("Colors");  
	    primaryStage.show(); 
	}

}
