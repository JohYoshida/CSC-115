public class LinkedList {
  private Node head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  /* Parameters: (int) i
   * Purpose:  add i to the front of the list
   * Returns:  nothing
   */
  public void addFront(int i) {
    Node n = new Node(i);

    n.next = head;
    head   = n;
    size++;
  }

  /* Parameters: (int) i
   * Purpose:  add i to the back of the list
   * Returns:  nothing
   */
  public void addBack(int i) {
    Node n = new Node(i);

    if (head == null) {
      head = n;
    }
    else {
      Node cur = head;
      while (cur.next != null) {
        cur = cur.next;
      }
      cur.next = n;
    }
    size++;
  }

  /* Parameters: nothing
   * Purpose:  get the size of the list
   * Returns:  (int) size
   */
  public int size() {
    return 0;
  }

  /* Parameters: (int) position
   * Purpose:  get the data value at specified position in the list
   * Returns:  (int) the data value
   * Precondition: 0 <= position < list.size()
   */
  public int get(int position) {
    Node cur = head;

    for (int i = 0; i < position; i++) {
      cur = cur.next;
    }
    return cur.getData();
  }

  /* Parameters: nothing
   * Purpose: create a string representation of list
   * Returns: (String) the string representation
   */
  public String toString() {
    String s = "list contents:";
    Node cur = head;

    while (cur != null) {
      s  += " " + cur.getData();
      cur = cur.next;
    }
    return s;
  }
}
