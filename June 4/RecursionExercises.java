public class RecursionExercises {
  /*
   * Purpose: sum all values from n down to 1
   * Parameters: (int) - n
   * Returns: (int) - the sum
   * Preconditions: n > 0
   */
  public static int sum(int n) {
    if (n == 1) {
      return 1;
    }
    return n + sum(n - 1);
  }

  /*
   * Purpose: sum all values from n^2 down to 1^2
   * Parameters: (int) - n
   * Returns: (int) - the sum of squares
   * Preconditions: n > 0
   */
  public static int sumSquares(int n) {
    // TODO: implement this method
    return 0;             // so it compiles
  }

  /*
   * Purpose: sum all odd values from n down to 1
   * Parameters: (int) - n
   * Returns: (int) - the sum of odd values
   * Preconditions: n > 0
   */
  public static int sumOdd(int n) {
    // TODO: implement this method
    return 0;             // so it compiles
  }

  /*
   * Purpose: sum all values in the array
   * Parameters: (int[]) arr - the array
   *             (int) i - last index to consider
   * Returns: (int) - the sum
   * Preconditions: arr has at least 1 element,
   *                0 <= i < arr.length
   */
  public static int sumArray(int[] arr, int i) {
    // TODO: implement this method
    return 0;             // so it compiles
  }

  /*
   * Purpose: count the number of negative values in the array
   * Parameters: (int[]) arr - the array
   *             (int) i - last index to consider
   * Returns: (int) - count of negatives values found
   * Preconditions: arr has at least 1 element,
   *                0 <= i < arr.length
   */
  public static int countNegative(int[] arr, int i) {
    // TODO: implement this method
    return 0;             // so it compiles
  }

  /*
   * Purpose: count the number of values in array equal to n
   * Parameters: (int[]) arr - the array
   *             (int) i - last index to consider
   *                         (int) n - value to search for
   * Returns: (int) - count of elements equal to n
   * Preconditions: arr has at least 1 element,
   *                0 <= i < arr.length
   */
  public static int countEqualTo(int[] arr, int i, int n) {
    // TODO: implement this method
    return 0;             // so it compiles
  }

  /*
   * Purpose: determine if all values in array are greater than n
   * Parameters: (int[]) arr - the array
   *             (int) i - last index to consider
   *                         (int) n - threshold elements must be greater than
   * Returns: (boolean) - true if all values are greater than n
   * Preconditions: arr has at least 1 element,
   *                0 <= i < arr.length
   */
  public static boolean allAbove(int[] arr, int i, int n) {
    // TODO: implement this method
    return false;             // so it compiles
  }
}
