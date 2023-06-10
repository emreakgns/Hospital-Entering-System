import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	public static String s;
	public static String x;
	// our staffs
	private JLabel lb1 , lb2 , lb3 , h1 ,h2 ,h3 , h4 ,h5;
	private JButton btn;
	private JTextField txt1;
	private JTextField txt2;
	private JPanel pnl , pnlTwo; 
	private JRadioButton c1, c2, c3;
	private ButtonGroup grp;
	private JComboBox combo;
	
	private JTextArea ta;
	
	String[] hospital_dept = {"Neurology" , "Dermatology" , "Cardiology" , "Radiology" , "Pathology" , "Pediatry"};
	
	public MainFrame() {
		
		setTitle("Department of " + new Hospital().selectionDept);
		setSize(400,400);
		//setVisible(false); // for the close other frame
		//frame.setVisible(true);
		setResizable(false);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
	
		// we create our panel on the frame
		JPanel secondPNL = new JPanel();
		secondPNL.setPreferredSize(new Dimension(300 , 40));
		secondPNL.setLayout(new FlowLayout(FlowLayout.CENTER));
		secondPNL.setBackground(Color.LIGHT_GRAY);
		add(secondPNL);
		
		// first we add name label
		JLabel namelb = new JLabel(new Hospital().selectionOfGrade + " " + new Hospital().drName);
		namelb.setForeground(Color.BLACK);
		secondPNL.add(namelb);
		
		// another panel for other staffs
		JPanel thirdPNL = new JPanel();
		thirdPNL.setPreferredSize(new Dimension(300 , 300));
		thirdPNL.setLayout(new FlowLayout(FlowLayout.LEFT));
		thirdPNL.setBackground(Color.LIGHT_GRAY);
		add(thirdPNL);
		
		
		
		// Labels for some texts
		JLabel newpatientlbl = new JLabel("New Patient");
		newpatientlbl.setPreferredSize(new Dimension (140, 50));
		newpatientlbl.setOpaque(true);
		newpatientlbl.setBackground(new Color(128, 128, 200));
		thirdPNL.add(newpatientlbl);
		
		JLabel patientlbl = new JLabel("Current Patients");
		patientlbl.setPreferredSize(new Dimension (140, 50));
		patientlbl.setOpaque(true);
		patientlbl.setBackground(new Color(128,128,200));
		thirdPNL.add(patientlbl);
		
		
		
		// button for adding patient
		JButton addpt = new JButton("Add a Patient");
		addpt.setPreferredSize(new Dimension(140,50));
		
		// button functionality
		addpt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			//s = JOptionPane.showInputDialog(null, "Enter the patient name" , "Patient Name" , JOptionPane.QUESTION_MESSAGE);
			
			// when we click the add button new frame will be open and ask the patient name	
			JFrame ptb = new JFrame();
			ptb.setSize(300, 300);
			ptb.setVisible(true);
			//ptb.setDefaultCloseOperation(EXIT_ON_CLOSE);
			ptb.setLocationRelativeTo(null);
			ptb.setResizable(false);
			ptb.setLayout(new GridLayout(3,0));
			
			
			JLabel lbpp = new JLabel("        Enter Patient Name");
			ptb.add(lbpp);
			
			
			JTextField tfp = new JTextField();
			ptb.add(tfp);
			
			JButton btpat = new JButton("Add");
			btpat.addActionListener(new ActionListener() {
				
				@Override
				 public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					for(int i = 0; i<5 ; i++) {
						
						ta.setText("\n");
						ta.setText(tfp.getText());
						
						ptb.setVisible(false);
					}
					
				}
			});
			ptb.add(btpat);
			
			
			}
		});
		
	
		
		thirdPNL.add(addpt);
		
		// Our text area for writing patients name
		ta = new JTextArea();
		//ta.setLayout(new GridLayout(5,0));
		
		ta.setPreferredSize(new Dimension(140 , 200));
		ta.setOpaque(true);
		ta.setBackground(new Color(255, 236, 139));			
		ta.setEditable(false);
		
		//ta.setText();
		thirdPNL.add(ta);
	}
	
	
	


}
