package javafx;
import javafx.stage.Stage;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AirTicket_javafx extends Application{
	Scene booked, details;
	TextField source,destination,passenger;
	ToggleGroup group;
	DatePicker date;
	String src,des,pass,cls;
	LocalDate dat;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label l0=new Label("Aryan Chandrakar's Airline");

		Label l1=new Label("Source: ");
		l1.setMaxWidth(200);
		source=new TextField(); // source
		source.setMaxHeight(20);
		
		Label l2=new Label("Destination: ");
		l2.setMaxWidth(200);
		destination=new TextField(); // destination
		destination.setMaxHeight(20);
		
		Label l3=new Label("Date: ");
		l3.setMaxWidth(200);
		date = new DatePicker(); // date
		
		Label l4=new Label("# Passengers: ");
		l4.setMaxWidth(200);
		passenger=new TextField(); //number of passenger
		passenger.setMaxHeight(20);
		
		Label l5=new Label("Class: ");
		l5.setMaxWidth(200);
		group = new ToggleGroup();  
	    RadioButton button1 = new RadioButton("Business");  
	    RadioButton button2 = new RadioButton("First");  
	    RadioButton button3 = new RadioButton("Economy");  
	    button1.setToggleGroup(group);  
	    button2.setToggleGroup(group);  
	    button3.setToggleGroup(group);  
	    
		Button book = new Button("BOOK TICKET!"); // button
		
		// design
		Font font = Font.font("Courier New", FontWeight.BOLD, 20);
		l0.setFont(font);
		l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
        source.setFont(font);
        destination.setFont(font);
        passenger.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        book.setFont(font);
        
        
        //scene 1
		GridPane gp1=new GridPane();
		gp1.setVgap(5);
		gp1.setHgap(5);
		gp1.setAlignment(Pos.CENTER);
		gp1.add(l0, 1, 0);
		gp1.add(l1, 0, 1);
		gp1.add(source, 2, 1);
		gp1.add(l2, 0, 2);
		gp1.add(destination, 2, 2);
		gp1.add(l3,0,3);
		gp1.add(date, 2, 3);
		gp1.add(l4, 0, 4);
		gp1.add(passenger, 2, 4);
		gp1.add(l5, 0, 5);
		gp1.add(button1, 2, 5);
		gp1.add(button2, 2, 6);
		gp1.add(button3, 2, 7);
		gp1.add(book, 1, 8);
		details=new Scene(gp1,600,600);  
		
		// booking
        //book.setOnAction(e->primaryStage.setScene(booked));
		book.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				src=source.getText();
				des=destination.getText();
				dat=date.getValue();
				pass=passenger.getText();
				RadioButton rb = (RadioButton)group.getSelectedToggle();
				cls=rb.getText();
			
		//scene 2
		
			Label q0=new Label("BOARDING PASS");
			Label q1=new Label("Source: "+src);
			Label q2=new Label("Destination: "+des);
			Label q3=new Label("Date: "+dat);
			Label q4=new Label("No. of Passenger: "+pass);
			Label q5=new Label("Class: "+cls);
			q0.setFont(font);
			q1.setFont(font);
			q2.setFont(font);
	        q3.setFont(font);
	        q4.setFont(font);
	        q5.setFont(font);
	        q0.setTextFill(Color.web("blue"));
	        q1.setStyle("-fx-border-style: dotted;  -fx-border-color: black; -fx-border-width: 1");
	        q2.setStyle("-fx-border-style: dotted;  -fx-border-color: black; -fx-border-width: 1");
	        q3.setStyle("-fx-border-style: dotted;  -fx-border-color: black; -fx-border-width: 1");
	        q4.setStyle("-fx-border-style: dotted;  -fx-border-color: black; -fx-border-width: 1");
	        q5.setStyle("-fx-border-style: dotted;  -fx-border-color: black; -fx-border-width: 1");
	        
			GridPane gp2=new GridPane();
			booked=new Scene(gp2,600,600);
			gp2.setVgap(5);
			gp2.setHgap(5);
			gp2.setAlignment(Pos.CENTER);
			gp2.add(q0, 0, 0);
			gp2.add(q1, 0, 1);
			gp2.add(q2, 0, 2);
			gp2.add(q3, 0, 3);
			gp2.add(q4, 0, 4);
			gp2.add(q5, 0, 5);
			primaryStage.setScene(booked);  
		    primaryStage.setTitle("Air Ticket");  
		    primaryStage.show();
			}
        });
	    primaryStage.setScene(details);  
	    primaryStage.setTitle("Air Ticket");  
	    primaryStage.show();
	}

}
