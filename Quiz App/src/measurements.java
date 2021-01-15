import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class measurements extends JFrame implements ActionListener {
	JLabel label;
	JLabel lb1;
	JLabel lb2;
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

	measurements(String s) {
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
		btnResult = new JButton("Result");
		btnNext.addActionListener(this);
		btnResult.addActionListener(this);
		add(btnNext);
		add(btnNext);
		set();
		label.setBounds(30, 40, 450, 20);

		//radioButton[0].setBounds(50, 80, 200, 20);

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
				JOptionPane.showMessageDialog(this,"correct answers= " + count);
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
			label.setText("Q. The branch of physics which deals with ultimate particles of which the matter is composed is?");
			radioButton[0].setText("plasma physics");
			radioButton[1].setText("atomic physics");
			radioButton[2].setText("nuclear physics");
			radioButton[3].setText("particle physics");
		}
		if (choice == 1) {
			label.setText("Q. The branches of physics which deals with atomic nuclei is called");
			radioButton[0].setText("acoustics");
			radioButton[1].setText("the modynamics");
			radioButton[2].setText("magnetism");
			radioButton[3].setText("nuclear physics");
		}
		if (choice == 2) {
			label.setText("Q. silicon is abundantly obtained from:");
			radioButton[0].setText("Water");
			radioButton[1].setText("Matel");
			radioButton[2].setText("Sand");
			radioButton[3].setText("Stone");
		}
		if (choice == 3) {
			label.setText("Q. The number of base units are:");
			radioButton[0].setText("Three");
			radioButton[1].setText("Five");
			radioButton[2].setText("Seven");
			radioButton[3].setText("Nine");
		}
		if (choice == 4) {
			label.setText("Q. which of the following is derived quantity:");
			radioButton[0].setText("force");
			radioButton[1].setText("Mass");
			radioButton[2].setText("length");
			radioButton[3].setText("time");
		}
		if (choice == 5) {
			label.setText("Q. which of the following is SI base unit:");
			radioButton[0].setText("gram");
			radioButton[1].setText("slug");
			radioButton[2].setText("newton");
			radioButton[3].setText("kilogram");
		}
		if (choice == 6) {
			label.setText("Q. which of the following is not a unit of length?");
			radioButton[0].setText("angstron");
			radioButton[1].setText("micron");
			radioButton[2].setText("radian");
			radioButton[3].setText("light year");
		}
		if (choice == 7) {
			label.setText("Q. which is not a base unit in SI units");
			radioButton[0].setText("kilogram");
			radioButton[1].setText("joule");
			radioButton[2].setText("ampere");
			radioButton[3].setText("kelvin");
		}
		if (choice== 8) {
			label.setText("Q. an example of derived unit is");
			radioButton[0].setText("candela");
			radioButton[1].setText("ampere");
			radioButton[2].setText("coulomb");
			radioButton[3].setText("mole");
		}
		if (choice == 9) {
			label.setText("Q. candela is the unit of");
			radioButton[0].setText("charge");
			radioButton[1].setText("luminous intensity");
			radioButton[2].setText("power");
			radioButton[3].setText("refractive index");
		}
		label.setBounds(30, 40, 450, 20);
		for (int k = 0, l = 0; k <= 90; k += 30, l++)
			radioButton[l].setBounds(50, 80 + k, 200, 20);
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
			return (radioButton[3].isSelected());
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
			return (radioButton[2].isSelected());
		if (choice == 9)
			return (radioButton[1].isSelected());
		return false;
	}

}