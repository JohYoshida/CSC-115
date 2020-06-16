/*
 * QueueNode.java
 *
 * A  node for a ref-based Queue, assuming that the queue
 * is meant to contains nodes storing values of type int.
 */
class QueueNode {
  int data;
  QueueNode next;


  public QueueNode(int data) {
    this.data = data;
    this.next = null;
  }

  public int getValue() {
    return this.data;
  }

  public QueueNode getNext() {
    return this.next;
  }

  public void setNext(QueueNode next) {
    this.next = next;
  }

  public String toString() {
    return data + "";
  }
}
