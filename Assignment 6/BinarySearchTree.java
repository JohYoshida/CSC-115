/*
 * Joh Yoshida
 * V00798535
 */
import java.util.*;

/*
 * An implementation of a binary search tree. This tree stores
 * both keys and values associated with those keys.
 *
 * More information about binary search trees can be found here:
 * http://en.wikipedia.org/wiki/Binary_search_tree
 */
class BinarySearchTree <K extends Comparable <K>, V> {
  public static final int BST_PREORDER  = 1;
  public static final int BST_POSTORDER = 2;
  public static final int BST_INORDER   = 3;

  // These are package friendly for the TreeView class
  BSTNode <K, V> root;
  int count;

  public BinarySearchTree() {
    root  = null;
    count = 0;
  }

  /* Purpose: Insert a new key-value element into the tree.
   *          If the key already exists in the tree, update
   *          the value stored at that node with the new value.
   * Parameters: K key - the key for which the BST is ordered
   *	       V value - the value to associate with the key
   * Returns: nothing
   * Pre-Conditions: the tree is a valid binary search tree
   */
  public void insert(K key, V value) {
    BSTNode node = new BSTNode(key, value);


    if (root == null) {
      root = node;
      count++;
    }
    else {
      insert(root, node);
    }
  }

  private void insert(BSTNode current, BSTNode node) {
    if (node.key.compareTo(current.key) < 0) {
      if (current.left == null) {
        current.left = node;
        count++;
        return;
      }
      insert(current.left, node);
    }
    else if (node.key.compareTo(current.key) > 0) {
      if (current.right == null) {
        current.right = node;
        count++;
        return;
      }
      insert(current.right, node);
    }
    else {
      current.value = node.value;
    }
  }

  /*
   * Purpose: Get the value of the given key.
   * Parameters: K key - the key to search for
   * Returns: V - the value associated with the key
   * Pre-conditions: the tree is a valid binary search tree
   * Throws: KeyNotFoundException if key isn't in the tree
   */
  public V find(K key) throws KeyNotFoundException {
    if (root == null) {
      throw new KeyNotFoundException();
    }
    BSTNode node = new BSTNode(key, null);
    return find(node, root);
  }

  private V find(BSTNode node, BSTNode current) throws KeyNotFoundException {
    if (current.left == null&& current.right == null) {
      if (node.key.compareTo(current.key) == 0) {
        return (V)current.value;
      }
      throw new KeyNotFoundException();
    }
    else if (node.key.compareTo(current.key) < 0) {
      return find(node, current.left);
    }
    else if (node.key.compareTo(current.key) > 0) {
      return find(node, current.right);
    }
    return (V)current.value;
  }

  /*
   * Purpose: Get the number of nodes in the tree.
   * Parameters: none
   * Returns: int - the number of nodes in the tree.
   */
  public int size() {
    return count;
  }

  /*
   * Purpose: Remove all nodes from the tree.
   * Parameters: none
   * Returns: nothing
   */
  public void clear() {
    root  = null;
    count = 0;
  }

  /*
   * Purpose: Get the height of the tree.
   * Parameters: none
   * Returns: int - the height of the tree
   * Example: We define height as being the number of
   * arrows that need to be followed on the path from
   * the root to the deepest leaf node. This means that
   * a tree with one node (just the root) has height 0,
   * and an empty tree (root is null) has height -1.
   *
   * See the assignment PDF and the test program for examples.
   */
  public int height() {
    return heightRecursive(root);
  }

