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
    if (length <= 1) {
      head   = null;
      tail   = null;
      length = 0;
    }
    else {
      head      = head.next;
      head.prev = null;
      length--;
    }
  }

  public void removeBack() {
    if (length <= 1) {
      head   = null;
      tail   = null;
      length = 0;
    }
    else {
      tail      = tail.prev;
      tail.next = null;
      length--;
    }
  }

  public void rotate(int n) {
    A3Node temp = tail;

    for (int i = 0; i < n; i++) {
      addFront(tail.getData());
      removeBack();
    }
  }

  public void interleave(A3LinkedList other) {
    A3Node temp1 = head;
    A3Node temp2 = other.head;

    while (temp1.next != null) {
      A3Node first  = new A3Node(temp1.next.getData());
      A3Node second = new A3Node(temp2.next.getData());

      temp1.next.next.prev = second;
      second.next          = temp1.next.next;
      temp1.next           = second;
      second.prev          = temp1;

      temp2.next.next.prev = first;
      first.next           = temp2.next.next;
      temp2.next           = first;
      first.prev           = temp2;

      temp1 = temp1.next.next;
      temp2 = temp2.next.next;
    }
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
