package lab14.carlow;

import javax.swing.JFrame;


public class PrinterDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer printer = new Printer("Printer");
		  printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  printer.setSize(350,300);
		  printer.setLocation(500,00);
		  printer.setVisible(true);

	

	}

}
