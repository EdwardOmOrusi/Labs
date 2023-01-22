package lab12.carlow;

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

public class Align extends JFrame {
	
	
	private JTextField xField = new JTextField();
	private JTextField  yField = new JTextField();
    JPanel panel;
	// constructor
	
	public Align(String title) 
	
	{
		
		//  set title for frame and choose layout
		super(title);
		setLayout(new FlowLayout());
		
	
		JButton button =  new JButton("Ok");
		add(new JLabel("Snap to Grind "));
		JButton button2 =  new JButton("Cancel");
		JButton button3 =  new JButton("Help");
		JButton button4 =  new JButton();
		JButton button5 =  new JButton();
		add(button4);
		add(new JLabel("X"));
		add(xField);
		add(button);
		add(new JLabel("Show Grind "));
		add(button5);
		add(new JLabel("Y"));
		add(yField);
		
		
		
		add(button2);
		add(button3);
		
		
		
		
		
	}
	
	

}

