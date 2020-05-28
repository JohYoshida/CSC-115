public class Node {
    
    private int value;
    protected Node next;

    public Node () {
        this.value = 0;
        this.next = null;
    }
    
    public Node (int value) {
        this.value = value;
        this.next = null;
    }
	
	public Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
    
    /* Parameters: nothing
     * Purpose:  get the value of this Node
     * Returns:  (int) the value
     */
    public int getValue() {
        return value;
    }
   
    /* Parameters: (int) value
     * Purpose:  set the value of this Node to value
     * Returns:  nothing
     */
    public void setValue(int value) {
        this.value = value;
    }

    /* Parameters: nothing
     * Purpose:  get the next of this Node
     * Returns:  (Node) the next
     */
    public Node getNext() {
        return next;
    }
    
    /* Parameters: (Node) next
     * Purpose:  set the next of this Node to next
     * Returns:  nothing
     */
    public void setNext(Node next) {
        this.next = next;
    }

}


