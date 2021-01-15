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
public class TPAS extends JFrame implements ActionListener 
{
	JLabel label;
	JLabel lb1,lb;
	JPanel p1;
	JFrame jf;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext;
	JButton btnResult;
	ButtonGroup bg;
	int count = 0, choice = 0; 
	Random rand=new Random();
	int round=0;

	// create jFrame with radioButton and JButton
	TPAS() {
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
			label.setText("Que:Which of the following is the correct way to declare a pointer ?");
			radioButton[0].setText("int *ptr");
			radioButton[1].setText("int ptr");
			radioButton[2].setText("int &ptr");
			radioButton[3].setText("all mentioned");
		}
		if (choice == 1) {
			label.setText("Que:Which of the following gives the [value] stored at the address pointed to by the pointer : ptr?");
			radioButton[0].setText("Value(ptr)");
			radioButton[1].setText("ptr");
			radioButton[2].setText("&ptr");
			radioButton[3].setText("*ptr");
		}
		if (choice == 2) {
			label.setText("What is size of generic pointer in c?");
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
			label.setText("Que:Which from the following is not a correct way to pass a pointer to a function?");
			radioButton[0].setText("Non-constant pointer to non-constant data");
			radioButton[1].setText("A non-constant pointer to constant data");
			radioButton[2].setText("A constant pointer to non-constant data");
			radioButton[3].setText("All of the above");
		}
		if (choice == 5) {
			label.setText("Que:A void pointer cannot point to which of these?");
			radioButton[0].setText("Methods in c++");
			radioButton[1].setText("Class member in c++");
			radioButton[2].setText("Both");
			radioButton[3].setText("None");
		}
		if (choice == 6) {
			label.setText("Que:A one-dimensional array of one-dimensional arrays is called");
			radioButton[0].setText("Multi-dimensional array");
			radioButton[1].setText("Multi-casting array");
			radioButton[2].setText("Two-dimensional array");
			radioButton[3].setText("Three-dimensional array");
		}
		if (choice == 7) {
			label.setText("Que:The sequence of objects that have the same type, is called");
			radioButton[0].setText("10");
			radioButton[1].setText("11");
			radioButton[2].setText("Not Defined");
			radioButton[3].setText("00");
		}
		if (choice== 8) {
			label.setText("Que:What does a escape code represent?");
			radioButton[0].setText("alert");
			radioButton[1].setText("backslash");
			radioButton[2].setText(" tab");
			radioButton[3].setText("none");
		}
		if (choice == 9) {
			label.setText("Que:Which of the following statements are true?\r\n"
					+ "    int f(float)\r\n"
					+ "");
			radioButton[0].setText("f is a function taking an argument of type int and retruning a floating point number");
			radioButton[1].setText("f is a function taking an argument of type float and returning a integer.");
			radioButton[2].setText("f is a function of type float");
			radioButton[3].setText("none");
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