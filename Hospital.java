import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class Hospital extends JFrame implements ActionListener{
	
	// In this step we initialize what we use in our frame
	public static String s;
	public static String drName , selectionOfGrade;
	public static Object selectionDept;
	
	private JLabel lb1 , lb2 , lb3 , h1 ,h2 ,h3 , h4 ,h5;
	private JButton btn;
	private JTextField txt1;
	private JTextField txt2;
	private JPanel pnl , pnlTwo; 
	private JRadioButton c1, c2, c3;
	private ButtonGroup grp;
	private JComboBox combo;
	private JFrame frame;
	private JTextArea ta;
	
	String[] hospital_dept = {"Neurology" , "Dermatology" , "Cardiology" , "Radiology" , "Pathology" , "Pediatry"};
	
	// We created the constructor method, where we specify the properties of the frame.
	public Hospital() {
		initialize();
		setTitle("Hospital");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400); 
		setLayout(new GridLayout());
		setLocationRelativeTo(null);  // opens our frame in the middle of the screen
		setVisible(true);
		setResizable(false);
		
		
		
		
	}

	private void initialize() {
		// we add a panel 
		pnl = new JPanel(new GridLayout(3,2));
		pnl.setBackground(Color.BLACK);
		pnl.setForeground(Color.WHITE);
		add(pnl);
		
		// we add our buttons labels and textfields to the panel
		lb1 = new JLabel("Enter Your Name: ");
		lb1.setOpaque(true);
		lb1.setBackground(Color.LIGHT_GRAY);
		lb1.setForeground(Color.BLACK);
		pnl.add(lb1);
		
		
		txt1 = new JTextField();
		txt1.setBackground(Color.LIGHT_GRAY);
		txt1.setForeground(Color.BLACK);
		txt1.setFont(new Font("Calibri" , Font.BOLD ,15));
		
		pnl.add(txt1);
		
		lb2 = new JLabel("Enter Your Department: ");
		lb2.setOpaque(true);
		lb2.setBackground(Color.LIGHT_GRAY);
		lb2.setForeground(Color.BLACK);
		pnl.add(lb2);
		
		
		combo = new JComboBox(hospital_dept);
		combo.setBackground(Color.LIGHT_GRAY);
		combo.setForeground(Color.BLACK);
		pnl.add(combo);
		

		// for the radiobuttons we create our second panel
		pnlTwo = new JPanel();
		pnl.add(pnlTwo);
		
		
		grp = new ButtonGroup();
		
		
		
		c1 = new JRadioButton("Prof Dr.");
		
		pnlTwo.add(c1);
		
		c2 = new JRadioButton("Associate Prof");
		pnlTwo.add(c2);
		
		c3 = new JRadioButton("Specialist");
		pnlTwo.add(c3);
		
		
		// For the choose one of our radiobuttons we make them group by ButtonGroup
		grp.add(c1);
		grp.add(c2);
		grp.add(c3);
		
		
	
		
		
		
		
		btn = new JButton("Submit");
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setForeground(Color.BLACK);
		pnl.add(btn);	
		
		
		// we added functionality to our buttons
		btn.addActionListener(this);
		
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		combo.addActionListener(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hospital();  // We call our object in the main to see in the screen
		new Client();
	}
	
	
	// This part is the part of determining which button will do what.
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource() == btn) {
			lb1.setText(txt1.getText());
		
			lb2.setText((String) combo.getSelectedItem());
			
			
			String selc = null;
			if(c1.isSelected()) {
				selc = "Proffessor";
			}else if (c2.isSelected()) {
				selc = "Associate Prof";
			}else if (c3.isSelected()) {
				selc = "Specialist";
			}
			
			selectionOfGrade = selc;
			drName = txt1.getText();
			selectionDept = combo.getSelectedItem();
			
			
			
			
			// This is the welcoming message when we click the submit button 
			//JOptionPane.showMessageDialog(null, "Hello Dear "  + selectionOfGrade + " " + drName + "\nWelcome to the " + selectionDept + " Department", "Doctor Entering Screen", 2);
			
			// This part mean is when we click the submit button its automatically close our page and open the welcomeframe page
			new WelcomeFrame().setVisible(true);
			setVisible(false);
		
		}
		
		
	}


		
	}
