/*
 * Joh Yoshida
 * V00798535
 */

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
    if (passed) {
      System.out.println("Passed test: " + testName);
      testPassCount++;
    }
    else{
      System.out.println("Failed test: " + testName + " at line "
                         + Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
  }

  public static void testConstructorsAndGetters() {
    Student s = new Student();
    String sID;
    int grade;

    sID = s.getSID();
    displayResults(sID.equals(""), "test no args constructor and getSID");
    grade = s.getGrade();
    displayResults(grade == -1, "test no args constructor and getGrade");

    Student s2 = new Student("V00798535", 100);
    sID = s2.getSID();
    displayResults(sID.equals("V00798535"), "test two args constructor and getSID");
    grade = s2.getGrade();
    displayResults(grade == 100, "test two args constructor and getGrade");
  }

  public static void testSettersAndGetters() {
    Student s = new Student();
    String sID;
    int grade;

    s.setSID("V00798535");
    sID = s.getSID();
    displayResults(sID.equals("V00798535"), "test setSID and getSID");
    s.setGrade(100);
    grade = s.getGrade();
    displayResults(grade == 100, "test setGrade and getGrade");
  }

  public static void testToString() {
    Student s = new Student("V00798535", 100);
    String toString;

    toString = s.toString();
    displayResults(toString.equals("Student ID: V00798535\nGrade: 100"), "test toString");
  }

  public static void testEquals() {
    Student s1a = new Student("abc", 10);
    Student s1b = new Student("abc", 10);
    Student s1c = new Student("abc", 20);
    Student s2a = new Student("abcd", 10);
    Student s2b = new Student("abcd", 20);

    // the following 2 tests are equivalent - can you see this?
    // check with your TA if you are unsure
    displayResults(s1a.equals(s1a), "test equals method - true");
    displayResults(s1a.equals(s1a) == true, "test equals method - true");

    displayResults(s1a.equals(s1b), "test equals method - true");
    displayResults(s1a.equals(s1c), "test equals method - true");

    // the following 2 tests are equivalent - can you see this?
    // check with your TA if you are unsure
    displayResults(!s1a.equals(s2a), "test equals method - false");
    displayResults(s1a.equals(s2a) == false, "test equals method - false");

    displayResults(!s1a.equals(s2b), "test equals method - false");
  }
}
