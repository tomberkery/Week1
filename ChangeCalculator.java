package week1;
import java.util.*;
public class ChangeCalculator
{

	public static void main(String[] args) 
	{
		/**Problem: you have to give someone change what coins do you give that person? 
		 Requirements: takes user input 
		 displays the change breakdown as output
		1. Understand and Define the Problem 
		  ask user for input, US coins (quarter, dime, nickel, penny),  max change: 99¢  display coin output ,
		  What’s involved?  Write java docs to explain your program and algorithms. 
		2. Determine Input and Output
		Typed input by user: amount of change requested (an integer between 1 and 99) 
		Printed output:  
		Number of quarters given  
		Number of dimes given  
		Number of nickels given  
		Number of pennies given
		Note: if there are no quarters as change we should not display "0 quarter". Only print the expected change. Example change = 6 cents
		Output should be: 
		1 Nickels 
		1 Pennies **/
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the total amount to be converted.  (1 - 99) :");
		//define define storage variables for passing on to the next method
		int total = input.nextInt();
		int totalForDimes = (countQuarters(total));
		int totalForNickels = (countDimes(totalForDimes));
		int pennies = countNickels(totalForNickels);
		System.out.println("Number of pennies given: " +pennies );
		//countDimes(totalForDimes);
		
	}
	public static int countQuarters(int total) 
	{
		/** Check if the amount entered is < 25. if so, no quarters would be displayed
		 * and it returns the original total.  It not, that the total/25 gives the # of quarters to be displayed
		 * the new total therefore equals total % 25, which is then returned to main to be used to calculate the number
		 * of dimes to be given if any.
		 */
		int total2;
		int quarters = 0;
		if ( total < 25) {  //checks to see if any quarters should be given out
			//System.out.println("Number of quarters given: 0");
			total2 = total;
		}
		else {
			quarters = total / 25;
			System.out.println("Number of quarters given: " +quarters);
			total2 = total % 25;
		}
		return total2;
	}
	public static int countDimes(int totalForDimes) {
		
		int total3;
		int dimes = 0;
		if (totalForDimes < 10) {
			total3 = totalForDimes;
		}
		else {
			dimes = totalForDimes / 10;
			System.out.println("Number of dimes given: " + dimes);
			total3 = totalForDimes % 10;
		}
		return total3;
	}
	public static int countNickels(int totalForNickels) {
		int total4= 0;
		int nickels = 0;
		if (totalForNickels < 5) {
			total4 = totalForNickels;
		}
		else {
			nickels = totalForNickels / 5;
			System.out.println("Number of nickels given: " + nickels);
			total4 = totalForNickels % 5;
		}
				
		return total4;
		
	}
}
