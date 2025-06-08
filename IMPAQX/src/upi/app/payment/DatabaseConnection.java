package upi.app.payment;

import java.sql.*;

public abstract class DatabaseConnection extends UPIabstract{

	private static final String URL="jdbc:mysql://localhost:3306/ImpaqX_upi";
	private static final String user_n="root";
	private static final String pass="Karthi@123";
	
	
	public static Connection getConection() throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	    return   DriverManager.getConnection(URL,user_n,pass);
	}

}
