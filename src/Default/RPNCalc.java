package Default;

import java.util.Scanner;

/**
 * Class for the RPN Calculator itself
 * @author Taha Kashaf
 *
 */
public class RPNCalc {

	Stack theStack = new Stack();
	
	/**
	 * Checks if user input is correctly formatted for the RPN calculator
	 * @param userInput Input to be checked.
	 * @return true if input is correct.
	 */
	public boolean userInput(String userInput)
    {
        String [] splitString = userInput.split(",");
    
        System.out.println("Postfix notation input = " + userInput);
        
        for(int i=0;i<splitString.length; i++)
        {
            
        	boolean check = false;
            boolean secondaryCheck = false;
        	
            check = RPNCalc.isNumeric(splitString[i]);
        	
        	if (check == true) {
        	}
        	
        	if (check == false) {
        		if (splitString[i].equals("+") || splitString[i].equals("-") || splitString[i].equals("*")) {
        			secondaryCheck = true;
        		}
        	} 
        	
        	if (check == false && secondaryCheck == false) {
        		System.out.println("Your entry has invalid formatting. Please try again, formatting instructions can be found in the menu.");
       		return false;
        	}
        	
        }
        
        return true;
    }

	/**
	 * This method is not mine, I found it on StackOverflow
	 * @param strNum the string to check.
	 * @return true if string is numeric.
	 */
	public static boolean isNumeric(String strNum) {
	    try {
	        int input = Integer.parseInt(strNum);
	    } catch (NumberFormatException | NullPointerException nfe) {
	        return false;
	    }
	    return true;
	}

	/**
	 * The RPN calculator in action, pushing, popping and completing the arithmetic 
	 * @param userInput user input being calculated with
	 * @return the final answer
	 */
	public int calculate(String userInput) {
		String [] splitString = userInput.split(",");
		for(int i=0;i<splitString.length; i++)
        {
            
        	boolean check = false;
            boolean secondaryCheck = false;
        	
            check = RPNCalc.isNumeric(splitString[i]);
        	
        	if (check == true) {
        		theStack.push(Integer.parseInt(splitString[i]));
        	}
        	
        	if (check == false) {
        		if (splitString[i].equals("+") || splitString[i].equals("-") || splitString[i].equals("*")) {
        			
        			int pop1 = 0;
        			int pop2 = 0;
        			int push = 0;
        			
        			secondaryCheck = true;
        			pop1 = theStack.pop();
        			pop2 = theStack.pop();
        			
        			
        			if (splitString[i].equals("+")) {
        				push = pop1 + pop2;
        				theStack.push(push);
        			} else if (splitString[i].equals("-")) {
        				push = pop1 - pop2;
        				theStack.push(push);
        			} else if (splitString[i].equals("*")) {
        				push = pop1 * pop2;
        				theStack.push(push);
        			}
        			
        		}
        	} 
        	
        }
		
		return theStack.pop();
	
	}
	
	/**
	 * Method which checks if the RPN input is valid
	 * @param userInput input to be checked
	 * @return true if RPN input is valid.
	 */
	public boolean useCalc(String userInput) {
		
		boolean validInput = userInput(userInput);
		boolean validPostfix = false;
		int answer;
		
		while(validInput = false) {
			return validInput;
		}
		
		try {
			answer = calculate(userInput);
		} catch (NullPointerException nfe) {
			System.out.println("You have entered an invalid postfix notation, please try again");
			return validPostfix;
		}
		
		if (theStack.emptyCheck() == false) {
			System.out.println("You have entered an invalid postfix notation, please try again");
			return false;
		}
		
		System.out.println("The final answer is " + answer);
		System.out.println("Enter anything to continue");
		Scanner s = new Scanner(System.in);
		s.next();
		return true;
		
	}

}


