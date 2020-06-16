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
    return top + 1;
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    }
    return false;
  }

  public void push(char val) {
    top++;
    if (top == data.length) {
      char[] newData = new char[top + 1];
      for (int i = 0; i < data.length; i++) {
        newData[i] = data[i];
      }
      data = newData;
    }
    data[top] = val;
  }

  public char pop() {
    char c = data[top];

    top--;
    return c;
  }

  public char peek() {
    return data[top];
  }

  public void popAll() {
    data = new char[INIT_SZ];
    top  = -1;
  }

  public void makeEmpty() {
    data = new char[INIT_SZ];
    top  = -1;
  }

  public String toString() {
    String result = "{";

    result += "}";
    return result;
  }
}
