/*
 * Lab1Part2Tester.java
 *
 * A tester for the methods in your Student class
 *
 */
public class Lab1Part2Tester {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  // for approximate comparison of floating point numbers
  private static final double THRESHOLD = 0.01;

  public static void main(String[] args) {
    testConstructorsAndGetters();
    testSettersAndGetters();
    testToString();
    testEquals();

    System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
  }

  public static void displayResults(boolean passed, String testName) {
    /* There is some magic going on here getting the line number
     * Borrowed from:
     * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
     */

    testCount++;
    if (passed)
    {
      System.out.println("Passed test: " + testName);
      testPassCount++;
    }
    else
    {
      System.out.println("Failed test: " + testName + " at line "
                         + Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
  }

  public static void testConstructorsAndGetters() {
    // Tests constructor with no arguments, getSID and getGrade
    // TODO: once you have created a Student class with
    //  default constructor, getSID and getGrade methods
    //  uncomment the following to test these

    /*
     * Student s = new Student();
     * String sID;
     * int grade;
     *
     * sID = s.getSID();
     * displayResults( sID.equals(""), "test no args constructor and getSID");
     * grade = s.getGrade();
     * displayResults( grade == -1, "test no args constructor and getSID");
     */

    // TODO:
    //  Once you have added the second contructor to your Student class,
    //  write tests to test constructor with arguments using getSID and getGrade
    //  as we did for the constructor with no arguments.
  }

  public static void testSettersAndGetters() {
    // TODO: create a student object and test setSID and setGrade
    // hint: use getSID and getGrade methods to get values
    //       as done in testConstructorsAndGetters
  }

  public static void testToString() {
    // TODO: once you have written toString in the Student class,
    //  create a student object and test the toString method
  }

  public static void testEquals() {
    // TODO: once you have written equals in the Student class,
    //  uncomment the following tests

    /*
     * Student s1a = new Student("abc", 10);
     * Student s1b = new Student("abc", 10);
     * Student s1c = new Student("abc", 20);
     * Student s2a = new Student("abcd", 10);
     * Student s2b = new Student("abcd", 20);
     *
     *
     * // the following 2 tests are equivalent - can you see this?
     * // check with your TA if you are unsure
     * displayResults( s1a.equals(s1a), "test equals method - true");
     * displayResults( s1a.equals(s1a) == true, "test equals method - true");
     *
     * displayResults( s1a.equals(s1b), "test equals method - true");
     * displayResults( s1a.equals(s1c), "test equals method - true");
     *
     * // the following 2 tests are equivalent - can you see this?
     * // check with your TA if you are unsure
     * displayResults( !s1a.equals(s2a), "test equals method - false");
     * displayResults( s1a.equals(s2a) == false, "test equals method - false");
     *
     * displayResults( !s1a.equals(s2b), "test equals method - false");
     */
  }
}
