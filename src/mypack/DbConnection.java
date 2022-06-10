package mypack;
import java.sql.*;

public class DbConnection
{
	public Connection con=null;
	public DbConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/colg","root","root");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}