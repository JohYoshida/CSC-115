/*
 * Lab6TesterPart2.java
 */
public class Lab6TesterPart2 {
  private static int testPassCount = 0;
  private static int testCount     = 0;

  public static void main(String[] args) {
    try {
      testQueue();
    } catch (Exception e) {
      System.out.println("Your code threw an Exception.");
      System.out.println("Perhaps a stack trace will help:");
      e.printStackTrace(System.out);
    }
    System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
  }

  public static void testQueue() {
    System.out.println("testBasicQueue: start");

    Queue <Integer> q;
    int subtestSize;
    boolean subtestResult;

    q = new QueueRefBased <Integer>();
    displayResults(q.isEmpty(), "isEmpty on empty queue");
    displayResults(q.size() == 0, "size on empty queue");

    q = new QueueRefBased <Integer>();
    q.enqueue(10);
    displayResults(!q.isEmpty(), "isEmpty - queue with one element");
    displayResults(q.size() == 1, "size - queue with one element");


    q           = new QueueRefBased <Integer>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    displayResults(!q.isEmpty(), "isEmpty - queue with multiple elements");
    displayResults(q.size() == subtestSize, "size - queue with multiple elements");

    subtestResult = true;
    for (int i = 0; i < subtestSize; i++) {
      int ii = q.dequeue();
      subtestResult = subtestResult && (ii == i);
    }
    displayResults(subtestResult, "dequeue - queue with multiple elements");
    displayResults(q.isEmpty(), "isEmpty - after dequeue");
    displayResults(q.size() == 0, "size - after dequeue");


    q = new QueueRefBased <Integer>();
    q.enqueue(10);
    q.peek();
    displayResults(!q.isEmpty(), "enqueue/dequeue + isEmpty - queue with one elements");
    displayResults(q.size() == 1, "enqueue/dequeue + size - queue with one elements");


    q           = new QueueRefBased <Integer>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    displayResults(!q.isEmpty(), "enqueue + isEmpty");
    displayResults(q.size() == subtestSize, "enqueue + size");
    subtestResult = true;
    for (int i = 0; i < subtestSize; i++) {
      int ii = q.peek();
      subtestResult = subtestResult && (ii == 0);
    }
    displayResults(subtestResult, "enqueue + peek");
    displayResults(!q.isEmpty(), "enqueue + peek + isEmpty");
    displayResults(q.size() == subtestSize, "enqueue + peek + size");


    q           = new QueueRefBased <Integer>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    q.makeEmpty();
    displayResults(q.isEmpty(), "makeEmpty + isEmpty - queue with multiple elements");

    q           = new QueueRefBased <Integer>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    q.makeEmpty();
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    displayResults(!q.isEmpty(), "makeEmpty + enqueue + isEmpty - queue with multiple elements");
    displayResults(q.size() == subtestSize, "makeEmpty + enqueue + size - queue with multiple elements");


    q           = new QueueRefBased <Integer>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    q.makeEmpty();
    for (int i = 0; i < subtestSize; i++) {
      q.enqueue(i);
    }
    displayResults(q.peek() == 0, "makeEmpty + enqueue + peek - queue with multiple elements");
    q.dequeue();
    displayResults(q.peek() == 1, "makeEmpty + enqueue + dequeue + peek - queue with multiple elements");


    //Testing generic queue with Character type
    QueueRefBased <Character> charQ;

    charQ       = new QueueRefBased <Character>();
    subtestSize = 10;
    for (int i = 0; i < subtestSize; i++) {
      charQ.enqueue((char)(i + '0'));
    }

    subtestResult = true;
    for (int i = 0; i < subtestSize; i++) {
      char ii = charQ.dequeue();
      subtestResult = subtestResult && (ii == (char)(i + '0'));
    }
    displayResults(subtestResult, "dequeue - queue with multiple elements");


    System.out.println("testing Queue: end");
    System.out.println();
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