  /*
   * Purpose: Return a list of all the key-value Entry elements
   *          stored in the tree using a level-order traversal.
   * Parameters: None
   * Returns: List<Entry<K,V>> - a list of key-value entries
   *
   * Example: A level order traversal of a tree cannot be done
   *          without the help of a secondary data structure.
   *
   *          It is commonly implemented using a queue of nodes
   *          as the secondary data structure. You will still be
   *          adding the "visited" elements to l as you do in the
   *          other traversal methods but you will create an
   *          additional q to hold nodes still to visit. This is
   *          similar to what we did in the worksheet on tree traversals.
   *
   * From wikipedia (they call it breadth-first), the algorithm
   * for level order is:
   *
   *  levelorder()
   *      q = empty queue
   *      q.enqueue(root)
   *      while not q.empty do
   *          node := q.dequeue()
   *          visit(node)
   *          if node.left != null then
   *                q.enqueue(node.left)
   *          if node.right != null then
   *                q.enqueue(node.right)
   *
   * Note that you can use the Java LinkedList as a Queue
   * and then use only the removeFirst() and addLast() methods on q
   */
  public List <Entry <K, V> > entryList() {
    // list to add all the nodes to
    List <Entry <K, V> > l = new LinkedList <Entry <K, V> >();

    // queue of nodes that need to be added
    LinkedList <BSTNode <K, V> > q = new LinkedList <BSTNode <K, V> >();

    // TODO: implement this
    // TODO: are we allowed to use q.size() ?
    q.addLast(root);
    while (q.size() != 0) {
      BSTNode node = q.removeFirst();
      l.add(new Entry(node.key, node.value));
      if (node.left != null) {
        q.addLast(node.left);
      }
      if (node.right != null) {
        q.addLast(node.right);
      }
    }
    return l;
  }

  /*
   * Purpose: Get a list of all the key-value Entrys stored in the tree
   * Parameters: int whichTraversal - the type of traversal to perform:
   * Returns: List<Entry<K,V>> - a list of key-value entries
   * Example: The list will be constructed by performing a traversal
   * specified by the parameter whichTraversal.
   *
   * If whichTraversal is:
   *	 BST_PREORDER	perform a pre-order traversal
   *	 BST_POSTORDER	perform a post-order traversal
   *	 BST_INORDER	perform an in-order traversal
   */
  public List <Entry <K, V> > entryList(int whichTraversal) {
    List <Entry <K, V> > l = new LinkedList <Entry <K, V> >();

    if (whichTraversal == 1) {
      preOrderRecursive(root, l);
    }
    if (whichTraversal == 2) {
      postOrderRecursive(root, l);
    }
    if (whichTraversal == 3) {
      inOrderRecursive(root, l);
    }
    return l;
  }

  /*
   * We recommend incorporating the following private helper
   * methods in order to implement the methods above:
   * private void inOrderRecursive (BSTNode<K,V> n, List <Entry<K,V>> l);
   * private void preOrderRecursive (BSTNode<K,V> n, List <Entry<K,V>> l);
   * private void postOrderRecursive (BSTNode<K,V> n, List <Entry<K,V>> l);
   * private int heightRecursive (BSTNode<K,V> t)
   */

  private void inOrderRecursive(BSTNode <K, V> n, List <Entry <K, V> > l) {
    if (n == null) {
      return;
    }
    if (n.left != null) {
      inOrderRecursive(n.left, l);
    }
    Entry e = new Entry <K, V>(n.key, n.value);
    l.add(e);
    if (n.right != null) {
      inOrderRecursive(n.right, l);
    }
  }

  private void preOrderRecursive(BSTNode <K, V> n, List <Entry <K, V> > l) {
    if (n == null) {
      return;
    }
    Entry e = new Entry <K, V>(n.key, n.value);
    System.out.println(n);
    l.add(e);
    if (n.left != null) {
      preOrderRecursive(n.left, l);
    }
    if (n.right != null) {
      preOrderRecursive(n.right, l);
    }
  }

  private void postOrderRecursive(BSTNode <K, V> n, List <Entry <K, V> > l) {
    if (n == null) {
      return;
    }
    if (n.left != null) {
      postOrderRecursive(n.left, l);
    }
    if (n.right != null) {
      postOrderRecursive(n.right, l);
    }
    Entry e = new Entry <K, V>(n.key, n.value);
    l.add(e);
  }

  private int heightRecursive(BSTNode <K, V> t) {
    if (t == null) {
      return -1;
    }
    else {
      return 1 + Math.max(height(t.left), height(t.right));
    }
  }
}
