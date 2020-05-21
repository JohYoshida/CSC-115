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
    System.out.print("\n");
    testErrorsAtOffset();
    System.out.print("\n");
    testBestAlignmentOffset();
    System.out.print("\n");
    testGetUserInput(args);
    System.out.print("\n");

    System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
  }

  public static void testObjectBasics() {
    int result = 0;
    String s   = "";

    A2Aligner a1 = new A2Aligner("TGACTTCCCGA");

    s = a1.getSequence();
    displayResults(s.equals("TGACTTCCCGA"), "testObjectBasics: getSequence");
    s = a1.getLastTested();
    displayResults(s.equals(""), "testObjectBasics: getLastTested");
    result = a1.getOffset();
    displayResults(result == -1, "testObjectBasics: getOffset");
    result = a1.getNumErrors();
    displayResults(result == -1, "testObjectBasics: getNumErrors");
  }

  public static void testErrorsAtOffset() {
    int result   = 0;
    A2Aligner a1 = new A2Aligner("TGACTTCCCGA");

    result = a1.errorsAtOffset(0, "TGAC");
    displayResults(result == 0, "testErrorsAtOffset");
    result = a1.errorsAtOffset(0, "TTAC");
    displayResults(result == 1, "testErrorsAtOffset");
    result = a1.errorsAtOffset(0, "ACTGAC");
    displayResults(result == 6, "testErrorsAtOffset");
    result = a1.errorsAtOffset(7, "CCGA");
    displayResults(result == 0, "testErrorsAtOffset");
    result = a1.errorsAtOffset(10, "ATCG");
    displayResults(result == 3, "testErrorsAtOffset: index at last sequence char");
    result = a1.errorsAtOffset(11, "ATCG");
    displayResults(result == 4, "testErrorsAtOffset: index past last sequence char");
    result = a1.errorsAtOffset(-1, "xTGA");
    displayResults(result == 1, "testErrorsAtOffset: index before first sequence char");
    result = a1.errorsAtOffset(-4, "CCGA");
    displayResults(result == 4, "testErrorsAtOffset: index before first sequence char");
    result = a1.errorsAtOffset(0, "TGACTTCCCGAx");
    displayResults(result == 1, "testErrorsAtOffset: longer subsequence");
    result = a1.errorsAtOffset(1, "GACTTCCCGAxx");
    displayResults(result == 2, "testErrorsAtOffset: longer subsequence, positive offset");
    result = a1.errorsAtOffset(-1, "xTGACTTCCCGA");
    displayResults(result == 1, "testErrorsAtOffset: longer subsequence, negative offset");
    result = a1.errorsAtOffset(0, "xTGACTTCCCGA");
    displayResults(result == 9, "testErrorsAtOffset: longer subsequence, one-offset error");
  }

  public static void testBestAlignmentOffset() {
    A2Aligner a1 = new A2Aligner("TGACTTCCCGA");

    a1.bestAlignmentOffset("TGAC");
    displayResults(a1.getOffset() == 0, "testBestAlignmentOffset");
    displayResults(a1.getNumErrors() == 0, "testBestAlignmentOffset");
    displayResults(a1.getLastTested().equals("TGAC"), "testBestAlignmentOffset");

    a1.bestAlignmentOffset("TCGA");
    displayResults(a1.getOffset() == 7, "testBestAlignmentOffset");
    displayResults(a1.getNumErrors() == 1, "testBestAlignmentOffset");
    displayResults(a1.getLastTested().equals("TCGA"), "testBestAlignmentOffset");

    A2Aligner a2 = new A2Aligner("ACGGTACGGAGTCTTGAAGT");

    a2.bestAlignmentOffset("GTTA");
    displayResults(a2.getOffset() == 2, "testBestAlignmentOffset");
    displayResults(a2.getNumErrors() == 1, "testBestAlignmentOffset");
    displayResults(a2.getLastTested().equals("GTTA"), "testBestAlignmentOffset");

    a2.bestAlignmentOffset("CAGT");
    displayResults(a2.getOffset() == 1, "testBestAlignmentOffset");
    displayResults(a2.getNumErrors() == 1, "testBestAlignmentOffset");
    displayResults(a2.getLastTested().equals("CAGT"), "testBestAlignmentOffset");

    A2Aligner a3 = new A2Aligner("CAGATACCATAGGGCATGC");

    a3.bestAlignmentOffset("ATAxC");
    displayResults(a3.getOffset() == 3, "testBestAlignmentOffset");
    displayResults(a3.getNumErrors() == 1, "testBestAlignmentOffset");
    displayResults(a3.getLastTested().equals("ATAxC"), "testBestAlignmentOffset");
  }

  public static void testGetUserInput(String[] args) {
    // Visually inspect the output:
    System.out.println("\nResults from command-line input:");
    A2Aligner a1 = getUserInput(args);
    System.out.println(a1);
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
    A2Aligner a;

    if (args.length != 2) {
      a = new A2Aligner("invalid");
    }
    else {
      a = new A2Aligner(args[0]);
      a.bestAlignmentOffset(args[1]);
    }

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
