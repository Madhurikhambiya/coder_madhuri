package lab_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_Example {
	public static void main(String[] args)  throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			//1. loader a connection register.
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection register");
			
			//2.Establish
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjd","root","Chammu@123#$");
			System.out.println("Connection Establish");
			
			ps = con.prepareStatement("CREATE TABLE user(id INT,name VARCHAR(50),email VARCHAR(50)");
			//ps.executeUpdate();
			
			//============INSERT===============
			//3. create statement/preparedStatement//collbaleStatement.
			
		//	ps = con.prepareStatement("INSERT INTO user(id,name,email)VALUES('1233','Madhuri','madhuri@gmail.com')");
			//ps.executeUpdate();
			
		//	ps = con.prepareStatement("INSERT INTO user(id,name,email)VALUES('123365','Monika','moni@gmail.com')");
		//	ps.executeUpdate();
			
			//4.Executing the query.
			
			ps = con.prepareStatement("Select * From  user");
			 
			   ResultSet rs  = ps.executeQuery();
			   while(rs.next()) {
				   int id = rs.getInt("id");
				   String name = rs.getString("name");
				   String email = rs.getString("email");
				  System.out.println("ID :" + id +" ,Name :" + name +" ,Email :" + email);
			   }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ps.close();
			con.close();
		
		
	}
  }
}
