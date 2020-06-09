/*
 * Lab5Tester.java
 */
public class Lab5Tester {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  public static void main(String[] args) {
    try {
      // testAddOne();
      // testAddOneRecursive();
      testDoubleRecursive();
      testDoubleOddsRecursive();
      // testSumValues();
      // testDoubleAtOddPositions();
    } catch (Exception e) {
      System.out.println("Your code threw an Exception.");
      System.out.println("Perhaps a stack trace will help:");
      e.printStackTrace(System.out);
    }
    System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
  }

  public static void testAddOne() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3     = new IntegerLinkedList();

    list3.addFront(-2);
    list3.addFront(0);
    list3.addFront(7);

    emptyList.addOne();
    System.out.println(emptyList);
    displayResults(emptyList.toString().equals(""), "testAddOne - empty");


    list3.addOne();
    System.out.println(list3);
    displayResults(list3.toString().equals("8 1 -1"), "testAddOne - length3");
  }

  public static void testAddOneRecursive() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3     = new IntegerLinkedList();

    list3.addFront(-2);
    list3.addFront(0);
    list3.addFront(7);

    emptyList.addOneRecursive();
    System.out.println(emptyList);
    displayResults(emptyList.toString().equals(""), "testAddOne - empty");


    list3.addOneRecursive();
    System.out.println(list3);
    displayResults(list3.toString().equals("8 1 -1"), "testAddOne - length3");
  }

  public static void testDoubleRecursive() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3     = new IntegerLinkedList();

    list3.addFront(-2);
    list3.addFront(0);
    list3.addFront(7);

    emptyList.doubleRecursive();
    System.out.println(emptyList);
    displayResults(emptyList.toString().equals(""), "testDouble - empty");

    list3.doubleRecursive();
    System.out.println(list3);
    displayResults(list3.toString().equals("14 0 -4"), "testDouble - length3");
  }

  public static void testDoubleOddsRecursive() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3     = new IntegerLinkedList();

    list3.addFront(-2);
    list3.addFront(0);
    list3.addFront(7);

    emptyList.doubleOddsRecursive();
    System.out.println(emptyList);
    displayResults(emptyList.toString().equals(""), "testDouble - empty");

    list3.doubleOddsRecursive();
    System.out.println(list3);
    displayResults(list3.toString().equals("14 0 -2"), "testDouble - length3");
  }

  public static void testSumValues() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3     = new IntegerLinkedList();

    list3.addFront(-2);
    list3.addFront(0);
    list3.addFront(7);

    int result = emptyList.sum();
    displayResults(result == 0, "testSumValues - empty");

    result = list3.sum();
    displayResults(result == 5, "testSumValues - length3");
  }

  public static void testDoubleAtOddPositions() {
    IntegerLinkedList emptyList = new IntegerLinkedList();
    IntegerLinkedList list3a    = new IntegerLinkedList();

    list3a.addFront(-2);
    list3a.addFront(5);
    list3a.addFront(7);
    list3a.addFront(8);

    emptyList.doubleOddPositionValues();
    displayResults(emptyList.toString().equals(""), "testDoubleAtOddPositions - empty");

    list3a.doubleOddPositionValues();
    displayResults(list3a.toString().equals("8 14 5 -4"), "testDoubleAtOddPositions - length3");
  }

  public static void displayResults(boolean passed, String testName) {
    /* There is some magic going on here getting the line number
     * Borrowed from:
     * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
     */
    testCount++;
    if (passed) {
      System.out.println("Passed test: " + testCount);
      testPassCount++;
    }
    else{
      System.out.println("Failed test: " + testName + " at line "
                         + Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
  }
}
