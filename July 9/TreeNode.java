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
}
