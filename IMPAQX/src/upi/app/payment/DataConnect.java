package upi.app.payment;

import java.sql.*;

public class DataConnect {


	public static void transaction(String reciever, int amount, int balance) 
	{
		try {
		Connection con=DatabaseConnection.getConection();
		String sql="insert into payment(reciever_name,Amount_sent,balance) values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
	
		ps.setString(1, reciever);
		
		ps.setInt(2, amount);
		
		ps.setInt(3,balance);
		
		ps.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
	}
	public static void getTransactionHistory()
	{
		try {
			Connection con=DatabaseConnection.getConection();
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from payment");
			
			while(rs.next())
			{
				System.out.println("Id : "+rs.getInt("id")+",Reciever name :  "+rs.getString("reciever_name")+",Amount sent : "+rs.getInt("Amount_sent")+",Balance : "+rs.getInt("balance"));
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
