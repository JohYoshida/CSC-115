public interface Vehicle {

    /*
     * Parameters: none
     * Purpose: determines whether it is safe to begin a trip
     * Returns: boolean - true if is safe, false otherwise
     * Preconditions: none
     */
	boolean safetyCheck();

    /*
     * Parameters: none
     * Purpose: moves the vehicle the specified amount
	 *          if it is safe to do so
     * Returns: none
     * Preconditions: none
     */
	void drive(int distance);
	
	/*
     * Parameters: none
     * Purpose: get total kms traveled by the vehicle
     * Returns: int - total number of kms the vehicle has driven
     * Preconditions: none
     */
    int getKMs();


}
