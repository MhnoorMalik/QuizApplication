import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Java implements ActionListener {
	JFrame jf;
	JLabel lb;
	JButton Basic, Mix;
	public Java()
	{
		jf=new JFrame("Quiz Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		lb=new JLabel("Choose Topic");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(200,25,500,50);
		Basic=new JButton("Basic");
		Basic.setForeground(Color.black);
		Basic.setBackground(Color.LIGHT_GRAY);
		Basic.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		Basic.setBounds(200,100,250,150);
		Mix=new JButton("Mix");
		Mix.setForeground(Color.black);
		Mix.setBackground(Color.LIGHT_GRAY);
		Mix.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		Mix.setBounds(200,275,250,150);
		jf.add(lb);
		jf.add(Basic);
		jf.add(Mix);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    Basic.addActionListener(this);
	    Mix.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Basic)
		{
			jf.dispose();
			JBasic cb=new JBasic("");
			
		}
		else if(e.getSource()==Mix)
		{
			jf.dispose();
			Mix m=new Mix("");
		}
	}
}
