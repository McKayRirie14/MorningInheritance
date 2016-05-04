package Controller;

import java.util.ArrayList;

/**
 * @author mrir2917
 * @version 0.x April 12, 2016
 */
public class InheritanceController 
{
	public InheritanceController()
	{
		//build all model components 
		makeSillyList();
		//build view
	}
	private ArrayList<SillyThing> sillyThings;
	
	public String showSillyLevels()
	{
		String sillyLe("This is a " + currentSilly.toString() +
				"and has a silliness level of " + currentSilly.sillinessLevel() +""
	
	}
	
}
	
	private void makeSillyList()
	{
		sillyThings.add(new IPhone());
		sillyThings.add(new SamsungTextingPhone());
		/// Keep going....
	}
	
	public void start()
	{
		
	}
}
