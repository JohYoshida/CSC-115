/*
 * Lab2Tester.java
 *
 * A tester for the methods in Lab2.java
 *
 */
import java.util.Arrays;

public class Lab2Tester {
  private static int testPassCount = 0;
  private static int testCount     = 0;


  // for approximate comparison of floating point numbers
  private static final double THRESHOLD = 0.01;

  public static void main(String[] args) {
    testGetHigherGradeStudent();
    testIsGradeAbove();
    testGetClasslist();
    testCountAbove();
    testGetClassAverage();
    testRegisterStudent();

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

  public static void testGetHigherGradeStudent() {
    Student s0  = new Student("abc", 50);
    Student s1a = new Student("def", 56);
    Student s1b = new Student("xyz", 56);
    Student s2  = new Student("xyz", 99);

    Student result;

    result = Lab2.getHigherGradeStudent(s0, s1a);
    //System.out.println("should be  " + s1a + " is " + result);
    displayResults(result.equals(s1a), "testGetHigherGradeStudent");

    result = Lab2.getHigherGradeStudent(s1a, s0);
    //System.out.println("should be  " + s1a + " is " + result);
    displayResults(result.equals(s1a), "testGetHigherGradeStudent");

    result = Lab2.getHigherGradeStudent(s1b, s1a);
    //System.out.println("should be  " + s1b + " is " + result);
    displayResults(result.equals(s1b) && result == s1b, "testGetHigherGradeStudent");

    result = Lab2.getHigherGradeStudent(s1b, s2);
    //System.out.println("should be  " + s2 + " is " + result);
    displayResults(result.equals(s2), "testGetHigherGradeStudent");
  }

  public static void testIsGradeAbove() {
    Student s1 = new Student("abc", 51);
    Student s2 = new Student("def", 49);
    Student s3 = new Student("ghi", 50);

    boolean result;

    result = Lab2.isGradeAbove(s1, 50);
    displayResults(result == true, "testIsGradeAbove");

    result = Lab2.isGradeAbove(s2, 50);
    displayResults(result == false, "testIsGradeAbove");

    result = Lab2.isGradeAbove(s3, 50);
    displayResults(result == false, "testIsGradeAbove");
  }

  public static void testGetClasslist() {
    // NOTE: the Arrays library has been imported for you.
    //  you can use the Arrays.equals method to compare
    //  2 arrays of String objects as String has a equals method
    // The API for Arrays.equals:
    //  equals(Object[] a, Object[] a2)
    //  Returns true if the two specified arrays of Objects are equal to one another.

    // TODO: once you have implemented getClasslist in Lab2.java
    //  uncomment the following test
    // We have gotten you started with some initial test data and one test,
    // but you should consider other cases (empty array, longer array)

    Student s0 = new Student("abc", 50);
    Student s1 = new Student("def", 50);
    Student s2 = new Student("ghi", 50);

    Student[] students0 = { };
    String[] expected0  = { };
    Student[] students1 = { s0 };
    String[] expected1  = { "abc" };
    Student[] students2 = { s0, s1, s2 };
    String[] expected2  = { "abc", "def", "ghi" };

    String[] result;

    result = Lab2.getClasslist(students0);
    displayResults(Arrays.equals(result, expected0), "testGetClasslist - 0 elements");
    result = Lab2.getClasslist(students1);
    displayResults(Arrays.equals(result, expected1), "testGetClasslist - 1 elements");
    result = Lab2.getClasslist(students2);
    displayResults(Arrays.equals(result, expected2), "testGetClasslist - 3 elements");
  }

  public static void testCountAbove() {
    // TODO: write tests for Lab2.countAbove
    Student s1 = new Student("abc", 51);
    Student s2 = new Student("def", 49);
    Student s3 = new Student("ghi", 50);

    Student[] students0 = {};
    Student[] students1 = { s1, s2, s3 };

    int result;

    result = Lab2.countAbove(students0, 0);
    displayResults(result == 0, "testCountAbove");
    result = Lab2.countAbove(students1, 51);
    displayResults(result == 0, "testCountAbove");
    result = Lab2.countAbove(students1, 50);
    displayResults(result == 1, "testCountAbove");
    result = Lab2.countAbove(students1, 49);
    displayResults(result == 2, "testCountAbove");
    result = Lab2.countAbove(students1, 48);
    displayResults(result == 3, "testCountAbove");
  }

  public static void testGetClassAverage() {
    // TODO: write tests for Lab2.getClassAverage
    Student s1 = new Student("a", 0);
    Student s2 = new Student("b", 50);
    Student s3 = new Student("c", 100);
    Student s4 = new Student("d", 69);
    Student s5 = new Student("e", 68);

    Student[] students1 = { s2, s2, s2 };
    Student[] students2 = { s1, s1, s1, s2, s2, s2 };
    Student[] students3 = { s1, s2, s3 };
    Student[] students4 = { s1, s2, s3, s4 };
    Student[] students5 = { s1, s2, s3, s5 };

    double result;

    result = Lab2.getClassAverage(students1);
    displayResults(result == 50.0, "testGetClassAverage");
    result = Lab2.getClassAverage(students2);
    displayResults(result == 50.0, "testGetClassAverage");
    result = Lab2.getClassAverage(students3);
    displayResults(result == 75.0, "testGetClassAverage");
    result = Lab2.getClassAverage(students4);
    displayResults(result == 73.0, "testGetClassAverage");
    System.out.println(result);
    displayResults(result == 72.66666666666667, "testGetClassAverage");
  }

  public static void testRegisterStudent() {
    // TODO: write tests for Lab2.registerStudent
    // HINT: the Student class also has a equals method so you
    //  can use Arrays.equals again to compare 2 Student arrays
  }
}
