package jdbc;
import java.sql.*;

public class Hotel_JDBC {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Connection conn=null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/hotel?useTimezone=true&serverTimezone=UTC","root",""); 
			// getConnection("jdbc:mysql://localhost:3307/DB_NAME?useTimezone=true&serverTimezone=UTC","root",""); //change accordingly
			System.out.println("Connection Successful");
			
			Statement st=conn.createStatement(); // for update queries
			st.executeUpdate("INSERT INTO `fooditems`(`id`, `name`, `price`, `quantity`) VALUES ('002','Biryani',100,1)"); // TO INSERT RECORD
			System.out.println("Insertion Successful");
			st.executeUpdate("DELETE FROM `fooditems` WHERE id='002'"); // TO DELETE RECORD
			System.out.println("Deletion Successful");			
			
			
			Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); // for select queries
			// To move the cursor back and forth else it would go in forward direction only
			ResultSet rs=stmt.executeQuery("SELECT * FROM `fooditems`"); // TO SELECT RECORD - store output in result set
			if(rs.next()==false) {
				System.out.println("No Records");
			}
			else {
				rs.previous(); // cursor moves to next leaving 1st row so move cursor to previous row
				while(rs.next()) {
					System.out.println(rs.getString(1)); // GET 1st COLUMN with format STRING 
					System.out.println(rs.getString(2)); // GET 2nd COLUMN with format STRING 
					System.out.println(rs.getFloat(3)); // GET 3rd COLUMN with format FLOAT
					System.out.println(rs.getInt(4)); // GET 4th COLUMN with format INT
				}
				System.out.println("Records on display");
			}
			
			st.close();
			stmt.close();
			conn.close();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
