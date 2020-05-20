public interface Aligner {
	
	/*
	 * errorsAtOffset
	 *
	 * Purpose: Determine the number of errors between the 
	 *          sequences at the given index (offset)
	 *
	 * Parameters: int index - the offset (starting at 0) from the 
     *                         beginning of the sequence to align
	 *					  	   the subsequence to for the comparison
	 *		   	   String subsequence - the subsequence to compare
	 *
	 * Returns: int - the number of errors found at the given offset
	 *
	 */
	public int errorsAtOffset(int index, String subsequence);

	/*
	 * bestAlignmentOffset
	 *
	 * Purpose: Determine the best alignment between the sequence
	 *          and the new subsequence to test. Updates the values 
	 *          of offset, numErrors, and lastTested to the represent 
	 *          information about the best alignment found.
	 *
	 * Parameters: String subsequence - the subsequence to compare
	 *
	 * Returns: void 
	 *
	 */
	public void bestAlignmentOffset(String subsequence);
	
}