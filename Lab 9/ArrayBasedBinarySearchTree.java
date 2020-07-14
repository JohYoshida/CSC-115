public class ArrayBasedBinarySearchTree extends ArrayBasedBinaryTree {
  public ArrayBasedBinarySearchTree() {
    super();
  }

  public void insert(Integer value) {
    // System.out.println("insert " + value);
    if (data[0] == null) {
      data[0] = value;
    }
    else {
      // insert(value, 0);
      insertIterative(value);
    }
  }

  private void insertIterative(Integer value) {
    int current = 0;

    while (data[current] != null) {
      if (value < data[current]) {
        // System.out.println("moving left");
        current = getLeft(current);
      }
      else if (value > data[current]) {
        // System.out.println("moving right");
        current = getRight(current);
      }
    }
    // System.out.println("setting value " + value + " at " + current);
    data[current] = value;
  }

  private void insert(Integer value, int current) {
    if (value < data[current]) {
      // System.out.println("less");
      int left = getLeft(current);
      if (data[left] != null) {
        // System.out.println("not null, moving left");
        insert(value, left);
      }
      else {
        // System.out.println("null, setting value " + value + " at " + left);
        data[left] = value;
      }
    }
    else if (value > data[current]) {
      // System.out.println("greater");
      int right = getRight(current);
      if (data[right] != null) {
        // System.out.println("not null, moving right");
        insert(value, right);
      }
      else {
        // System.out.println("null, setting value " + value + " at " + right);
        data[right] = value;
      }
    }
  }

  public static void main(String[] args) {
    ArrayBasedBinarySearchTree emptyTree = new ArrayBasedBinarySearchTree();

    ArrayBasedBinarySearchTree myTree = new ArrayBasedBinarySearchTree();

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
