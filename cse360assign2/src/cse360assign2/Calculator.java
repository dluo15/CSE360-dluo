/**
 *Name: Darren Luo
 *Class ID: 463
 *CSE 360 Assignment #2
 *Description: Calculator that performs addition, subtraction, multiplication,
 *division, and obtains history of previous inputs into the calculator. 
 */

package cse360assign2;

public class Calculator 
{
	private int total;
	
	/**
	 * Constructor that creates a total variable to keep track of total in
	 * calculator when performing functions
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns total after mathematical operations are finished being 
	 * performed on calculator
	 * 
	 * @return current total which holds total after any mathematical
	 * operations are performed
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * Performs addition with values entered by the user
	 * 
	 * @param user-inputted value
	 */
	public void add (int value) 
	{
		total = total + value;
	}
	
	/**
	 * Performs subtraction with values entered by the user
	 * 
	 * @param user-inputted value
	 */
	public void subtract (int value) 
	{
		total = total - value;
	}
	
	/**
	 * Performs multiplication with values entered by the user
	 * 
	 * @param user-inputted value
	 */
	public void multiply (int value) 
	{
		total = total * value;
	}
	
	/**
	 * Performs division with values entered by the user
	 * 
	 * @param user-inputted value
	 */
	public void divide (int value) 
	{	
		if (value == 0)
		{
			total = 0;
		}
		
		total = total / value;
	}
	
	/**
	 * Obtains history of mathematical operations performed on the 
	 * calculator
	 * 
	 * @return String containing history of mathematical operations performed
	 */
	public String getHistory () 
	{
		return "";
	}
}
