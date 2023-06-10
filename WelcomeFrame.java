import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WelcomeFrame extends JFrame {
	
	// we initialize some staffs
	private JPanel contentPane;
	private JProgressBar progressBar;
	private JLabel lblLoading;
	
	
	// we call our main method and create objects
	public static void main(String[] args) {
		WelcomeFrame frame = new WelcomeFrame();
		frame.setVisible(true);

	}

	public WelcomeFrame() {
		//When window in opened
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				//Start a new thread
				new Thread(new Runnable() {
					//Run thread
		            @Override
		            public void run() {
		                try {
		                	//Load progress bar with values
		                	for (int i = 20; i <= 100; i+=20) {
		                	        Thread.sleep(1000); 
		                	        progressBar.setValue(i);
							}
		                    dispose();
		                    //After reaching values, open main frame
		                    new MainFrame().setVisible(true);
		                //new MainFrame().setVisible(true);
		                } catch (Exception e) {
		                    e.printStackTrace();
		                }
		            }
		        }).start();
			}
		});
		
		
	
		setTitle(new Hospital().selectionDept + "Department"); // Our title is determined by our choice that we had choosen in hospital class
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 316);
		setLocationRelativeTo(null);
		
		

		// Input name of user
		

		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		
		// we get information from hospital page 
		JLabel lbl = new JLabel("Hello Dear" +" "+ new Hospital().selectionOfGrade +" "+new Hospital().drName);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl.setBounds(74, 20, 350, 33);
		contentPane.add(lbl);

		// we get information from hospital page 
		JLabel lbl1 = new JLabel("Welcome to the" + " "+ new Hospital().selectionDept + " " + "Department");
		lbl1.setFont(new Font("Tahoma" , Font.BOLD , 14));
		lbl1.setBounds(74, 80, 296, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("Please wait while the system loading!");
		lbl2.setForeground(Color.BLACK);
		lbl2.setBounds(74, 185, 296, 14);
		
		contentPane.add(lbl2);

		// OUR PROGRESS BAR	
		progressBar = new JProgressBar();
		progressBar.setBounds(74, 236, 296, 14);
		progressBar.setForeground(Color.RED);
		contentPane.add(progressBar);
		
		lblLoading = new JLabel("Loading...");
		lblLoading.setBounds(190, 252, 81, 14);
		contentPane.add(lblLoading);
	}
	
	
}