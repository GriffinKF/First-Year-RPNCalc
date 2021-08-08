package Default;

import java.awt.Choice;
import java.util.Scanner;

public class Menu {
	
    /**
     * Please don't write your test code directly in your main method!
     * Create an instance of your test class and then run various test methods.
     * @param args
     */
    public static void main(String args[])
    {
    	Menu mainMenu = new Menu();
    	mainMenu.displayMenu();
    	mainMenu.processUserChoices();
    }
	
	
	/**
     * A simple method that displays menu choices
     */
	public void displayMenu()
	{
	 System.out.println("Please select one of the options below (Enter a number 0-3)");
	 System.out.println("1. View Calculator Instructions");
	 System.out.println("2. Use Calculator");
	 System.out.println("3. Run Tests");
	 System.out.println("0. Exit");
	}
	
	
	/**
     * A large method to deal with the choice the user inputs. A while loop is used both to repeat the menu until the user selects 	exit, and to repeat the menu if an invalid input in given.
     */
	public void processUserChoices()
	{
	
		int repeat = 0;
		String userChoice = "Default";
		
	
		while (repeat == 0) 
		{
			Scanner s = new Scanner(System.in);
			userChoice = s.nextLine();
			
			switch (userChoice)
			{
				case "1":
					System.out.println("You have selected to view calculator instructions");
					System.out.println("To use the calculator, enter each part of your postfix notation, seperated by a comma. Do not use spaces");
					System.out.println("Both positve and negative numbers are excepted, but they must be whole numbers");
					System.out.println("You can use either '-' for subtraction, '+' for addition, or '*' for multiplication ");
					System.out.println("If your postfix input is invalid, or cannot be fully processed, you will be asked to give a corrected input.");
					System.out.println("Enter anything to return to the menu");
					s.next();
					repeat = 0;
					displayMenu();
					break;		

				case "2":
					RPNCalc calc = new RPNCalc();
					boolean validInput = false;
					System.out.println("You have selected to use the calculator");
					System.out.println("Please enter your postfix notation input. As described in the Calculator instructions");
					String postfixInput = s.next();
					validInput = calc.useCalc(postfixInput);
					
					while (validInput == false) {
						RPNCalc calc2 = new RPNCalc();
						System.out.println("Or type 'EXIT' to return to the main menu");
						String postfixInput2 = s.next();
						if (postfixInput2.equals("EXIT")) {
							break;
						}
						validInput = calc2.useCalc(postfixInput2);
					}
					
					repeat = 0;
					displayMenu();
					break;

				case "3":
					System.out.println("You have selected to run automated tests");
					Tester autoTests = new Tester();
					autoTests.runTestMenu();
					repeat = 0;
					displayMenu();
					break;

				case "0":
					repeat = 1;
					break;

				default:
					System.out.println("That is not a valid selection, please enter a valid option from the displayed Menu");
					displayMenu();
					repeat = 0;
					break;
			}    
		
		}
	
	}

}
