public class Node {
  private int data;
  protected Node next;

  public Node() {
    this.data = 0;
    this.next = null;
  }

  public Node(int value) {
    this.data = value;
    this.next = null;
  }

  /* Parameters: nothing
   * Purpose:  get the data value of this Node
   * Returns:  int - the value
   */
  public int getData() {
    return data;
  }

  /* Parameters: int data
   * Purpose:  set the data value of this Node to value
   * Returns:  nothing
   */
  public void setData(int data) {
    this.data = data;
  }

  /* Parameters: nothing
   * Purpose:  get the next of this Node
   * Returns:  (Node) the next
   */
  public Node getNext() {
    return next;
  }

  /* Parameters: Node next
   * Purpose:  set the next of this Node to next
   * Returns:  nothing
   */
  public void setNext(Node next) {
    this.next = next;
  }
}
