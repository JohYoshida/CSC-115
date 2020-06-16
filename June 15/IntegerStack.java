public class IntegerStack {
  Node head;

  public IntegerStack() {
    head = null;
  }

  /*
   * Purpose: insert an item onto the top of the stack
   * Parameters: (int) - the item to insert
   * Returns: Nothing
   */
  public void push(int v) {
    Node n = new Node(v);

    if (isEmpty()) {
      head = n;
    }
    else {
      n.next = head;
      head   = n;
    }
  }

  /*
   * Purpose: removes and returns the top item from the stack
   * Parameters: None
   * Returns: (int) - the data value of the element removed
   */
  public int pop() {
    if (isEmpty()) {
      return -1;
    }
    int val = head.getData();
    head = head.next;
    return val;
  }

  /*
   * Purpose: determines whether the stack is empty
   * Parameters: None
   * Returns: (boolean) - true if the stack is empty, false otherwise
   */
  public boolean isEmpty() {
    if (head == null) {
      return true;
    }
    return false;
  }

  /*
   * Purpose: Accesses the top item on the stack
   * Parameters: None
   * Returns: (int) - the data value of the top element
   */
  public int top() {
    if (isEmpty()) {
      return -1;
    }
    return head.getData();
  }
}
