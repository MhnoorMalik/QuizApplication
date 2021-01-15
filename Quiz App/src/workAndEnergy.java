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
public class workAndEnergy extends JFrame implements ActionListener {
	private static final Object physics = null;
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

	workAndEnergy(String s) {
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
			label.setText("Q. The area under the curve of force-displacement graph is equal to?");
			radioButton[0].setText("displacement");
			radioButton[1].setText("work");
			radioButton[2].setText("power");
			radioButton[3].setText("energy");
		}
		if (choice == 1) {
			label.setText("Q. slope of work time graph is equal to");
			radioButton[0].setText("displacement");
			radioButton[1].setText("acceleration");
			radioButton[2].setText("power");
			radioButton[3].setText("energy");
		}
		if (choice == 2) {
			label.setText("Q. work done will be maximum if the angle between the force f and displacement d is:");
			radioButton[0].setText("45 degree");
			radioButton[1].setText("90 degree");
			radioButton[2].setText("180 degree");
			radioButton[3].setText("0 degree");
		}
		if (choice == 3) {
			label.setText("Q. a field will be conservative when work is done:");
			radioButton[0].setText("by centripetal force is zero");
			radioButton[1].setText("by a fractional force is negetive");
			radioButton[2].setText("by force perpendicular to the displacement is zero");
			radioButton[3].setText("in a closed path is zero");
		}
		if (choice == 4) {
			label.setText("Q. a field in which the work is done in a moving body along a closed path iis zerro is called:");
			radioButton[0].setText("electric field");
			radioButton[1].setText("conservative field");
			radioButton[2].setText("electromagnetic field");
			radioButton[3].setText("maximum");
		}
		if (choice == 5) {
			label.setText("Q. when a force is parallel to the direction of motion of the body then work done on body is :");
			radioButton[0].setText("zero");
			radioButton[1].setText("minimum");
			radioButton[2].setText("infinity");
			radioButton[3].setText("maximum");
		}
		if (choice == 6) {
			label.setText("Q. the work done is said to be negetive when force and displacement are");
			radioButton[0].setText("parallel");
			radioButton[1].setText("anti parallel");
			radioButton[2].setText("perpendicular");
			radioButton[3].setText("none");
		}
		if (choice == 7) {
			label.setText("Q. which of the following is not conservative force");
			radioButton[0].setText("friction");
			radioButton[1].setText("electric");
			radioButton[2].setText("gravitational");
			radioButton[3].setText("magnetic");
		}
		if (choice== 8) {
			label.setText("Q. which of the following type of force can do no work on particle on which it acts");
			radioButton[0].setText("frictional force");
			radioButton[1].setText("gravitational force");
			radioButton[2].setText("elastic force");
			radioButton[3].setText("centripetal force");
		}
		if (choice == 9) {
			label.setText("Q. work has the dimension as that of same as that of");
			radioButton[0].setText("torque");
			radioButton[1].setText("angular momentum");
			radioButton[2].setText("linear momentum");
			radioButton[3].setText("power");
					}
				}		
			}
		}
	}


	// declare right answers.

	boolean check() {
		if (choice == 0)
			return (radioButton[1].isSelected());
		if (choice == 1)
			return (radioButton[2].isSelected());
		if (choice == 2)
			return (radioButton[3].isSelected());
		if (choice == 3)
			return (radioButton[3].isSelected());
		if (choice == 4)
			return (radioButton[1].isSelected());
		if (choice == 5)
			return (radioButton[3].isSelected());
		if (choice == 6)
			return (radioButton[1].isSelected());
		if (choice == 7)
			return (radioButton[0].isSelected());
		if (choice == 8)
			return (radioButton[3].isSelected());
		if (choice == 9)
			return (radioButton[0].isSelected());
		return false;
	}

}