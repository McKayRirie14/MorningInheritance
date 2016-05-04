package ctec.view;

import javax.swing.*;

import Controller.InheritanceController;

/**
 * @author mrir2917
 * @version 0.x Apr 20, 2016
 */
public class InheritanacePanel extends JPanel
{
private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				String temp = "The sorted contents are: \n";
				for(SillyThing current : baseController.getSillyThings())
				{
					
				}
				textArea.setText(baseController.showSillyLevels());
			}
		});
	}
}
