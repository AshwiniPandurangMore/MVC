package mypack;
import java.sql.*;

public class BookModel
{
	public void addrec(Book b1)
	{
		try
		{
			DbConnection mycon=new DbConnection();
			PreparedStatement stat=mycon.con.prepareStatement("insert into book values(?,?,?)");
			stat.setInt(1, b1.getBookid());
			stat.setString(2, b1.getTitle());
			stat.setInt(3, b1.getPrice());
			stat.executeUpdate();
			System.out.println("Record inserted");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void modifyrec(Book b1)
	{
		try
		{
			DbConnection mycon=new DbConnection();
	PreparedStatement stat=mycon.con.prepareStatement("update book set title=?,price=? where bookid=?");
			stat.setInt(3, b1.getBookid());
			stat.setString(1, b1.getTitle());
			stat.setInt(2, b1.getPrice());
			stat.executeUpdate();
			System.out.println("Record updated");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void delrec(Book b1)
	{
		try
		{
			DbConnection mycon=new DbConnection();
	PreparedStatement stat=mycon.con.prepareStatement("delete from  book where bookid=?");
			stat.setInt(1, b1.getBookid());
			stat.executeUpdate();
			System.out.println("Record deleted");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public Book search(Book b1)
	{
		try
		{
			DbConnection mycon=new DbConnection();
	PreparedStatement stat=mycon.con.prepareStatement("select * from  book where bookid=?");
			stat.setInt(1, b1.getBookid());
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				b1.setBookid(rs.getInt(1));
				b1.setTitle(rs.getString(2));
				b1.setPrice(rs.getInt(3));
			}
			else
				System.out.println("Record not found");
			mycon.con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return b1;
	}

}