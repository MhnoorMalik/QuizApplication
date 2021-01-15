import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;
import javax.swing.*;
public class Subjects implements ActionListener {
	JFrame jf;
	JLabel lb;
	JButton c,java,physics,os;
	public Subjects()
	{
		jf=new JFrame("Quiz Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		lb=new JLabel("Choose Course");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(200,25,500,50);
		c=new JButton("C++");
		c.setForeground(Color.black);
		c.setBackground(Color.LIGHT_GRAY);
		c.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
		c.setBounds(150,125,150,150);
		java=new JButton("Java");
		java.setForeground(Color.black);
		java.setBackground(Color.LIGHT_GRAY);
		java.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
		java.setBounds(350,125,150,150);
		physics=new JButton("Physics");
		physics.setForeground(Color.black);
		physics.setBackground(Color.LIGHT_GRAY);
		physics.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
		physics.setBounds(150,300,150,150);
		os=new JButton("OS");
		os.setForeground(Color.black);
		os.setBackground(Color.LIGHT_GRAY);
		os.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
		os.setBounds(350,300,150,150);
		jf.add(lb);
		jf.add(c);
		jf.add(java);
		jf.add(os);
		jf.add(physics);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    c.addActionListener(this);
	    java.addActionListener(this);
	    os.addActionListener(this);
	    physics.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==c)
		{
			jf.dispose();
			C cl=new C();
		}
		else if(e.getSource()==java)
		{
			 jf.dispose();
			 Java j=new Java();
		}
		else if(e.getSource()==physics)
		{
			jf.dispose();
			physicsTopic pt=new physicsTopic();
		}
		else if(e.getSource()==os)
		{
			jf.dispose();
			Topics t=new Topics();
		}
	}
	
}
