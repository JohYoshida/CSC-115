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
    // TODO
  }

  private void insertIterative(Integer value) {
  }

  private void insert(Integer value, TreeNode current) {
    if (value < current.getValue()) {
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
  }
}
