package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee_JDBC {
	public static void main(String[] args) throws SQLException {
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
			
		   ps = con.prepareStatement("CREATE TABLE Employee(emp_id INT,name VARCHAR(50),address VARCHAR(50),salary INT)");
		   //ps.executeUpdate();
		   
		   ps = con.prepareStatement("INSERT INTo  Employee VALUES(1,'priya','Kolkata',30000)");
		
		   ps = con.prepareStatement("INSERT INTo  Employee VALUES(2,'riya','bangalor',56000)");
		   ps.executeUpdate();
		   
		   ps = con.prepareStatement("select * from  employee");
		   ResultSet rs  = ps.executeQuery();
		   while(rs.next()) {
			   int emp_id1 = rs.getInt("emp_id");
			   String name1 = rs.getString("name");
			   String address1 = rs.getString("address");
			   int salary1 = rs.getInt("salary");
			   
			   System.out.println("ID :" + emp_id1);
			   System.out.println("Name:" + name1);
			   System.out.println("Address:" + address1);
			   System.out.println("salary:" + salary1);
			   
			   System.out.println("================================================");
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
