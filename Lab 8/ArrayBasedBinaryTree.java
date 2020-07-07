/*
 * ArrayBasedBinaryTree.java
 *
 * An array-based BinaryTree meant to store values of type Integer
 */
public class ArrayBasedBinaryTree {
  private static final int CAPACITY = 100;
  protected Integer[] data;
  protected int root;
  protected int size;

  public ArrayBasedBinaryTree() {
    // TODO...
  }

  /*
   * Purpose: inserts the given value into data at next available
   *  position in a level-order traversal
   *  The tree remains complete after insertion.
   * Parameters: Integer value - value to insert
   * Returns: nothing
   */
  public void insert(Integer value) {
    // TODO...
  }

  /*
   * Purpose: calculates and returns the index of t's left child
   * Parameters: int t - index of current element in this ArrayBasedBinaryTree
   * Returns: int - index of left child
   */
  protected int getLeft(int t) {
    // TODO...
    return 0;
  }

  /*
   * Purpose: calculates and returns the index of t's right child
   * Parameters: int t - index of current element in this ArrayBasedBinaryTree
   * Returns: int - index of right child
   */
  protected int getRight(int t) {
    // TODO...
    return 0;
  }

  public void inOrder() {
    // TODO...
  }

  public void preOrder() {
    // TODO...
  }

  public void postOrder() {
    // TODO...
  }

  public String toString() {
    // TODO...
    return "";
  }

  public static void main(String[] args) {
    ArrayBasedBinaryTree myTree = new ArrayBasedBinaryTree();

    for (int i = 2; i < 8; i++) {
      myTree.insert(i);
    }
    System.out.println("in");
    myTree.inOrder();
    System.out.println("pre");
    myTree.preOrder();
    System.out.println("post");
    myTree.postOrder();

    System.out.println("toString\n" + myTree);
  }
}
