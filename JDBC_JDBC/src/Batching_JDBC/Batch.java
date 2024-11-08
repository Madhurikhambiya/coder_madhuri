package Batching_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch {
	public static void main(String[] args) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
             //1. load or register the drive
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drive Register");
			
			//2. Establish connection
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjd","root","Chammu@123#$");
			System.out.println("connection Establish");
			
			//3. create statement/preparedStatement//collbaleStatement.
			
			ps = con.prepareStatement("CREATE TABLE Student(name VARCHAR(50),batchno INT");
			
			Statement st = con.createStatement();
			st.addBatch("INSERT INTO Student VALUES ('Rohit',111)");
			st.addBatch("INSERT INTO Student VALUES ('Reena',112)");
			st.addBatch("INSERT INTO Student VALUES ('Riya',113)");
			
			int[] count = st.executeBatch();
			for(int i:count) {
				System.out.println(i);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		finally{
			ps.close();
		    con.close();
			
		}
	
		
	}

}
