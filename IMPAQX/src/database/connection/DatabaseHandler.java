package database.connection;

import java.sql.*;

public class DatabaseHandler implements Iphone  {
	

	private static final String url="jdbc:mysql://localhost:3306/impaqx";
	private static final String username="root";
	private static final String password="Karthi@123";
	
	

	public void insertData(ModelClass device)
	{  
		
	   String sql="INSERT INTO PHONE VALUES(?,?,?,?)";
	   
		try {
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection established");
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, device.getModel());
		ps.setString(2, device.getName());
		ps.setString(3, device.getOS());
		ps.setInt(4, device.getPrice());
		
		ps.executeUpdate();
		System.out.println("Row is created");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
