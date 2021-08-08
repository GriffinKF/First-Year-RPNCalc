package Default;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class containing various bits of test data for the program.
 * 
 * @author Taha Kashaf
 * @version January 2018
 */
public class Tester {
	
	/**
	 * Menu letting you choose which test to run
	 */
	public void runTestMenu()
    {
        String choice;
        boolean exit=false;
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.println("Test Menu");
            System.out.println("A - Test 1");
            System.out.println("B - Test 2");
            System.out.println("C - Test 3");
            System.out.println("D - Test 4");
            System.out.println("E - Test 5");
            System.out.println("F - Test 6");
            System.out.println("G - Test 7");
            System.out.println("H - Test 8");
            System.out.println("I - Test 8");
            System.out.println("Q - quit");        
            
            
            
            choice= s.next();
        
            switch (choice)
            {
                case "A":
            		System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 1 Results:");
                	test1();
                	break;
                case "B":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 2 Results:");
                	test2();
                	break;
                case "C":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 3 Results:");
                	test3();
                	break;
                case "D":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 4 Results:");
                	test4();
                	break;
                case "E":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 5 Results:");
                	test5();
                	break;
                case "F":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 6 Results:");
                	test6();
                	break;
                case "G":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 7 Results:");
                	test7();
                	break;
                case "H":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 8 Results:");
                	test8();
                	break;
                case "I":
                	System.out.println("Details of the tests can be found in program documentation");
            		System.out.println("Test 9 Results:");
                	test9();
                	break;
                case "Q":
                	System.out.println("Goodbye\n");
                      exit=true;
                        break;
                default: System.out.println("That is not a valid choice, please try again");
                        break;         
            }
        }while (!exit);
    }
	
	/**
	 * Push a node onto the empty stack. Then pop and display that node.
	 */
	public void test1() {
		Stack testStack = new Stack();
		testStack.push(1234);
		System.out.print(testStack.pop());
		System.out.println();
	}

	/**
	 * Push 3 nodes onto the empty stack, then print the stack.
	 */
	public void test2() {
		Stack testStack = new Stack();
		testStack.push(1);
		testStack.push(2);
		testStack.push(3);
		testStack.displayStack();
		System.out.println();
	}

	/**
	 * Pop a node from an empty stack.
	 */
	public void test3() {
		Stack testStack = new Stack();
		System.out.print(testStack.pop());
		System.out.println();
	}
	
	/**
	 * RPN Calculation
	 */
	public void test4() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "4,6,+";
		testCalc.useCalc(postfixInput);
	}

	/**
	 * RPN Calculation
	 */
	public void test5() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "4,6,2,+";
		testCalc.useCalc(postfixInput);
	}
	
	/**
	 * RPN Calculation
	 */
	public void test6() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "4,+";
		testCalc.useCalc(postfixInput);
	}
	
	/**
	 * RPN Calculation
	 */
	public void test7() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "4,5,+,6,*,12,-";
		testCalc.useCalc(postfixInput);
	}
	
	/**
	 * RPN Calculation
	 */
	public void test8() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "4 5 6, -, 7";
		testCalc.useCalc(postfixInput);
	}
	
	/**
	 * RPN Calculation
	 */
	public void test9() {
		RPNCalc testCalc = new RPNCalc();
		String postfixInput = "Rt,655,yy,-";
		testCalc.useCalc(postfixInput);
	}
	
}

