import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomePage implements ActionListener{
	JFrame jf;
	JButton start;
	JLabel lb;
	public WelcomePage()
	{
		jf=new JFrame("Quiz Application"); 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		
		lb=new JLabel("Ready for quiz?");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(200,150,500,50);
		start=new JButton("Start");
		start.setForeground(Color.black);
		start.setBackground(Color.LIGHT_GRAY);
		start.setFont(new Font("Times New Roman",  Font.ITALIC, 38 ));
		start.setBounds(250,200,150,50);
		jf.add(lb);
		jf.add(start);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    start.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
			jf.dispose();
			Subjects sub=new Subjects();	
	}
	 public static void main(String[] args) {  
		 new WelcomePage();
	 }
}
