public class StackTester {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  public static void main(String[] args) {
    IntegerStack myStack = new IntegerStack();
    int result;

    displayResults(myStack.isEmpty() == true, "isEmpty test1");

    myStack.push(4);
    result = myStack.top();
    displayResults(myStack.isEmpty() == false, "isEmpty test2");
    displayResults(result == 4, "top test1");

    myStack.push(7);
    myStack.push(2);
    result = myStack.top();
    displayResults(result == 2, "top test2");

    result = myStack.pop();
    displayResults(result == 2, "pop test1");

    result = myStack.top();
    displayResults(result == 7, "top after pop");
    displayResults(myStack.isEmpty() == false, "isEmpty after pop");

    myStack.push(9);
    result = myStack.top();
    displayResults(result == 9, "top test3");

    result = myStack.pop();
    displayResults(result == 9, "pop test2");
    result = myStack.top();
    displayResults(result == 7, "top test4");

    result = myStack.pop();
    displayResults(result == 7, "pop test3");
    result = myStack.top();
    displayResults(result == 4, "top test5");
    displayResults(myStack.isEmpty() == false, "isEmpty test3");

    result = myStack.pop();
    displayResults(result == 4, "pop test4");
    result = myStack.top();
    displayResults(result == -1, "top test6");
    displayResults(myStack.isEmpty() == true, "isEmpty test3");

    result = myStack.pop();
    displayResults(result == -1, "pop test5");


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
}
