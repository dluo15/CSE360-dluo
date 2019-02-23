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
	private String calculatorHistory;
	
	/**
	 * Constructor that initializes a total variable to keep track of total in
	 * calculator when performing functions, and initializes string that
	 * contains calculator history
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		calculatorHistory = "0";
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
	 * Adds user inputted value to total
	 * 
	 * @param user-inputted value
	 */
	public void add (int value) 
	{
		total = total + value;
		
		calculatorHistory = calculatorHistory + " + " + value; //adds addition operation to calculatorHistory string
	}
	
	/**
	 * Performs subtraction with values entered by the user
	 * Subtracts user inputted value from total
	 * 
	 * @param user-inputted value
	 */
	public void subtract (int value) 
	{
		total = total - value;
		
		calculatorHistory = calculatorHistory + " - " + value; //adds subtraction operation to calculatorHistory string
	}
	
	/**
	 * Performs multiplication with values entered by the user
	 * Multiplies total by user inputted value
	 * 
	 * @param user-inputted value
	 */
	public void multiply (int value) 
	{
		total = total * value;
		
		calculatorHistory = calculatorHistory + " * " + value; //adds multiplication operation to calculatorHistory string
	}
	
	/**
	 * Performs division with values entered by the user
	 * Divides total by user inputted value
	 * 
	 * @param user-inputted value
	 */
	public void divide (int value) 
	{	
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total = total / value;
		}
		
		calculatorHistory = calculatorHistory + " / " + value; //adds division operation to calculatorHistory string
	}
	
	/**
	 * Obtains history of mathematical operations performed on the 
	 * calculator
	 * 
	 * @return String containing history of mathematical operations performed
	 */
	public String getHistory () 
	{
		return calculatorHistory;
	}
}
