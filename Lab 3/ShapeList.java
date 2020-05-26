/*
 * Joh Yoshida
 * V00798535
 */


public class ShapeList {
  private static final int INIT_SZ = 2;

  Shape[] elements;
  int count;

  public ShapeList() {
    elements = new Shape[INIT_SZ];
    int count = 0;
  }

  /*
   * Purpose: returns the number of elements in list
   * Parameters: none
   * Returns: int - the number of elements
   */
  public int size() {
    int size = 0;

    for (int i = 0; i < elements.length; i++) {
      if (elements[i] != null) {
        size++;
      }
    }
    return size;
  }

  /*
   * Purpose: adds Shape s to back of this list
   * Parameters: Shape - s
   * Returns: nothing
   */
  public void add(Shape s) {
    if (this.size() == elements.length) {
      Shape[] newElements = new Shape[this.size() + 1];
      for (int i = 0; i < elements.length; i++) {
        newElements[i] = elements[i];
      }
      newElements[elements.length] = s;
      elements = newElements;
    }
    else {
      for (int i = 0; i < elements.length; i++) {
        if (elements[i] == null) {
          elements[i] = s;
          return;
        }
      }
    }
  }

  /*
   * Purpose: returns a String reprensentation of the elements
   *      in this list separated by newlines
   * Parameters: none
   * Returns: String - the representation
   */
  public String toString() {
    String string = "";

    for (int i = 0; i < elements.length; i++) {
      if (elements[i] != null) {
        string += elements[i].toString() + "\n";
      }
    }
    return string;
  }

  /*
   * Purpose: removes the first element in this list
   * Parameters: none
   * Returns: nothing
   */
  public void removeFront() {
    // TODO
  }
}
