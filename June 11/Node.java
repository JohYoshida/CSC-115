public class Node <T> {
  private T data;
  protected Node next;

  public Node() {
    this.data = null;
    this.next = null;
  }

  public Node(T data) {
    this.data = data;
    this.next = null;
  }

  /* Parameters: nothing
   * Purpose:  get the data value of this Node
   * Returns:  T - the value
   */
  public T getData() {
    return data;
  }

  /* Parameters: T data
   * Purpose:  set the data value of this Node to value
   * Returns:  nothing
   */
  public void setData(T data) {
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
