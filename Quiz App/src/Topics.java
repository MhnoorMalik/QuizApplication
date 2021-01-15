import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Topics implements ActionListener {
    JFrame jf;
    JLabel lb;
    JButton deadlock, paging;
    public Topics()
    {
        jf=new JFrame("Quiz Application");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,200,700,500);
        jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
        lb=new JLabel("Choose topic");
        lb.setForeground(Color.black);
        lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
        lb.setBounds(200,25,500,50);
        deadlock=new JButton("deadlock");
        deadlock .setForeground(Color.black);
        deadlock.setBackground(Color.LIGHT_GRAY);
        deadlock.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
        deadlock .setBounds(180,125,150,150);
        paging=new JButton("paging");
        paging.setForeground(Color.black);
        paging.setBackground(Color.LIGHT_GRAY);
        paging.setFont(new Font("Times New Roman",  Font.ITALIC, 36));
        paging .setBounds(350,125,150,150);

        jf.add(lb);
        jf.add(deadlock);
        jf.add(paging);
        jf.setLayout(null);  
        jf.setVisible(true); 
        deadlock .addActionListener(this);
        paging.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==deadlock )
        {
            jf.dispose();
            Deadlock d1= new Deadlock(null);
        }
        else if(e.getSource()==paging)
        {
        	jf.dispose();
        	Paging p1=new Paging(null);  
        }
    }
}