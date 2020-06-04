public class RecursionTester {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  public static void main(String[] args) {
    // implement and test each of the methods
    // in RecursionExercises.java, one at a time

    testSum();
    // testSumSquares();
    // testSumOdd();
    // testSumArray();
    // testCountNegative();
    // testCountEqualTo();
    // testAllAbove();

    System.out.println("\nPASSED " + testPassCount + "/" + testCount + " tests");
  }

  public static void testSum() {
    int result = 0;

    result = RecursionExercises.sum(1);

    displayResults(result == 1, "testSum1");
    result = RecursionExercises.sum(5);
    // should be 5+4+3+2+1=15
    displayResults(result == 15, "testSum2");

    result = RecursionExercises.sum(7);
    // should be 7+6+5+4+3+2+1=28
    displayResults(result == 28, "testSum3");
  }

  public static void testSumSquares() {
    int result = 0;

    result = RecursionExercises.sumSquares(1);
    displayResults(result == 1, "testSumSquares1");

    result = RecursionExercises.sumSquares(3);
    // should be 1+4+9=13
    displayResults(result == 14, "testSumSquares2");

    result = RecursionExercises.sumSquares(5);
    // should be 1+4+9+16+25=55
    displayResults(result == 55, "testSumSquares3");
  }

  public static void testSumOdd() {
    int result = 0;

    result = RecursionExercises.sumOdd(1);
    displayResults(result == 1, "testSumOdd1");

    result = RecursionExercises.sumOdd(5);
    // should be 1+3+5=9
    displayResults(result == 9, "testSumOdd2");

    result = RecursionExercises.sumOdd(10);
    // should be 1+3+5+7+9=25
    displayResults(result == 25, "testSumOdd3");
  }

  public static void testSumArray() {
    int result = 0;

    int[] arr1 = { 3 };
    result = RecursionExercises.sumArray(arr1, arr1.length - 1);
    displayResults(result == 3, "testSumArray1");

    int[] arr2 = { 8, 1, 3, 4 };
    result = RecursionExercises.sumArray(arr2, arr2.length - 1);
    // should be 8+1+3+4=16
    displayResults(result == 16, "testSumArray2");

    int[] arr3 = { 4, 1, 3, 2, 5, 6, 2 };
    result = RecursionExercises.sumArray(arr3, arr3.length - 1);
    // should be 4+1+3+2+5+6+2=23
    displayResults(result == 23, "testSumArray3");
  }

  public static void testCountNegative() {
    int result = 0;

    int[] arr1 = { 3 };
    result = RecursionExercises.countNegative(arr1, arr1.length - 1);
    displayResults(result == 0, "testCountNegative1");

    int[] arr2 = { -3 };
    result = RecursionExercises.countNegative(arr2, arr2.length - 1);
    displayResults(result == 1, "testCountNegative2");

    int[] arr3 = { -8, 1, -3, -4 };
    result = RecursionExercises.countNegative(arr3, arr3.length - 1);
    displayResults(result == 3, "testCountNegative");

    int[] arr4 = { -4, -1, 3, -2, -5, -6, 2 };
    result = RecursionExercises.countNegative(arr4, arr4.length - 1);
    displayResults(result == 5, "testCountNegative3");
  }

  public static void testCountEqualTo() {
    int result = 0;

    int[] arr1 = { 5 };
    result = RecursionExercises.countEqualTo(arr1, arr1.length - 1, 4);
    displayResults(result == 0, "testCountEqualTo1");
    result = RecursionExercises.countEqualTo(arr1, arr1.length - 1, 5);
    displayResults(result == 1, "testCountEqualTo2");
  }

  public static void testAllAbove() {
    boolean result = false;

    int[] arr1 = { 3 };
    result = RecursionExercises.allAbove(arr1, arr1.length - 1, 2);
    displayResults(result == true, "testAllAbove1");
    result = RecursionExercises.allAbove(arr1, arr1.length - 1, 3);
    displayResults(result == false, "testAllAbove2");

    int[] arr2 = { 13, 8, 24, 10, 9 };
    result = RecursionExercises.allAbove(arr2, arr2.length - 1, 7);
    displayResults(result == true, "testAllAbove1");
    result = RecursionExercises.allAbove(arr2, arr2.length - 1, 8);
    displayResults(result == false, "testAllAbove2");
  }

  public static void displayResults(boolean passed, String testName) {
    /* There is some magic going on here getting the line number
     * Borrowed from:
     * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
     */

    testCount++;
    if (passed) {
      System.out.println("Passed test: " + testName);
      testPassCount++;
    }
    else{
      System.out.println("Failed test: " + testName + " at line "
                         + Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
  }
}
