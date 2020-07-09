public class TreeNode {
  private int data;
  protected TreeNode left;
  protected TreeNode right;

  public TreeNode(int val) {
    data  = val;
    left  = null;
    right = null;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    data       = val;
    this.left  = left;
    this.right = right;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(54);
    TreeNode a    = new TreeNode(14);

    root.left    = a;
    root.right   = new TreeNode(80);
    a.left       = new TreeNode(3);
    a.right      = new TreeNode(37);
    a.left.right = new TreeNode(12);

    System.out.println("root: " + root.data);
    System.out.println("root's left child: " + root.left.data);
    System.out.println("left's left child: " + root.left.left.data);
    System.out.println("left's right child: " + root.left.right.data);
    System.out.println("left's left's right child: " + root.left.left.right.data);
    System.out.println("root's right child: " + root.right.data);
    System.out.println();

    TreeNode cur = root;
    while (cur.left != null) {
      cur = cur.left;
    }
    System.out.println("min value in tree: " + cur.data);
    cur = root;
    while (cur.right != null) {
      cur = cur.right;
    }
    System.out.println("max value in tree: " + cur.data);
  }
}
