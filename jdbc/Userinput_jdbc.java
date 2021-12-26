package jdbc;
import java.sql.*;
import java.util.*;

public class Userinput_jdbc {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Connection conn=null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel?useTimezone=true&serverTimezone=UTC","root",""); 
			// getConnection("jdbc:mysql://localhost:3307/DB_NAME?useTimezone=true&serverTimezone=UTC","root",""); //change accordingly
			System.out.println("Connection Successful");
			
			// INSERTING RECORD
			// getting input from user 
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id:");
			String id= sc.nextLine();
			System.out.println("Enter food name:");
			String name=sc.nextLine();
			System.out.println("Enter cost:");
			Float cost=sc.nextFloat();
			System.out.println("Enter quantity:");
			int qua=sc.nextInt();
			
			// query
			String sql="INSERT INTO `fooditems`(`id`, `name`, `price`, `quantity`) VALUES (?,?,?,?)";
			
			//creating PREPARED STATEMENT for executing USER DEFINED sql query
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setFloat(3, cost);
			pst.setInt(4, qua);
			
			// executing query
			pst.execute();
			System.out.println("Record entered successfully.");
			
			
			// UPDATING RECORD
			// getting update record from user
			Scanner s=new Scanner(System.in);
			System.out.println("Enter id:");
			String idu= s.nextLine();
			System.out.println("Enter quantity:");
			int quau=s.nextInt();
			
			// query
			String sqlu="UPDATE `fooditems` SET `quantity`=? WHERE `id`=?";
			//creating PREPARED STATEMENT for executing USER DEFINED sql query
			PreparedStatement pstu=conn.prepareStatement(sqlu);
			pstu.setInt(1, quau);
			pstu.setString(2, idu);
			// executing query
			pstu.execute();
			System.out.println("Record updated successfully.");
			
			
			// DELETEING RECORD
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter id:");
			String idd= scn.nextLine();
			// query
			String sqld="DELETE FROM `fooditems` WHERE `id`=?";
			PreparedStatement pstd=conn.prepareStatement(sqld);
			pstd.setString(1, idd);
			//executing
			pstd.execute();
			System.out.println("Record deleted successfully.");
			
			// closing statement, connection
			pst.close();
			pstu.close();
			pstd.close();
			conn.close();
			s.close();
			sc.close();
			scn.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
