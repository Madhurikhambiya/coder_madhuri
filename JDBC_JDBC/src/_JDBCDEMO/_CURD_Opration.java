package _JDBCDEMO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _CURD_Opration {
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
			
			ps = con.prepareStatement("CREATE TABLE Stu(name VARCHAR(50),rollno INT");
		
			
			
			// =======Insert=======
			//ps = con.prepareStatement("INSERT INTO Stu  VALUES('Madhuri',101)");
			//ps = con.prepareStatement("INSERT INTO Stu  VALUES('Rajnee',102)");
			//ps.executeUpdate();
		//	ps = con.prepareStatement("INSERT INTO Stu  VALUES(?,?)");
		//	ps.setString(1, "Kapil");
		//	ps.setInt(2, 104);
		//	ps.executeUpdate();
			
			//======Update=====
			//ps = con.prepareStatement("UPDATE  Stu SET name = 'Riya' WHERE rollno = 102");
		   // ps.executeUpdate();
			
			//======= Delete=====
			//ps = con.prepareStatement("Delete FROM Stu WHERE rollno = 102");
			//ps.executeUpdate();
			
			//======Select=======
			ps = con.prepareStatement("SELECT * FROM Stu");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				String Name1 = rs.getString("name");
				int Rollno1 = rs.getInt("rollno");
				System.out.println(Name1+" "+ Rollno1);
			}
			//4. Execute the query .
			//int count = ps.executeUpdate();
			//System.out.println(count)
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
