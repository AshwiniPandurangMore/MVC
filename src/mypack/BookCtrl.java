package mypack;
import java.awt.event.*;

public class BookCtrl implements ActionListener
{
	BookView fr;
	BookModel md;
	public BookCtrl(BookView fr)
	{
		this.fr=fr;
		md=new BookModel();
	}
public void actionPerformed(ActionEvent evt)
{
	if(evt.getSource()==fr.b2)
	{
		Book b1=new Book();
		b1.setBookid(Integer.parseInt(fr.t1.getText()));
		b1.setTitle(fr.t2.getText());
		b1.setPrice(Integer.parseInt(fr.t3.getText()));
		md.addrec(b1);
	}
	else if(evt.getSource()==fr.b3)
	{
		Book b1=new Book();
		b1.setBookid(Integer.parseInt(fr.t1.getText()));
		b1.setTitle(fr.t2.getText());
		b1.setPrice(Integer.parseInt(fr.t3.getText()));
		md.modifyrec(b1);
	}
	else if(evt.getSource()==fr.b4)
	{
		Book b1=new Book();
		b1.setBookid(Integer.parseInt(fr.t1.getText()));
		md.delrec(b1);
	}
	else if(evt.getSource()==fr.b5)
	{
		Book b1=new Book();
		b1.setBookid(Integer.parseInt(fr.t1.getText()));
		b1=md.search(b1);
		fr.t1.setText(String.valueOf(b1.getBookid()));
		fr.t2.setText(b1.getTitle());
		fr.t3.setText(String.valueOf(b1.getPrice()));
	}
	else if(evt.getSource()==fr.b1)
	{
	fr.t1.setText("");
	fr.t2.setText("");
	fr.t3.setText("");
	}
		
	
	
}
}