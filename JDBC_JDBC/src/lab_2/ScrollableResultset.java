package lab_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ScrollableResultset {
	public static void main(String[] args)   throws Exception{
		Connection con = null;
		PreparedStatement ps = null;
		
		//1. loader connection Register
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connection Register");
		
		//2. Establish connection
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjd","root","Chammu@123#$");
		System.out.println("Establish Connection");
		
		
		
		
		
		
		
		
	}
	
}
	
					