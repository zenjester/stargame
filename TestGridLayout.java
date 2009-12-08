
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
	
	static factor social;
	static factor science;
	 static factor military;
	static factor economy;
	
	static void init()
	{
		social=new factor();
		science=new factor();
		military=new factor();
		economy=new factor();
		
	}
	

	
    public static void addComponentsToPane(Container pane)
	 { 
        
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
		addATextArea(science.getFactor(), pane);
	    addATextArea(social.getFactor(), pane);
		addATextArea(military.getFactor(), pane);
		addATextArea(economy.getFactor(), pane);
		addAButton("Bob",pane);
        
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
	
		init();
		social.setFactor(20);
		science.setFactor(12);
		economy.setFactor(5);
		military.setFactor(12);
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
