package cop2805;

import javax.swing.SwingUtilities;
/**
 * Homework 5
 * Main will contain the program main
 * @author Cesar Marquez
 * @version 1.0
 */

public class Main{

	
	public static void main(String[] args) {
		
		//starts the GUI 
			SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ProgramGUI();
			}
		});
		
		}

}

