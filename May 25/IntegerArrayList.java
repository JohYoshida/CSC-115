public class IntegerArrayList implements IntegerList {
  private static final int INITIAL_SIZE = 10;

  private int[] data;
  private int numElements;

  public IntegerArrayList() {
    data        = new int[INITIAL_SIZE];
    numElements = 0;
  }

  public void addFront(int val) {
  }

  public void addBack(int val) {
    data[numElements] = val;
    numElements++;
  }

  public void insertAt(int position, int val) {
  }

  public int size() {
    return numElements;
  }

  public int get(int position) {
    return 0;
  }

  /* Parameters: nothing
   * Purpose: create a string representation of list
   * Returns: (String) the string representation
   */
  public String toString() {
    String s = "List contents:";

    for (int i = 0; i < numElements; i++) {
      s += " " + data[i];
    }

    return s;
  }
}
