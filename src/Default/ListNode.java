package Default;


/**
 * Performs actions on the list's nodes
 * 
 * @author AC12001 Team (Edited heavily by Taha Kashaf)
 * @version January 2018
 */
public class ListNode    
{
    // instance variables
    private int mark;
    private ListNode next;

    /**
     * Constructor for objects of class List
     */
    public ListNode(int mark)
    {
        // initialise instance variables
        this.mark = mark;
        this.next = null;
    }
    
     /**
     * Get the next node
     * 
     * @return the next node
     */
    public ListNode getNext()
    {
        return next;
    }
    
    
     /**
     * Get the mark
	 *
     * @return mark at this node
     */
    public int getMark()
    {
        return mark;
    }
  

     /**
     * Set the next node
     * 
     * @param  the node to be added at this node's next
     */
    public void setNext(ListNode next)
    {
        this.next = next;
    }
    
     /**
     * Return a string containing the data from this node, formatted
     */
    public String printInfo()
    {
        String info;
        
        info = "Inputed number = " + mark;
        
        return info;
    }
}

