import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.util.Random;
import java.io.Console;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mix extends JFrame implements ActionListener 
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

	
	Mix(String s) {
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
			label.setText("Que:Which of these operators is used to allocate memory to array variable in Java? ");
			radioButton[0].setText("malloc");
			radioButton[1].setText("alloc");
			radioButton[2].setText("new ");
			radioButton[3].setText("new malloc ");
		}
		if (choice == 1) {
			label.setText("Que: Which of these is an incorrect array declaration? ");
			radioButton[0].setText("int arr[] = new int[5]");
			radioButton[1].setText("int [] arr = new int[5]  ");
			radioButton[2].setText("int arr[] = new int[5] ");
			radioButton[3].setText(" int arr[] = int [5] new ");
		}
		if (choice == 2) {
			label.setText("Que:Which of these is necessary to specify at time of array initialization? ");
			radioButton[0].setText("Row ");
			radioButton[1].setText("Column ");
			radioButton[2].setText("Both Row and Column ");
			radioButton[3].setText("None ");
		}
		if (choice == 3) {
			label.setText("Which one is a valid declaration of a boolean? ");
			radioButton[0].setText("boolean b1 = 1; ");
			radioButton[1].setText("boolean b2 = ‘false’; ");
			radioButton[2].setText("boolean b3 = false; ");
			radioButton[3].setText("boolean b4 = ‘true’ ");
		}
		if (choice == 4) {
			label.setText("Que:Which of these values can a boolean variable contain? ");
			radioButton[0].setText("True & False ");
			radioButton[1].setText("0 & 1 ");
			radioButton[2].setText("Any integer value ");
			radioButton[3].setText("true ");
		}
		if (choice == 5) {
			label.setText("Que:Which of these occupy first 0 to 127 in Unicode character set used for characters in Java? ");
			radioButton[0].setText("ASCII ");
			radioButton[1].setText("ISO-LATIN-1 ");
			radioButton[2].setText("None ");
			radioButton[3].setText("ASCII and ISO-LATIN1 ");
		}
		if (choice == 6) {
			label.setText("Que: Which class is used to generate random number? ");
			radioButton[0].setText(" java.lang.Object ");
			radioButton[1].setText("java.util.randomNumber ");
			radioButton[2].setText("java.util.Random ");
			radioButton[3].setText("java.util.Object ");
		}
		if (choice == 7) {
			label.setText("Que:What is the return type of Math.random() method? ");
			radioButton[0].setText("Integer ");
			radioButton[1].setText("Double  ");
			radioButton[2].setText("String ");
			radioButton[3].setText(" Boolean ");
		}
		if (choice == 8) {
			label.setText("Que:Random is a final class?  ");
			radioButton[0].setText("True  ");
			radioButton[1].setText("False  ");
			radioButton[2].setText("None ");
			radioButton[3].setText(" None ");
		}
		if (choice == 9) {
			label.setText("Que: How many bits are used for generating random numbers?  ");
			radioButton[0].setText("32  ");
			radioButton[1].setText("64 ");
			radioButton[2].setText("48  ");
			radioButton[3].setText("8 ");
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
			return (radioButton[2].isSelected());
		if (choice == 1)
			return (radioButton[3].isSelected());
		if (choice == 2)
			return (radioButton[2].isSelected());
		if (choice == 3)
			return (radioButton[2].isSelected());
		if (choice == 4)
			return (radioButton[0].isSelected());
		if (choice == 5)
			return (radioButton[3].isSelected());
		if (choice == 6)
			return (radioButton[2].isSelected());
		if (choice == 7)
			return (radioButton[1].isSelected());
		if (choice == 8)
			return (radioButton[1].isSelected());
		if (choice == 9)
			return (radioButton[2].isSelected());
		return false;
	}


	
}
