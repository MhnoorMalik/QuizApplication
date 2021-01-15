import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class JBasic extends JFrame implements ActionListener 
{
	JLabel label;
	JLabel lb1;
	JPanel p1;
	JFrame jf;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext,btnBack;
	JButton btnResult;
	ButtonGroup bg;
	int count = 0, choice = 0;
	Random rand=new Random();
	 int round=0;

	
	JBasic(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
                btnBack = new JButton("Back");
		btnResult = new JButton("Result");
		btnNext.addActionListener(this);
		btnResult.addActionListener(this);
		add(btnNext);
		add(btnNext);
		set();
		label.setBounds(30, 40, 450, 20);
                radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 200, 20);
		radioButton[2].setBounds(50, 140, 200, 20);
		radioButton[3].setBounds(50, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
                btnBack.setBounds(250, 240, 100, 30);
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			choice++;
    JOptionPane.showMessageDialog (this,"Correct answers ="+count);
         System.exit(0);
      }
		
 	if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			choice++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}
	
	void set() {
		int[] array=new int[11];
		int choice= rand.nextInt(10);
		radioButton[4].setSelected(true);
		for(int i=0;i<11;i++)
		{
			for(int j=0;j<=i;j++)
			{
				int c=array[j];
				if(c!=choice)
				{
		if (choice == 0) {
			label.setText("Ques: Who developed java?");
			radioButton[0].setText("james");
			radioButton[1].setText("Tim");
			radioButton[2].setText("steve");
			radioButton[3].setText("mark");
		}
		if (choice == 1) {
			label.setText("Ques: Which is not a Java features?");
			radioButton[0].setText("Dynamic");
			radioButton[1].setText("Remote interface ");
			radioButton[2].setText("Use of pointers");
			radioButton[3].setText("none");
		}
		if (choice == 2) {
			label.setText("Que: The \\u0021 article referred to as a");
			radioButton[0].setText("Hexadecimal");
			radioButton[1].setText("Line feed");
			radioButton[2].setText("Unicode escape sequence");
			radioButton[3].setText("Octal escape");
		}
		if (choice == 3) {
			label.setText("Que:_____ is used to find and fix bugs in the Java programs");
			radioButton[0].setText("JVM");
			radioButton[1].setText("JRE");
			radioButton[2].setText("JDK");
			radioButton[3].setText("JDB");
		}
		if (choice == 4) {
			label.setText("Que:Which of the following is a valid declaration of a char?");
			radioButton[0].setText(" char ch = '\\utea");
			radioButton[1].setText(" char ca = 'tea'");
			radioButton[2].setText(" char cr = \\u0223");
			radioButton[3].setText(" char cc = '\\itea'");
		}
		if (choice == 5) {
			label.setText("Que: What is the return type of the hashCode() method in the Object class?");
			radioButton[0].setText("Object ");
			radioButton[1].setText(" int");
			radioButton[2].setText("long ");
			radioButton[3].setText("void ");
		}
		if (choice == 6) {
			label.setText("Que: Which package contains the Random class?");
			radioButton[0].setText("java.util package ");
			radioButton[1].setText(" java.lang package");
			radioButton[2].setText("java.awt package ");
			radioButton[3].setText("java.io package ");
		}
		if (choice == 7) {
			label.setText("Que:An interface with no fields or methods is known as a? ");
			radioButton[0].setText("Runnable Interface ");
			radioButton[1].setText("Marker Interface  ");
			radioButton[2].setText("Abstract Interface ");
			radioButton[3].setText("CharSequence Interface");
		}
		if (choice == 8) {
			label.setText("Que: Which of the following is an immediate subclass of the Panel class?");
			radioButton[0].setText("Applet class ");
			radioButton[1].setText("Window class ");
			radioButton[2].setText("Frame class ");
			radioButton[3].setText("Dialog class ");
		}
		if (choice == 9) {
			label.setText("Que:Which of the following is a marker interface? ");
			radioButton[0].setText("Runnable interface ");
			radioButton[1].setText("Remote interface ");
			radioButton[2].setText("Readable interface ");
			radioButton[3].setText("Result interface ");
		}
		label.setBounds(30, 40, 450, 20);
	}
				else
					choice= rand.nextInt(10);
			}
		array[i]=choice;
	}
	}
	
	boolean check() {
		if (choice == 0)
			return (radioButton[0].isSelected());
		if (choice == 1)
			return (radioButton[2].isSelected());
		if (choice == 2)
			return (radioButton[2].isSelected());
		if (choice == 3)
			return (radioButton[3].isSelected());
		if (choice == 4)
			return (radioButton[0].isSelected());
		if (choice == 5)
			return (radioButton[1].isSelected());
		if (choice == 6)
			return (radioButton[0].isSelected());
		if (choice == 7)
			return (radioButton[1].isSelected());
		if (choice == 8)
			return (radioButton[0].isSelected());
		if (choice == 9)
			return (radioButton[1].isSelected());
		return false;
	}


	
}
