package javafx;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;


public class ClickToHelloTerminal_javafx extends Application {   
	public static void main(String[] args) {
	      launch(args);
	    }
	     @Override
	    public void start(Stage primaryStage) throws Exception {
	       Button btn=new Button("Click me");
	        Button exit=new Button("Exit");
	       btn.setOnAction(new EventHandler<ActionEvent>(){
	             public void handle(ActionEvent event){
	                    System.out.println("HelloWorld");
	       } 
	       });
	       exit.setOnAction(e-> System.exit(0));
	       VBox sp=new VBox();
	       sp.getChildren().addAll(btn,exit);
	       Scene scene=new Scene(sp);
	       primaryStage.setScene(scene);
	       primaryStage.setTitle("My First JavaFX App");
	       primaryStage.setWidth(500);
	       primaryStage.setHeight(300);
	       primaryStage.show();
	    }    

	    public ClickToHelloTerminal_javafx() {
	    }
	}