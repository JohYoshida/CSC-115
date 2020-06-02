/*
 * Joh Yoshida
 * V00798535
 */

/*
 * StudentLinkedList.java
 *
 * An implementation of the StudentList class
 *
 */
public class StudentLinkedList implements StudentList {
  private StudentNode head;
  private int count;

  public StudentLinkedList() {
    head  = null;
    count = 0;
  }

  /*
   *
   * Purpose: Adds a node the to back of the list
   *
   * Parameters: Student - the data for the new node
   *
   * Returns: void
   *
   */
  public void add(Student student) {
    StudentNode node = new StudentNode(student);

    if (head == null) {
      head = node;
      count++;
    }
    else {
      StudentNode cur = head;
      while (cur.next != null) {
        cur = cur.next;
      }
      cur.next = node;
      count++;
    }
  }

  /*
   *
   * Purpose: Returns the size of the linked list
   *
   * Parameters: none
   *
   * Returns: int - the size
   *
   */
  public int size() {
    return count;
  }

  /*
   *
   * Purpose: Creates a string representation of the linked list
   *
   * Parameters: none
   *
   * Returns: String - the string representation
   *
   */
  public String toString() {
    String s = "";

    if (head != null) {
      StudentNode cur = head;
      while (cur != null) {
        s  += cur.getData().toString() + "\n";
        cur = cur.next;
      }
    }
    return s;
  }

  /*
   *
   * Purpose: Removes the front node of the list
   *
   * Parameters: none
   *
   * Returns: void
   *
   */
  public void removeFront() {
    if (head != null) {
      if (head.next != null) {
        head = head.next;
      }
      else {
        head = null;
      }
      count--;
    }
  }

  /*
   *
   * Purpose:
   *
   * Parameters:
   *
   * Returns:
   *
   */
  public boolean contains(Student student) {
    return false;
  }
}
