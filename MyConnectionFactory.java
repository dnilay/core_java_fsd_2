package comm.example.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionFactory {
	
	
	private static Connection connection;
	
	
	private MyConnectionFactory()
	{
		try{
		
			if(connection==null)
			{
				//step-1
				//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				//step-2
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root@123");
				System.out.println("connection established...");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static Connection getMyConnection()
	{
		MyConnectionFactory factory=new MyConnectionFactory();
		return MyConnectionFactory.connection;
	}

}
