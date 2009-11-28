
/*
 * BoxLayoutDemo.java requires no other files.
 */


import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class TestBoxLayout {
	
	
	
    public static void addComponentsToPane(Container pane) {
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		addAButton("Button 1", pane);
	    addATextArea("socialFactor", pane);
        addAButton("Button 3", pane);
        addAButton("Long-Named Button 4", pane);
        addAButton("5", pane);
    }

    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
	
	private static void addATextArea(String text, Container container) {
        JTextArea textArea = new JTextArea(text);
        textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(textArea);
    }
	

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        
		
		//Create and set up the window.
        JFrame frame = new JFrame("BoxLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	
	
		//create objects
	factor social 	= new factor();
	factor science 	= new factor();
	factor economy 	= new factor();
	factor military	= new factor();
	
		social.setFactor(10);
		science.setFactor(15);
	
	//set initial values
	
	
	
	String socialFactor=social.getFactor();
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
