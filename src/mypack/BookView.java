package mypack;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class BookView extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	JPanel p1;
	public BookView()
	{
		p1=new JPanel();
		//setLayout(new FlowLayout());
		l1=new JLabel("Enter Bookid");
		l2=new JLabel("Enter BookTitle");
		l3=new JLabel("Enter BookPrice");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b1=new JButton("Clear");
		b2=new JButton("Add");
		b3=new JButton("Modify");
		b4=new JButton("Delete");
		b5=new JButton("Search");
		b1.addActionListener(new BookCtrl(this));
		b2.addActionListener(new BookCtrl(this));
		b3.addActionListener(new BookCtrl(this));
		b4.addActionListener(new BookCtrl(this));
		b5.addActionListener(new BookCtrl(this));
		getContentPane().add(p1);
		/*getContentPane().add(t1);
		getContentPane().add(l2);
		getContentPane().add(t2);
		getContentPane().add(l3);
		getContentPane().add(t3);
		getContentPane().add(b1);*/
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		setSize(400,400);
		setVisible(true);
	}
		
	public static void main(String args[])
	{
		BookView fr=new BookView();
	}

}