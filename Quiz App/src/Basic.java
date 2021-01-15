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
public class Basic extends JFrame implements ActionListener 
{
	JLabel label;
	JLabel lb1,lb;
	JPanel p1;
	JFrame jf;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext,btnBack;
	JButton btnResult;
	ButtonGroup bg;
	int count = 0, choice = 0; 
	Random rand=new Random();
	int round=0;
	// create jFrame with radioButton and JButton
	Basic() {
		jf=new JFrame("Quiz Application");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,700,500);
		jf.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo 330\\Downloads\\20860474.jpg")));
		lb=new JLabel("C++ Programming – Basics");
		lb.setForeground(Color.black);
		lb.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		lb.setBounds(100,25,500,50);
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
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			choice++;
			set();
			if (choice == 9) {
				btnNext.setEnabled(true);
				btnNext.setText("Result");
				setVisible(true);
			}
		}
		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			choice++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}
	

	// SET Questions with options
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
		
		if ( choice== 0) {
			label.setText("Que:who invented c++?");
			radioButton[0].setText("Bjarne Stroustrup");
			radioButton[1].setText("Herb Sutter");
			radioButton[2].setText("Ken Thompson");
			radioButton[3].setText("all mentioned");
		}
		if (choice == 1) {
			label.setText("Que:Can any function call itself?");
			radioButton[0].setText("Yes");
			radioButton[1].setText("No");
			radioButton[2].setText("Error");
			radioButton[3].setText("both b & c");
		}
		if (choice == 2) {
			label.setText("Que:What is size of void in bytes?");
			radioButton[0].setText("1");
			radioButton[1].setText("2");
			radioButton[2].setText("0");
			radioButton[3].setText("4");
		}
		if (choice == 3) {
			label.setText("Que:Can a Structure contain pointer to itself?");
			radioButton[0].setText("Yes");
			radioButton[1].setText("No");
			radioButton[2].setText("Completion Error");
			radioButton[3].setText("Run time error");
		}
		if (choice == 4) {
			label.setText("Que:Can a for loop contain another for loop?");
			radioButton[0].setText("Yes");
			radioButton[1].setText("No");
			radioButton[2].setText("Run time Error");
			radioButton[3].setText("None");
		}
		if (choice == 5) {
			label.setText("Que:What is output of below program?\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"int main()\\r\\n\"\r\n"
					+ "				+ \"{\\r\\n\"\r\n"
					+ "				+ \"  int a=10;\\r\\n\"\r\n"
					+ "				+ \"  int b,c;\\r\\n\"\r\n"
					+ "				+ \"  b = a++;\\r\\n\"\r\n"
					+ "				+ \"  c = a;\\r\\n\"\r\n"
					+ "				+ \"  cout<<a<<b<<c;\\r\\n\"\r\n"
					+ "				+ \"  return 0;\\r\\n\"\r\n"
					+ "				+ \"}");
			radioButton[0].setText("111011");
			radioButton[1].setText("111111");
			radioButton[2].setText("101011");
			radioButton[3].setText("None");
		}
		if (choice == 6) {
			label.setText("Que:What is the full form of oop?");
			radioButton[0].setText("Object oriented programming");
			radioButton[1].setText("Oriented object programming");
			radioButton[2].setText("Office oriented programming");
			radioButton[3].setText("None");
		}
		if (choice == 7) {
			label.setText("Que:What is the output of below program?\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"int main()\\r\\n\"\r\n"
					+ "				+ \"{\\r\\n\"\r\n"
					+ "				+ \"int a = 10;\\r\\n\"\r\n"
					+ "				+ \"cout<<a++;\\r\\n\"\r\n"
					+ "				+ \"return 0;\\r\\n\"\r\n"
					+ "				+ \"}");
			radioButton[0].setText("10");
			radioButton[1].setText("11");
			radioButton[2].setText("Not Defined");
			radioButton[3].setText("00");
		}
		if (choice== 8) {
			label.setText("Que:What is the value of a in below program?\\nint main()\\n{\\n int a, b=20;\\r\\na = 90/b;\\nreturn 0;\\n}");
			radioButton[0].setText("4.5");
			radioButton[1].setText("4.0");
			radioButton[2].setText("4");
			radioButton[3].setText("none");
		}
		if (choice == 9) {
			label.setText("Que:Which operator has highest precedence?");
			radioButton[0].setText("( )");
			radioButton[1].setText("=");
			radioButton[2].setText("++");
			radioButton[3].setText("+");
		}
		label.setBounds(30, 40, 450, 20);
	}
				else
					choice= rand.nextInt(10);
			}
		array[i]=choice;
	}
	}
	// declare right answers.
	boolean check() {
		if (choice == 0)
			return (radioButton[0].isSelected());
		if (choice == 1)
			return (radioButton[3].isSelected());
		if (choice == 2)
			return (radioButton[0].isSelected());
		if (choice == 3)
			return (radioButton[0].isSelected());
		if (choice == 4)
			return (radioButton[0].isSelected());
		if (choice == 5)
			return (radioButton[3].isSelected());
		if (choice == 6)
			return (radioButton[2].isSelected());
		if (choice == 7)
			return (radioButton[1].isSelected());
		if (choice == 8)
			return (radioButton[2].isSelected());
		if (choice == 9)
			return (radioButton[2].isSelected());
		return false;
	}
	
	
}