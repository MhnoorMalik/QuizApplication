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
public class Paging extends JFrame implements ActionListener 
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
	Paging(String s) {
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
		if (choice == 0) {
			label.setText("Ques: Physical memory broken into fixed sized blocks");
			radioButton[0].setText("frames");
			radioButton[1].setText("pages");
			radioButton[2].setText("backing store");
			radioButton[3].setText("none");
		}
		if (choice == 1) {
			label.setText("Ques: Logical memory broken into blocks of same size");
			radioButton[0].setText("frames");
			radioButton[1].setText("pages");
			radioButton[2].setText("backing store");
			radioButton[3].setText("none");
		}
		if (choice == 2) {
			label.setText("Que: The----is used as an index into page table.");
			radioButton[0].setText("frame bit");
			radioButton[1].setText("page number");
			radioButton[2].setText("page offset");
			radioButton[3].setText("frame offset");
		}
		if (choice == 3) {
			label.setText("Que:The----table contains the base address of each page physical memory");
			radioButton[0].setText("process");
			radioButton[1].setText("memory");
			radioButton[2].setText("page");
			radioButton[3].setText("frame");
		}
		if (choice == 4) {
			label.setText("Que:The size of a page is typically");
			radioButton[0].setText("varied");
			radioButton[1].setText("power of 2");
			radioButton[2].setText("power of 4");
			radioButton[3].setText("None");
		}
		if (choice == 5) {
			label.setText("Que:With paging there is no fragmentation");
			radioButton[0].setText("internal");
			radioButton[1].setText("external");
			radioButton[2].setText("either type of");
			radioButton[3].setText("none");
		}
		if (choice == 6) {
			label.setText("Que:Paging increases the----time");
			radioButton[0].setText("waiting");
			radioButton[1].setText("execution");
			radioButton[2].setText("context-switch");
			radioButton[3].setText("all");
		}
		if (choice == 7) {
			label.setText("Que:Smaller page tables are implemented as a set of");
			radioButton[0].setText("queues");
			radioButton[1].setText("stack");
			radioButton[2].setText("counters");
			radioButton[3].setText("registers");
		}
		if (choice == 8) {
			label.setText("Que:The page table regidters should be built with");
			radioButton[0].setText("very low");
			radioButton[1].setText("very high");
			radioButton[2].setText("large memory space");
			radioButton[3].setText("none");
		}
		if (choice == 9) {
			label.setText("Que:For large page tables,they are kept in main memory &--pointers");
			radioButton[0].setText("base register");
			radioButton[1].setText("base pointer");
			radioButton[2].setText("register pointer");
			radioButton[3].setText("base");
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
			return (radioButton[1].isSelected());
		if (choice == 2)
			return (radioButton[1].isSelected());
		if (choice == 3)
			return (radioButton[2].isSelected());
		if (choice == 4)
			return (radioButton[1].isSelected());
		if (choice == 5)
			return (radioButton[1].isSelected());
		if (choice == 6)
			return (radioButton[2].isSelected());
		if (choice == 7)
			return (radioButton[3].isSelected());
		if (choice == 8)
			return (radioButton[1].isSelected());
		if (choice == 9)
			return (radioButton[0].isSelected());
		return false;
	}

	
}