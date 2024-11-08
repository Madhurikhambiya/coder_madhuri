package Lab1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
	
	public static void main(String[] args) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		
		ResultSet rs = null;
		try {
			//1. loader or register the Deriver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver register");
			
			//2.Establish connection.
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmmm","root","Chammu@123#$");
			System.out.println("Connection Establish");
			
			ps = con.prepareStatement("create table Employee (emp_id,emp_name)") ;
			int count = ps.executeUpdate();
			System.out.println(count);
//          ps = con.prepareStatement("ALTER TABLE Employee ADD COLUMN salary int");
//		    ps.executeUpdate();
		   
//		
//			ps = con.prepareCall("CREATE TABLE Employee(eid int primary key AUTO_INCREMENT,name varchar(50),address varchar(50))");
//          ps.executeUpdate();
			
//			ps = con.prepareStatement("INSERT INTO Employee values(1,'nena','Bhopal',30000)");
//			ps.executeUpdate();
			
//			ps = con.prepareStatement("select * from Employee");
//		    rs = ps.executeQuery();
//			while(rs.next()) {
//				int eid1 = rs.getInt("eid");
//				String name1 = rs.getString("name");
//				String address1 = rs.getString("address");
//				int salary1 = rs.getInt("salary");
//				
//				System.out.println("ID :" + eid1);
//				System.out.println("NAME :" + name1);
//				System.out.println("ADDRESS :" + address1);
//				System.out.println("SALARY :" + salary1);
				
				
//				System.out.println("===============================================");
//			//	ps.executeQuery();
//			}
			
			
			
			
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(rs!=null) {
				rs.close();
				
			}
			ps.close();
			
			con.close();
		}
	
	}
}


