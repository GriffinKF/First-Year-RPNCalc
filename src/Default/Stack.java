package Default;

/**
 * Wrapper class that uses the List class to create a stack
 * 
 * @author Taha Kashaf
 * @version January 2018
 */
public class Stack {
	
	List theStack = new List();

	/**
	 * Method to push onto the stack
	 * 
	 * @param input the user input being added to the stack 
	 */
	public void push(int input) {
		theStack.addToList(input);
	}
	
	/**
	 * Method to pop from the stack
	 * @return the value of what was popped
	 */
	public int pop() {
		return theStack.deleteFromStart();
	}
	
	/**
	 * Method that checks if list is empty
	 * @return true if the list is empty
	 */
	public boolean emptyCheck() {
		return theStack.isListEmpty();
	}
	
	/**
	 * method that displays the list.
	 */
	public void displayStack() {
		theStack.printList();
	}
}