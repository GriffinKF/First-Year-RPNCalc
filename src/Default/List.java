package Default;


/**
 * Lab 1
 * 
 * @author AC12001 Team (Edited by Taha Kashaf)
 * @version January 2018
 */
public class List 
{
    private ListNode head;
    
    /**
     * Constructor for objects of class List
     * Create a head
     */
    public List()
    {
        head = null;
    }

     /**
     * Add a new node at the start of a list
     * 
     * @param mark user inputed integer  
     */
    public void addToList(int mark)
    {

        ListNode  newOne;
        
        newOne = new ListNode(mark);        
        newOne.setNext(head);
        
        head = newOne;
    }
 
    /**
     * Print the list, starting at head
     */
     public void printList()
     {
        ListNode marker;

        if (head == null)
        {
        	System.out.println("The list is empty.");  
        }
        else
        {
	        System.out.println("The list contains:");    
	        for (marker = head; marker != null; marker=marker.getNext())
	        {
	              System.out.println(marker.printInfo());  
	        }
        }
    }
     
     /**
      * Simple method that checks if the list is empty.
      */
     public boolean isListEmpty() {
    	 if (head == null) {
    		 return true;
    	 } else {
    		 return false;
    	 }
     }

   /**
     * Find a node
     * 
     * @param  mark Number to find
     * @return node if found, else null
     */
     public ListNode findInList(int mark)

    {
        ListNode marker, foundNode=null;
        
        for (marker = head; marker != null && foundNode == null; marker=marker.getNext())
        {
            if (mark == marker.getMark())
            {
                foundNode = marker;
            }
        }

         return foundNode;  
    }

     /**
      * Delete a node from the start of the list, and return the value of the deleted node.
      */
     public int deleteFromStart() {
    	 
    	 ListNode tempStore;
    	 tempStore = head;
    	 head = head.getNext();
    	 
    	 return tempStore.getMark();
    	 
    	 
     }
}

