/*
 * Joh Yoshida
 * V00798535
 */
import java.lang.Math;

/*
 * RefBasedBinarySearchTree.java
 *
 * A ref-based BinaryTree meant to store values of type Integer
 */
public class RefBasedBinarySearchTree extends RefBasedBinaryTree {
  public RefBasedBinarySearchTree() {
    super();
  }

  public void insert(Integer value) {
    // System.out.println("value " + value);
    if (this.root == null) {
      this.root = new TreeNode(value);
    }
    else {
      insertIterative(value);
      // insert(value, this.root);
    }
  }

  private void insertIterative(Integer value) {
    TreeNode current = this.root;

    while (current != null) {
      if (value <= current.getValue()) {
        if (current.getLeft() == null) {
          // System.out.println("setting left to " + value);
          current.setLeft(new TreeNode(value));
          current = null;
        }
        else {
          // System.out.println("moving left");
          current = current.getLeft();
        }
      }
      else if (value > current.getValue()) {
        if (current.getRight() == null) {
          // System.out.println("setting right to " + value);
          current.setRight(new TreeNode(value));
          current = null;
        }
        else {
          // System.out.println("moving right");
          current = current.getRight();
        }
      }
    }
  }

  private void insert(Integer value, TreeNode current) {
    if (value <= current.getValue()) {
      // System.out.println("less");
      if (current.getLeft() != null) {
        // System.out.println("moving left");
        insert(value, current.getLeft());
      }
      else {
        // System.out.println("setting value " + value + " left of " + current.getValue());
        current.setLeft(new TreeNode(value));
      }
    }
    else if (value > current.getValue()) {
      // System.out.println("greater");
      if (current.getRight() != null) {
        // System.out.println("moving right");
        insert(value, current.getRight());
      }
      else {
        // System.out.println("setting value " + value + " right of " + current.getValue());
        current.setRight(new TreeNode(value));
      }
    }
  }

  public int getMax() throws TreeEmptyException {
    if (this.root == null) {
      throw new TreeEmptyException();
    }
    else {
      return getMax(root.getValue(), root);
    }
  }

  private int getMax(int current, TreeNode n) {
    if (n == null) {
      return current;
    }
    else {
      return getMax(n.getValue(), n.getRight());
    }
  }

  public static void main(String[] args) {
    // use these trees to test the methods you will implement
    RefBasedBinarySearchTree emptyTree = new RefBasedBinarySearchTree();
    RefBasedBinarySearchTree myTree    = new RefBasedBinarySearchTree();

    myTree.insert(2);
    myTree.insert(1);
    myTree.insert(5);
    myTree.insert(7);
    myTree.insert(0);
    myTree.insert(4);
    myTree.insert(6);

    System.out.println("in");
    myTree.inOrder();
    System.out.println("pre");
    myTree.preOrder();
    System.out.println("post");
    myTree.postOrder();

    System.out.println("toString\n" + myTree);

    System.out.println("sum " + myTree.sum());
    System.out.println("find " + myTree.find(6));
    System.out.println("getMax empty");
    try {
      emptyTree.getMax();
    } catch (TreeEmptyException e) {
      System.out.println("Caught TreeEmptyException");
    }
    try {
      System.out.println("getMax not empty " + myTree.getMax());
    }
    catch (TreeEmptyException e) {
      System.out.println("Shouldn't reach this exception");
    }
    System.out.println("level order");
    myTree.levelOrder();
    myTree.insert(3);
    myTree.levelOrder();
  }
}
