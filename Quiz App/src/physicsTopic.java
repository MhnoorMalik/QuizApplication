import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class physicsTopic implements ActionListener {
	JFrame jf;
	JLabel lb;
	JButton measurements, we;
	public physicsTopic()
	{
		jf=new JFrame("Quiz Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		lb=new JLabel("Choose Topic");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(200,25,500,50);
		measurements=new JButton("measurements");
		measurements.setForeground(Color.black);
		measurements.setBackground(Color.LIGHT_GRAY);
		measurements.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		measurements.setBounds(200,100,250,150);
		we=new JButton("work and energy");
		we.setForeground(Color.black);
		we.setBackground(Color.LIGHT_GRAY);
		we.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		we.setBounds(200,275,250,150);
		jf.add(lb);
		jf.add(measurements);
		jf.add(we);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    measurements.addActionListener(this);
	    we.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==measurements)
		{
			jf.dispose();
			measurements p=new measurements(null);
			
		}
		else if(e.getSource()==we)
		{
			jf.dispose();
			workAndEnergy w1=new workAndEnergy(null);
		}
	}
}