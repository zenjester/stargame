import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
// java.beans.PropertyChangeListener;
//import java.beans.PropertyChangeEvent;

import java.text.*;

/**
 * FormattedTextFieldDemo.java requires no other files.
 *
 * It implements a mortgage calculator that uses four
 * JFormattedTextFields.
 */
public class TestPane extends JPanel
                                   {
     //Labels to identify the fields
    private JLabel militaryLabel;
    private JLabel socialLabel;
    private JLabel economicLabel;
    private JLabel scienceLabel;

    //Strings for the labels
    private static String militaryString = "Military Value: ";
    private static String socialString = "Social Value: ";
    private static String economicString = "Economic Value: ";
    private static String scienceString = "Science value: ";
	

    //Fields for data entry
    private JFormattedTextField militaryField;
    private JFormattedTextField socialField;
    private JFormattedTextField economicField;
    private JFormattedTextField sc‪ienceField;

    public TestPane() {
        super(new BorderLayout());
        //setUpFormats();
       // double sc‪ience = computesc‪ience(military,social, economic);
		
        //Create the labels.
        militaryLabel = new JLabel(militaryString);
        socialLabel = new JLabel(socialString);
        economicLabel = new JLabel(economicString);
        scienceLabel = new JLabel(scienceString);

        //Create the text fields and set them up.
        militaryField = new JFormattedTextField();
        militaryField.setValue(10);
        militaryField.setColumns(10);
        //militaryField.addPropertyChangeListener("value", this);

        socialField = new JFormattedTextField();
        socialField.setValue(66);
        socialField.setColumns(10);
        //socialField.addPropertyChangeListener("value", this);

        economicField = new JFormattedTextField();
        economicField.setValue(67);
        economicField.setColumns(10);
        //economicField.addPropertyChangeListener("value", this);

        sc‪ienceField = new JFormattedTextField();
        sc‪ienceField.setValue(75);
        sc‪ienceField.setColumns(10);
        sc‪ienceField.setEditable(false);
        sc‪ienceField.setForeground(Color.red);
		
		
		

      /*  //Tell accessibility tools about label/textfield pairs.
        militaryLabel.setLabelFor(militaryField);
        socialLabel.setLabelFor(socialField);
        economicLabel.setLabelFor(economicField);
        sc‪ienceLabel.setLabelFor(sc‪ienceField);
		
		
*/
        //Lay out the labels in a panel.
        JPanel labelPane = new JPanel(new GridLayout(0,1));
        labelPane.add(militaryLabel);
        labelPane.add(socialLabel);
        labelPane.add(economicLabel);
        labelPane.add(scienceLabel);

        //Layout the text fields in a panel.
        JPanel fieldPane = new JPanel(new GridLayout(0,1));
        fieldPane.add(militaryField);
        fieldPane.add(socialField);
        fieldPane.add(economicField);
        fieldPane.add(sc‪ienceField);

        //Put the panels in this panel, labels on left,
        //text fields on right.
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        add(labelPane, BorderLayout.CENTER);
        add(fieldPane, BorderLayout.LINE_END);
    }

    private static void createAndShowGUI() {
		
		
        //Create and set up the window.
        JFrame frame = new JFrame("TestPane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        frame.add(new TestPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
		
			//create objects
			
			int socialValue;
	factor social 	= new factor();
	factor science 	= new factor();
	factor economy 	= new factor();
	factor military	= new factor();
	
	//set initial values
	
	social.setFactor(10);
	science.setFactor(15);
	economy.setFactor(30);
	military.setFactor(14);
	
	socialValue=social.getFactor();

	
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
	        UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
				
            }
        });
    }
}
