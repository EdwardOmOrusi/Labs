package lab13.carlow;

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

public class ColorSelect extends JFrame {
	
	private String  [] colours  = { "Red" , "Blue"  , "Green" , "Pink" };
	private  JLabel label1 ;
	private  JLabel label2;
	private JCheckBox background ;
	private JCheckBox  forground ;
	private JPanel  fieldPanel1 ;
	private JPanel  fieldPanel2 ;
	private JPanel  buttonPanel ;
	private JPanel  fieldPanel ;
	private JButton  okButton;
	private JButton  cancelButton;
	
	
	public ColorSelect	(String title)
	{
		 // adding the combobox  to the panel
		super("ColorSelect");
		setLayout(new GridLayout(2, 2));
		JComboBox comboBox = new JComboBox(colours);
		add(comboBox);
		
		//adding the labels  to the panel
		label1 = new JLabel ("Background");
		background = new JCheckBox();
		fieldPanel1 = new JPanel();
		fieldPanel1.setLayout( new FlowLayout());
		fieldPanel1.add(background);
		fieldPanel1.add(label1);
		
		
		label2 = new JLabel ("Forground");
		forground = new JCheckBox();
		fieldPanel2 = new JPanel();
		fieldPanel2.setLayout(new  FlowLayout());
		fieldPanel2.add(forground);
		fieldPanel2.add(label2);
		
		
		// adding the fieldpanel 
	fieldPanel = new JPanel();
	fieldPanel.setLayout( new BorderLayout());
	fieldPanel.add(fieldPanel1 ,BorderLayout.EAST);
	fieldPanel.add(fieldPanel2 ,BorderLayout.WEST);	
	
	setLayout(new FlowLayout(FlowLayout.CENTER , 10,5)) ;
	add(fieldPanel);
	
	// adding the buttons
	
	buttonPanel = new JPanel ();
	okButton = new JButton("Ok");
	cancelButton = new JButton("Cancel");
	buttonPanel.setLayout(new GridLayout(1,1));
	buttonPanel.add(okButton);
	buttonPanel.add(cancelButton);
	
	
	setLayout(new FlowLayout(FlowLayout.CENTER , 10,5)) ;
	add(fieldPanel);
	add(buttonPanel);
	
		
	}
	}


