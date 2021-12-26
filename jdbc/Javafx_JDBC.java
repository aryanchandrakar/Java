package jdbc;

import java.sql.*;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


class Employee{
private String name;
private String password;

    public Employee(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public void insertstudent() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        dbmsconnction dbmscon=new dbmsconnction("jdbc:mysql://localhost:3307/employee?useTimezone=true&serverTimezone=UTC","root",""); //calling constructor
        Connection con=dbmscon.getConnection(); // calling connecting method
        String sql="INSERT INTO `login`(`name`, `password`) VALUES (?,?)";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1,name);
        stmt.setString(2,password);
        stmt.executeUpdate();
        dbmscon.close(con, stmt); // closing connection method
    }      
}

class dbmsconnction{
    String url;
    String uname;
    String pwd;

    public dbmsconnction(String url, String uname, String pwd) {
        this.url = url;
        this.uname = uname;
        this.pwd = pwd;
    }
    
    public Connection getConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    Connection con=null;//Establish a connection
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//loads the driver
        //define the connection propertiesi.e dbname, username and password
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/employee?useTimezone=true&serverTimezone=UTC","root","");
        return con;
    }
    
    public void close(Connection con,Statement stmt) throws SQLException{
    stmt.close();
    con.close();
    System.out.println("Connection closed");
    }
    
}


class MyloginForm {

	Label lname;
    TextField tname;
    Label lpwd;
    TextField tpwd;
    Button bSubmit;
    Label lerrormsg;
   
    public void myform(Stage primaryStage){
        lname=new Label("Enter your name");
        tname=new TextField();
        lpwd=new Label ("Ener your password");
        tpwd=new TextField();
        lerrormsg=new Label();
        bSubmit=new Button("Submit");
        GridPane root=new GridPane();
        root.add(lname,0,0);
        root.add(lpwd,0,2);
        root.add(tname,1,0);
        root.add(tpwd,1,2);
        root.add(bSubmit,0,3);
        root.add(lerrormsg,0,4);
        
        Scene sc=new Scene(root,500,300);
        primaryStage.setScene(sc);
        primaryStage.show();

        bSubmit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                boolean flag=true;
                if(tpwd.getText().isEmpty()){
                    lerrormsg.setText("Enter your name");
                    flag=false;
                }
                if(tname.getText().isEmpty()){
                    lerrormsg.setText("Enter your pssword");
                    flag=false;
                }
               
                Employee e=new Employee(tname.getText(),tpwd.getText());             
                try {
                    e.insertstudent();
                    if(flag)
                      lerrormsg.setText("Record inserted Successfully");
                    else
                       lerrormsg.setText("Record Not inserted Successfully");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }               
                }             

        });         
    }
}

public class Javafx_JDBC extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
       MyloginForm login=new MyloginForm();
       login.myform(primaryStage);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
