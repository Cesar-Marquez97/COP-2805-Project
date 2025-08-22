package cop2805;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;


/**
 * Homework 5
 * Main will contain the program GUI
 * @author Cesar Marquez
 * @version 1.0
 */

public class ProgramGUI extends JFrame{

	//create the gui parts that I need
	//For the user input
	JTextField inputName;
	
	//lists
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	JList<String> names = new JList<>(listModel);
	
	//buttons
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("Remove Name");
	JButton button3 = new JButton("Clear List");
	
	//colors for buttons
	Color color1 = Color.GREEN;
	Color color2 = Color.YELLOW;
	Color color3 = Color.RED;
	
	//first row
	//creating the rows box
	JPanel firstRow = new JPanel();
	JPanel secondRow = new JPanel();
	
	
	//GUI layout and body
	public ProgramGUI() {
			
	JFrame.setDefaultLookAndFeelDecorated(true);
	JFrame frame = new JFrame();
	
	frame.setTitle("Home Work 5 Solution");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	
	//using boxlayout
	//I want to control the size of my buttons
	
	//this will make the gui display vertically
	frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
	
	
	// 2- A JLabel instructing the user to enter a name
	firstRow.add(new JLabel("Enter Name: "));
				
				
	//1- A JTextField where the user can enter a name
	inputName = new JTextField("");
	inputName.setPreferredSize(new Dimension(150, 50));
	firstRow.add(inputName);
			
	//3- A JList that starts out empty	
	names.setPreferredSize(new Dimension(200, 200));
	firstRow.add(names);
				
	//4- A JButton that adds a name to the list
	button1.setPreferredSize(new Dimension(150, 50));	
	button1.setBackground(color1);
	secondRow.add(button1);
	
	///////////////////////////////////////////////
	//Button 1 action listener
	button1.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			
			//store the name in a string
			String checkName = inputName.getText();
		
			//checking calling the getText().length() 
			if(!(inputName.getText().length() == 0)) {
				listModel.addElement(checkName);
				inputName.setText("");
			}
			
					 
		}
	});
	//////////////////////////////////////////////////
		
	//5- A JButton that removes the selected name from the list
	button2.setPreferredSize(new Dimension(150, 50));
	button2.setBackground(color2);
	secondRow.add(button2);
	
	///////////////////////////////////////////////
	//button 2 action listener
	button2.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
		
			
			// calling getSelectedIndex() within the JList and seeing if it is -1
			int checkIndex = names.getSelectedIndex();
			
			if(checkIndex != -1) {
				listModel.remove(checkIndex);
			}
		}
		
	});
	///////////////////////////////////////////////	
				
	//6- A JButton that clears the contents of the list
	button3.setPreferredSize(new Dimension(150, 50));
	button3.setBackground(color3);
	secondRow.add(button3);
	
	///////////////////////////////////////////////
	//button 3 action listener
	button3.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			
			//clear list
			listModel.clear();
		}
		
	});
	///////////////////////////////////////////////					
	
	//adding the rows to the frame
	frame.add(firstRow);
	frame.add(secondRow);
	frame.pack();
	frame.setVisible(true);
				
				
	}
}
