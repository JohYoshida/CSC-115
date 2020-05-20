// Name: Joh Yoshida
// Student number: v00798535

/*
 * A2Tester
 *
 * A class to test the methods required for Assignment 2
 *
 */
public class A2Tester {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  public static void main(String[] args) {
    testObjectBasics();
    testErrorsAtOffset();
    testBestAlignmentOffset();
    testGetUserInput(args);

    System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
  }

  public static void testObjectBasics() {
    int result = 0;
    String s   = "";

    // Uncomment the tests below once you have implemented
    // the constructor and the getter methods

    /*
     * A2Aligner a1 = new A2Aligner("TGACTTCCCGA");
     * s = a1.getSequence();
     * displayResults(s.equals("TGACTTCCCGA"), "testObjectBasics");
     * s = a1.getLastTested();
     * displayResults(s.equals(""), "testObjectBasics");
     * result = a1.getOffset();
     * displayResults(result==-1, "testObjectBasics");
     * result = a1.getNumErrors();
     * displayResults(result==-1, "testObjectBasics");
     */
  }

  public static void testErrorsAtOffset() {
    int result   = 0;
    A2Aligner a1 = new A2Aligner("TGACTTCCCGA");

    /*
     * result = a1.errorsAtOffset(0, "TGAC");
     * displayResults(result==0, "testErrorsAtOffset");
     * result = a1.errorsAtOffset(0, "TTAC");
     * displayResults(result==1, "testErrorsAtOffset");
     * result = a1.errorsAtOffset(0, "ACTGAC");
     * displayResults(result==6, "testErrorsAtOffset");
     *
     * result = a1.errorsAtOffset(7, "CCGA");
     * displayResults(result==0, "testErrorsAtOffset");
     * result = a1.errorsAtOffset(10, "ATCG");
     * displayResults(result==3, "testErrorsAtOffset");
     *
     * // Add tests here to ensure your
     * // implementation works with other
     * // sequences, subsequences, and offsets
     *
     */
  }

  public static void testBestAlignmentOffset() {
    A2Aligner a1 = new A2Aligner("TGACTTCCCGA");

    /*
     *
     * a1.bestAlignmentOffset("TGAC");
     * displayResults(a1.getOffset()==0, "testBestAlignmentOffset");
     * displayResults(a1.getNumErrors()==0, "testBestAlignmentOffset");
     * displayResults(a1.getLastTested().equals("TGAC"), "testBestAlignmentOffset");
     *
     * a1.bestAlignmentOffset("TCGA");
     * displayResults(a1.getOffset()==7, "testBestAlignmentOffset");
     * displayResults(a1.getNumErrors()==1, "testBestAlignmentOffset");
     * displayResults(a1.getLastTested().equals("TCGA"), "testBestAlignmentOffset");
     *
     *
     * // Add tests here to ensure your
     * // implementation works with other
     * // sequences, subsequences, and offsets
     *
     */
  }

  public static void testGetUserInput(String[] args) {
    /*
     *
     * // Visually inspect the output:
     * System.out.println("\nResults from command-line input:");
     * A2Aligner a1 = getUserInput(args);
     * System.out.println(a1);
     *
     */
  }

  /*
   * geUserInput
   *
   * Purpose: Creates an A2Aligner object based on information
   *          passed in as command-line arguments. Determines
   *          the best alignment for the given sequences.
   *
   * Parameters: String[] - the command-line arguments
   *
   * Returns: A2Aligner
   *
   * Example: Given java A2Tester CAGATACCATAGGGCATGC ATAGC
   *          the output of the state of the objet created is:
   *                Data sequence: CAGATACCATAGGGCATGC
   *					Compared with: ATAGC
   *          Best offset: 3
   *					Errors detected: 1
   *
   *      If the command-line arguments are invalid:
   *					Data sequence: invalid
   *					Compared with:
   *					Best offset: -1
   *					Errors detected: -1
   */
  public static A2Aligner getUserInput(String[] args) {
    // TODO: complete this
    A2Aligner a = new A2Aligner("invalid");

    return a;
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
