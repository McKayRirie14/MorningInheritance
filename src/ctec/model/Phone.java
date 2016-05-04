package ctec.model;

import javax.swing.JOptionPane;
/** 
 * @author mrir2917
 * @version O.x April 12 
 *  */

public class Phone 
{
	
}
	public String toString()
	{
		String description = "This is a " + this.getClass().getName() + " and has a meme of: " + relatedMeme();
		
		return description;
	}

	/**
	 * If the supplied variable compared comes before the calling variable 
	 * return -1
	 * If the supplied variable is after the calling variable return 1.
	 * Else if they are the same, return 0.
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if( compared instanceof SillyThing)
		{
			if(this.sillinessLevel() > ((SillyThing) compared).sillinessLevel())
			{
				comparedValue = -1;
			}
			else if(this.sillinessLevel() > ((SillyThing) compared).sillinessLevel())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = -1;
			}
		}
		
		return comparedValue;
	}
	
}