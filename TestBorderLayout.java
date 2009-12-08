import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestBorderLayout extends JFrame
	{
	private JTextArea TArea[];
	private String names[] = { "Hide North","Hide South","HideEast","Hide West","Hide Center"};
	private BorderLayout layout;
	
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
		social.setFactor(20);
		science.setFactor(12);
		economy.setFactor(5);
		military.setFactor(12);
		
	}
	public TestBorderLayout()
	{
		super("BorderLayout Demo");
		layout = new BorderLayout(5,5);
		
		Container container = getContentPane();
		container.setLayout(layout);
	//	textArea = new JTextArea(5, 20)
		TArea = new JTextArea[names.length];
		for (int count = 1;count < names.length;count++)
		{
			TArea[count] = new JTextArea(names[count]);
			
		}
	
		TArea[0] =new JTextArea(science.getFactor());
		container.add(TArea[0],BorderLayout.NORTH);
		container.add(TArea[1],BorderLayout.SOUTH);
		container.add(TArea[2],BorderLayout.EAST);
		container.add(TArea[3],BorderLayout.WEST);
		container.add(TArea[4],BorderLayout.CENTER);
		
		setSize(400,400);
		setVisible(true);
	}
	
	
	
				
	public static void main(String[] args) 
	{
		init();
		TestBorderLayout application = new TestBorderLayout();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
