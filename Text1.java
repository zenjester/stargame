import javax.swing.*;
import java.awt.*; 
//import java.awt.font;

// a class to test layouts

public class Text1 {
	
	public static void main (String[] args) {
		Text1  gui = new Text1();
		gui.go();
	}
	
	public void go() {
	// *********this lot shouldbe in an initiate function ********* 	
	    int fStatus[];
		fStatus= new int [4];
		String statusMsg;
		
		//create objects
		factor social 	= new factor();
		factor science 	= new factor();
		factor economy 	= new factor();
		factor military	= new factor();
	
		//set initial values
	
		social.setFactor(10);
		science.setFactor(15);
// ***** to here

		statusMsg = "current Social is " + social.getFactor();
		statusMsg += "\ncurrent Scinece is " + science.getFactor();
		
		JFrame frame = new JFrame();
		JTextField field = new JTextField(20);
		JTextField field2 = new JTextField("Hello");
		JTextArea status = new JTextArea(4,20);
		JTextField news = new JTextField(40);
		status.setLineWrap(true);
		status.setWrapStyleWord(true);
		//status.setSelectedTextColor("CYAN");
		news.setText("It is bad I am afraid");
		field.setText("Dude whatever");
		field.setFont(new Font( "Serif", Font.PLAIN, 20 ) );
		status.setText(statusMsg);
		status.setFont(new Font( "Serif", Font.BOLD, 20 ) );
		frame.getContentPane().add(BorderLayout.EAST, field2);
		frame.getContentPane().add(BorderLayout.NORTH, field);
		frame.getContentPane().add(BorderLayout.CENTER, status);
		frame.getContentPane().add(BorderLayout.SOUTH, news);
		frame.setSize(400,300);
		frame.setVisible(true);
	}
}
