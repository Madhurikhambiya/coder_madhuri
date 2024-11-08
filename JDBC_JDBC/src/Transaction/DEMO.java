package Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DEMO {
	public static void main(String[] args) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connection register");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcjd","root","Chammu@123#$");
			System.out.println("Connection Establish");
			
			con.setAutoCommit(false);
			try {
				
				PreparedStatement ps1 = con.prepareStatement("insert into iteam values(101,'jeans',999)");
				PreparedStatement ps2 = con.prepareStatement ("insert into iteam valuES(102,'shirt',799)");
				PreparedStatement ps3 = con.prepareStatement("insert into iteam  values(103,'top',990)");
				
				int count1 = ps1.executeUpdate();
				int count2 = ps1.executeUpdate();
				int count3 = ps1.executeUpdate();
				
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
				}
				catch(SQLException ee) {
					ee.printStackTrace();
				}
				
			}
			
		
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	
}



