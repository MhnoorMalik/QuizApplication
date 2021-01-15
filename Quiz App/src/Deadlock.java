import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.util.Random;
public class Deadlock extends JFrame implements ActionListener 
{
	JLabel label;
	JLabel lb1;
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
	Deadlock(String s) {
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
			label.setText("Que:Wait-for graph is deadlock detection algo applicable when all recources?");
			radioButton[0].setText("single instance");
			radioButton[1].setText("multiple");
			radioButton[2].setText("7 multiple");
			radioButton[3].setText("all mentioned");
		}
		if (choice == 1) {
			label.setText("Que:If wait for graph contains cycle? deadlock");
			radioButton[0].setText("not exists");
			radioButton[1].setText("exists");
			radioButton[2].setText("safe state");
			radioButton[3].setText("both b & c");
		}
		if (choice == 2) {
			label.setText("Que:Deadlock prevention strategies are very");
			radioButton[0].setText("conservative");
			radioButton[1].setText("straight");
			radioButton[2].setText("complex");
			radioButton[3].setText("Simple");
		}
		if (choice == 3) {
			label.setText("Que:Deadlock avoidence requires knowledge of future?");
			radioButton[0].setText("process");
			radioButton[1].setText("resource");
			radioButton[2].setText("program");
			radioButton[3].setText("application");
		}
		if (choice == 4) {
			label.setText("Que:Which of following is visual way to determine the deadlock occurance?");
			radioButton[0].setText("resource allocation graph");
			radioButton[1].setText("starvation graph");
			radioButton[2].setText("Inversion graph");
			radioButton[3].setText("None");
		}
		if (choice == 5) {
			label.setText("Que:A direct method of deadlock prevention is to prevent occurance of?");
			radioButton[0].setText("mutual exclusion");
			radioButton[1].setText("hold and wait");
			radioButton[2].setText("preemptive");
			radioButton[3].setText("circular wait");
		}
		if (choice == 6) {
			label.setText("Que:With deadlock detection, requested resources are granted to");
			radioButton[0].setText("resources");
			radioButton[1].setText("programs");
			radioButton[2].setText("processes");
			radioButton[3].setText("users");
		}
		if (choice == 7) {
			label.setText("Que:Problem encountered in multitasking when process is perpetually defined necessary resource is");
			radioButton[0].setText("deadlock");
			radioButton[1].setText("starvation");
			radioButton[2].setText("inversion");
			radioButton[3].setText("aging");
		}
		if (choice== 8) {
			label.setText("Que:For effective os when to check deadlock?");
			radioButton[0].setText("every time resource request");
			radioButton[1].setText("at fixed time interval");
			radioButton[2].setText("both a & b");
			radioButton[3].setText("none");
		}
		if (choice == 9) {
			label.setText("Que:Invoking periodically to test for deadlock is one of way for deadlock?");
			radioButton[0].setText("prevention");
			radioButton[1].setText("avoidance");
			radioButton[2].setText("detection");
			radioButton[3].setText("deletion");
							}
						}
					}
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