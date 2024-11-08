package Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction_Management {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection register");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjd","root","Chammu@123#$");
			System.out.println("Connection Establish");
			
			try {
			//	ps = con.prepareStatement("CREATE TABLE Student(name VARCHAR(50),batchno INT");
				con.setAutoCommit(false);
				Statement st1 = con.createStatement();
				int count1 = st1.executeUpdate("insert into iteam values(101,'jeans',999)");
				int count2 = st1.executeUpdate("insert into iteam valueS(102,'shirt',799)");
				int count3 = st1.executeUpdate("insert into iteam  values(103,'top',990)");
				
				if(count1>0 && count2>0 && count3>0) {
					con.commit();
					System.out.println("sucess");
				}else {
					con.rollback();
					System.out.println("fail");
				}
				
				
			}
			catch(Exception e) {
				try {
					con.rollback();
					System.out.println("fail");
				}catch(SQLException ee) {
					ee.printStackTrace();
				}
				
			}
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
