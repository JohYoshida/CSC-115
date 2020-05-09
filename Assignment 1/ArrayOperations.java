import java.lang.Math;

/*
 * ArrayOperations
 *
 * Rules:
 *  - DO NOT use builtin java Arrays methods
 *
 * A class with basic array methods to
 *  - print the values in an array
 *  - calculate the sum of all values in an array
 *  - calculate the product of all values in an array
 *  - calculate the minimum value in an array
 *  - calculate the maximum value in an array
 *  - determine whether all values in an array are below a given value
 *  - determine whether an array contains a given value
 *  - determine whether all the values in one array are found
 *      in another array (in the same order)
 *
 */
public class ArrayOperations {


    /*
     * printArray
     *
     * Purpose: prints all values in the array to the console
     *          Example format:  {1,2,3,4}
     *
     * Parameters: int[] - an array of integers
     *
     * Returns: void
     *
     */
	public static void printArray ( int[] array ) {
		System.out.print("{");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
			if(i<array.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

	/*
     * sumArray
     *
     * Purpose: computes the sum of all values in the given array
     *
     * Parameters: int[] - an array of integers
     *
     * Returns: int - sum of all values in the array
     *
     */
    public static int sumArray ( int[] array ) {
        int sum = 0;

        for(int i=0; i<array.length; i++)
            sum += array[i];

        return sum;
    }

    /*
     * productArray
     *
     * Purpose: computes the product of all values in the given array
     *  NOTE: product of 3 numbers n1, n2 and n3 = n1*n2*n3
     *  NOTE: product of no numbers = 1
     *
     * Parameters: int[] - an array of integers
     *
     * Returns: int - product of all values in the array
     *
     */
    public static int productArray ( int[] array ) {
        int product = 1;

				for (int i = 0; i < array.length; i++) {
					product = product * array[i];
				}

        return product;
    }

    /*
     * arrayMax
     *
     * Purpose: finds the maximum value in the given array
     *
     * Parameters: int[] - an array of integers
     *
     * Preconditions: array contains at least one element
     *
     * Returns: int - maximum value in the array
     *
     */
		public static int arrayMax ( int[] array ) {
			int max = array[0];
			for (int i = 1; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
			return max;
		}


    /*
     * arrayMin
     *
     * Purpose: finds the minimum value in the given array
     *
     * Parameters: int[] - an array of integers
     *
     * Preconditions: array contains at least one element
     *
     * Returns:  int - minimum value in the array
     *
     */
    // TODO: Write the arrayMin method here
    	public static int arrayMin ( int[] array ) {
				int min = array[0];
				for (int i = 1; i < array.length; i++) {
					if (array[i] < min) {
						min = array[i];
					}
				}
				return min;
		}



    /*
     * allBelowValue
     *
     * Purpose: determines whether all values in array are below a threshold
     *
     * Parameters: int[] - array of integers
     *             int - threshold that numbers must be below
     *
     * Returns: boolean - true if all values below, false otherwise
     *
     */
     // TODO: Write the allBelowValue method here

    /*
     * containsValue
     *
     * Purpose: determines whether the array contains the given value
     *
     * Parameters: int[] - array of integers to search through
     *             int - value to search for
     *
     * Returns: boolean - true if value is found, false otherwise
     *
     */


	/*
     * containsArray
     *
     * Purpose: determines whether the array searchArray contains
	 *          all of the values in array nums in the same order
     *
     * Parameters: int[] nums - array of integers that must be found
     *             int[] searchArray - array of integers to search through
     *
     * Returns: boolean - true if all values in nums found, false otherwise
     *
     */

}
