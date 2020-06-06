// Name: Joh Yoshida
// Student number: v00798535

public class A3LinkedList implements A3List {
  private A3Node head;
  private A3Node tail;
  private int length;

  public A3LinkedList() {
    head   = null;
    tail   = null;
    length = 0;
  }

  public void addFront(String s) {
  }

  public void addBack(String s) {
  }

  public int size() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void removeFront() {
  }

  public void removeBack() {
  }

  public void rotate(int n) {
  }

  public void interleave(A3LinkedList other) {
  }

  /* Purpose: return a string representation of the list
   *          when traversed from front to back
   * Parameters: none
   * Returns: nothing
   */
  public String frontToBack() {
    String result = "{";
    A3Node cur    = head;

    while (cur != null) {
      result += cur.getData();
      cur     = cur.next;
    }
    result += "}";
    return result;
  }

  /* Purpose: return a string representation of the list
   *          when traversed from back to front
   * Parameters: none
   * Returns: nothing
   */
  public String backToFront() {
    String result = "{";
    A3Node cur    = tail;

    while (cur != null) {
      result += cur.getData();
      cur     = cur.prev;
    }
    result += "}";
    return result;
  }
}
