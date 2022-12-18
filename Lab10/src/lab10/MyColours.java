package lab10;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class MyColours {

	public static void main(String[] args) {
		
	}
	
	public class ChangeColourDriver extends javax.swing.JFrame {

		public static void main(String[] args) {
	

		
		ChangeColour changeColour = new ChangeColour("My Colours");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(200, 200);
		changeColour.setVisible(true);

	}
  }
}
	public class ChangeColour extends javax.swing.JFrame{

		
		public ChangeColour(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // Add "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // Add "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);
		    
		    
		    //Add "Green" Button  to frame and attach listener
		    b = new JButton("Green");
		    add(b);
		    b.addActionListener(listener);
		    
		    
		    //Add "Red" Button  to frame and attach listener
		    b = new JButton("Red");
		    add(b);
		    b.addActionListener(listener);
		    
		    //Add "Blue" Button  to frame and attach listener
		    b = new JButton("Blue");
		    add(b);
		    b.addActionListener(listener);
		    
		
		    // Attach window listener
		    addWindowListener(new WindowCloser());
		}//end constructor
		
		// Listener for the 5 buttons
		class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent evt) {
				Color currentBackground =  getContentPane().getBackground();
		 		String buttonLabel = evt.getActionCommand();
	
		 		// Test label on button and change background colour
		 		if (buttonLabel.equals("Lighter"))
					 getContentPane().setBackground(currentBackground.brighter());
				else if (buttonLabel.equals("Red"))
					 getContentPane().setBackground(Color.RED);
				else if (buttonLabel.equals("Green"))
					 getContentPane().setBackground(Color.GREEN);
				else if (buttonLabel.equals("Blue"))
					 getContentPane().setBackground(Color.BLUE);
			    else 
			    	 getContentPane().setBackground(currentBackground.darker());
		}
		}
		// Listener for window
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}	
	} // end class
     

  

		
