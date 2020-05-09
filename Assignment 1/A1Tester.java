/*
 * A1Tester
 *
 * A class to test the methods in Assignment 1
 *
 */
public class A1Tester {

	private static int testPassCount = 0;
	private static int testCount = 0;

	private static int array0[] = {};
	private static int array1[] = {8};
	private static int array2[] = {2, 3, 2, 0};
	private static int array3[] = {-1, 2, 4, 1, 3};

	private static int toFind[] = {4, 7, 1};
	private static int containsToFind1[] = {4, 7, 1};
	private static int containsToFind2[] = {1, 4, 4, 7, 1};
	private static int containsToFind3[] = {4, 4, 7, 1, 8};
	private static int doesNotContainToFind1[] = {4, 7, 7, 1};
	private static int doesNotContainToFind2[] = {7, 1, 4};
	private static int doesNotContainToFind3[] = {5, 4, 7};


    public static void main(String[] args) {

		// First, we call the printArray method in the ArrayOperations class
		// which prints the contents of the arrays we pass it
		ArrayOperations.printArray(array0);
		ArrayOperations.printArray(array1);
		ArrayOperations.printArray(array2);
		ArrayOperations.printArray(array3);

		// Next, we call the testSumArray method, which tests the SumArray
		// method found in the ArrayOperations class. The method is completed
		// for you. Read how the tests are formed - and how I determine what
		// the result should be, given the arrays defined above.
		testSumArray();

		//
		testProductArray();
		testArrayMax();
		testArrayMin();
		testAllBelowValue();
		testContainsValue();
		testContainsArray();

		System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
    }

    public static void displayResults (boolean passed, String testName)
    {
       /* There is some magic going on here getting the line number
        * Borrowed from:
        * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
        */

        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
    }

    public static void testSumArray() {
        int result = 0;

        result = ArrayOperations.sumArray(array0);
        //System.out.println("should be 0: " + result); // You may uncomment this to help with debugging
        displayResults(result==0, "testSumArray");

        result = ArrayOperations.sumArray(array1);
        //System.out.println("should be 8: " + result);
        displayResults(result==8, "testSumArray");

        result = ArrayOperations.sumArray(array2);
        //System.out.println("should be 7: " + result);
        displayResults(result==7, "testSumArray");

        result = ArrayOperations.sumArray(array3);
        //System.out.println("should be 9: " + result);
        displayResults(result==9, "testSumArray");

    }

    public static void testProductArray() {
        int result = 0;

        result = ArrayOperations.productArray(array0);
        // System.out.println("should be 1: " + result); // You may uncomment this to help with debugging
        displayResults(result==1, "testProductArray");

        result = ArrayOperations.productArray(array1);
        // System.out.println("should be 8: " + result);
        displayResults(result==8, "testProductArray");

        result = ArrayOperations.productArray(array2);
        // System.out.println("should be 0: " + result);
        displayResults(result==0, "testProductArray");

        result = ArrayOperations.productArray(array3);
        // System.out.println("should be -24: " + result);
        displayResults(result==-24, "testProductArray");

    }

    public static void testArrayMax() {
        int result = 0;

        // TODO: uncomment the following code to test this method

    		result = ArrayOperations.arrayMax(array1);
    		//System.out.println("should be 8: " + result);
    		displayResults(result==8, "testArrayMax");

    		result = ArrayOperations.arrayMax(array2);
    		//System.out.println("should be 3: " + result);
    		displayResults(result==3, "testArrayMax");

    		result = ArrayOperations.arrayMax(array3);
    		//System.out.println("should be 4: " + result);
    		displayResults(result==4, "testArrayMax");
    }

    public static void testArrayMin() {
        int result = 0;

        // TODO: uncomment the following code to test this method

        /*
		result = ArrayOperations.arrayMin(array1);
		//System.out.println("should be 8: " + result);
		displayResults(result==8, "testArrayMin");

		result = ArrayOperations.arrayMin(array2);
		//System.out.println("should be 0: " + result);
		displayResults(result==0, "testArrayMin");

		result = ArrayOperations.arrayMin(array3);
		//System.out.println("should be -1: " + result);
		displayResults(result==-1, "testArrayMin");
        */
    }


    public static void testAllBelowValue() {
        boolean result, shouldBe;

        // TODO: uncomment the following code to test this method

        /*
		result = ArrayOperations.allBelowValue(array1, 7);
		shouldBe = false;
		//System.out.println("should be: " + shouldBe);
		//System.out.println("it is: " + result);
		displayResults(result==shouldBe, "testAllBelowValue");

		result = ArrayOperations.allBelowValue(array1, 8);
		shouldBe = false;
		//System.out.println("should be: " + shouldBe);
		//System.out.println("it is: " + result);
		displayResults(result==shouldBe, "testAllBelowValue");

		result = ArrayOperations.allBelowValue(array1, 9);
		shouldBe = true;
		//System.out.println("should be: " + shouldBe);
		//System.out.println("it is: " + result);
		displayResults(result==shouldBe, "testAllBelowValue");

		result = ArrayOperations.allBelowValue(array2, 4);
		shouldBe = true;
		//System.out.println("should be: " + shouldBe);
		//System.out.println("it is: " + result);
		displayResults(result==shouldBe, "testAllBelowValue");

		result = ArrayOperations.allBelowValue(array2, 3);
		shouldBe = false;
		//System.out.println("should be: " + shouldBe);
		//System.out.println("it is: " + result);
		displayResults(result==shouldBe, "testAllBelowValue");
        */
    }

    public static void testContainsValue() {
        boolean result;

        // TODO: uncomment the following code to test this method

       /*
		result = ArrayOperations.containsValue(array2, 2);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsValue");

		result = ArrayOperations.containsValue(array2, 4);
		//System.out.println("should be false: " + result);
		displayResults(!result, "testContainsValue");

		result = ArrayOperations.containsValue(array3, 4);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsValue");

		result = ArrayOperations.containsValue(array3, 3);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsValue");

		result = ArrayOperations.containsValue(array3, 5);
		//System.out.println("should be false: " + result);
		displayResults(!result, "testContainsValue");
       */
    }


    public static void testContainsArray() {
        boolean result;

        // TODO: uncomment the following code to test this method

       /*
		result = ArrayOperations.containsArray(toFind, containsToFind1);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsArray");

		result = ArrayOperations.containsArray(toFind, containsToFind2);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsArray");

		result = ArrayOperations.containsArray(toFind, containsToFind3);
		//System.out.println("should be true: " + result);
		displayResults(result, "testContainsArray");

		result = ArrayOperations.containsArray(toFind, doesNotContainToFind1);
		//System.out.println("should be false: " + result);
		displayResults(!result, "testContainsArray");

		result = ArrayOperations.containsArray(toFind, doesNotContainToFind2);
		//System.out.println("should be false: " + result);
		displayResults(!result, "testContainsArray");

		result = ArrayOperations.containsArray(toFind, doesNotContainToFind3);
		//System.out.println("should be false: " + result);
		displayResults(!result, "testContainsArray");
       */
    }

}
