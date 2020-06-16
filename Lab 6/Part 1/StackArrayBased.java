public class StackArrayBased implements Stack {
  private static final int INIT_SZ = 4;
  private char[] data;
  private int top;
  // NOTICE:  there is no count
  //  think about why you do not need a count given
  //  you are keeping track of the index of top


  public StackArrayBased() {
    data = new char[INIT_SZ];
    top  = -1;
  }

  public int size() {
    return 0;
  }

  public boolean isEmpty() {
    return true;
  }

  public void push(char val) {
  }

  public char pop() {
    return 'a';
  }

  public char peek() {
    return 'a';
  }

  public void makeEmpty() {
  }

  public String toString() {
    String result = "{";

    result += "}";
    return result;
  }
}
