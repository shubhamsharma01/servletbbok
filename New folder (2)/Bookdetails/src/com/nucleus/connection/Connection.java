package com.nucleus.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	Connection con;
	public  Connection getConnection()
	
	{
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
		
		}
		catch (ClassNotFoundException e) 
		{e.printStackTrace();}
	catch (SQLException e) 
	{e.printStackTrace();}
		return con;

	}
}
