import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class C implements ActionListener {
	JFrame jf;
	JLabel lb;
	JButton BasicConcept, TPAS;
	public C()
	{
		jf=new JFrame("Quiz Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		lb=new JLabel("Choose Topic");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(200,25,500,50);
		BasicConcept=new JButton("Basic Concepts");
		BasicConcept.setForeground(Color.black);
		BasicConcept.setBackground(Color.LIGHT_GRAY);
		BasicConcept.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		BasicConcept.setBounds(200,100,250,150);
		TPAS=new JButton("Types,Pointers,Array");
		TPAS.setForeground(Color.black);
		TPAS.setBackground(Color.LIGHT_GRAY);
		TPAS.setFont(new Font("Times New Roman",  Font.ITALIC, 24));
		TPAS.setBounds(200,275,250,150);
		jf.add(lb);
		jf.add(BasicConcept);
		jf.add(TPAS);
		jf.setLayout(null);  
	    jf.setVisible(true); 
	    BasicConcept.addActionListener(this);
	    TPAS.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==BasicConcept)
		{
			jf.dispose();
			Basic cb=new Basic();
			
		}
		else if(e.getSource()==TPAS)
		{
			jf.dispose();
			TPAS tp=new TPAS();
		}
	}
}
