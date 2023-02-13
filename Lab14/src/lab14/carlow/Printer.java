package lab14.carlow;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;



public class Printer extends JFrame  {
	
	private JLabel  label1 ;
	private JLabel  label2 ;
	private JLabel  print;
	private JLabel  printMy;
	private JLabel printQuality;
	private JLabel  imageLabel ;
	private JLabel  textLabel ;
	private JLabel  codeLabel ;
	private JLabel  selectionLabel ;
	private JLabel  allLabel ;
	private JLabel  appletLabel ;
	private JButton okButton;
	private JButton helpButton ;
	private JButton setupButton;
	private JButton cancelButton;
	private String [] quality  ={ "High" , "Normal" , "Low"};
	private JCheckBox image ;
	private JCheckBox text;
	private JCheckBox code ;
	private JCheckBox printFile ;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JRadioButton selection ;
	private JRadioButton all;
	private JRadioButton applet ;
	private JCheckBox imageBox;
	private JCheckBox textBox;
	private JCheckBox  codeBox;
	private JPanel mainPanel;
	
	
	
	
	
	
	public  Printer (String title)
	{
		super("Printer");
		setLayout(new GridLayout(1, 1));
		 // adding panel 5 a label
		   panel5 = new  JPanel();
		   printMy = new JLabel("Printer: MyPrinter");
		  // panel5.add(printMy);
		
	
		
		
		
		// adding panel 2 some features 
		selection = new JRadioButton ();
		all = new JRadioButton ();
		applet = new JRadioButton();
		panel2 = new JPanel();
		selectionLabel = new JLabel("Selection");
		allLabel = new JLabel("All");
		appletLabel = new JLabel("Applet");
		panel2.setLayout(new GridLayout(3,2));
		panel2.add(all);
		panel2.add(allLabel);
		panel2.add(applet);
		panel2.add(appletLabel);
		panel2.add(selection);
		panel2.add(selectionLabel);
		
		
		
		// adding panel 3 some features 
	    imageBox = new JCheckBox();
		textBox = new JCheckBox();
		code = new JCheckBox();
		panel3 =new JPanel();
		imageLabel = new JLabel("image");
		textLabel = new JLabel("text");
		codeLabel = new JLabel("code");
		panel3.setLayout(new GridLayout(3,2));
		panel3.add(imageBox);
		panel3.add(imageLabel);
		panel3.add(textBox);
		panel3.add(textLabel);
		panel3.add(code);
		panel3.add(codeLabel);
		
		// adding the buttons to the panel 1
		
			okButton = new JButton("Ok");
			cancelButton =  new JButton("Cancel");
			helpButton = new JButton("Help");
			setupButton = new JButton("Setup");
			panel1 = new JPanel();
			panel1.setLayout(new GridLayout(4,1));
			panel1.add(okButton);
			panel1.add(cancelButton);
			panel1.add(helpButton);
			panel1.add(setupButton);
				
		// adding panel 4 some features 
	   print = new JLabel ("Print to File");
	   printQuality = new JLabel("Print Quality:");
	   printFile = new JCheckBox();
	   JComboBox comboBox = new JComboBox(quality);
	   panel4 = new JPanel();
	   panel4.add(printQuality);
	   panel4.add(comboBox);
	   panel4.add(printFile);
	   panel4.add(print);
	   
	   // adding panel 5 a label
	   panel5 = new  JPanel();
	   printMy = new JLabel("Printer: MyPrinter");
	  // panel5.add(printMy);
	   
	   
	  	
		
		// setting the panel 4 to the south  and panel 5 to the north
	   mainPanel = new JPanel();
	   mainPanel.setLayout( new BorderLayout());
	   mainPanel.add(panel4 ,BorderLayout.SOUTH);
	   mainPanel.add(panel5 ,BorderLayout.NORTH);
	 
		
		// adding the panel 1 to the main panel
		
		setLayout(new FlowLayout(FlowLayout.CENTER , 10,5)) ;
		add(panel5);
		add(panel3);
		add(panel2);
		add(panel1);
		add(panel4);
		
	
		
		
		
	
		
	}
	


}
