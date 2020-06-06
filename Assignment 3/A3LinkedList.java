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
    A3Node node = new A3Node(s);

    if (head == null) {
      head   = node;
      tail   = node;
      length = 1;
    }
    else {
      head.prev = node;
      node.next = head;
      head      = node;
      length   += 1;
    }
  }

  public void addBack(String s) {
    A3Node node = new A3Node(s);

    if (tail == null) {
      head   = node;
      tail   = node;
      length = 1;
    }
    else {
      tail.next = node;
      node.prev = tail;
      tail      = node;
      length++;
    }
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
