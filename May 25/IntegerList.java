public interface IntegerList {
    
	/* Parameters: (int) val
	 * Purpose:  add val to the front of the list
	 * Returns:  nothing
	 */
	void addFront (int val);

	/* Parameters: (int) val
	 * Purpose:  add val to the back of the list
	 * Returns:  nothing
	 */
	void addBack (int val);
	
	/* Parameters: (int) position
	 * Purpose:  insert an item into the list at the given position
	 * Returns:  nothing
	 * Precondition: 0 <= position <= list.size()
	 */
	void insertAt (int position);

	/* Parameters: none
	 * Purpose: get the number of elements in the list
	 * Returns: (int) number of elements in list
	 */
	int size ();

	/* Parameters: (int) position
	 * Purpose:  get the int value at specified position in the list
	 * Returns:  (int) the value of the element
	 * Precondition: 0 <= position < list.size()
	 */
	int get (int position);
	

    
}

