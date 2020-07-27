import java.util.*;

//
// An implementation of a binary search tree.
//
// This tree stores both keys and values associated with those keys.
//
// More information about binary search trees can be found here:
//
// http://en.wikipedia.org/wiki/Binary_search_tree
//
// Note: Wikipedia is using a different definition of
//       depth and height than we are using.  Be sure
//       to read the comments in this file for the
//	   height function.
//
public class BinarySearchTree <K extends Comparable <K>, V> {
  public static final int BST_PREORDER  = 1;
  public static final int BST_POSTORDER = 2;
  public static final int BST_INORDER   = 3;

  // These are package friendly for the TreeView class
  BSTNode <K, V> root;
  int count;

  long findLoops;
  long insertLoops;

  public BinarySearchTree() {
    root  = null;
    count = 0;
    resetFindLoops();
    resetInsertLoops();
  }

  public long getFindLoopCount() {
    return findLoops;
  }

  public long getInsertLoopCount() {
    return insertLoops;
  }

  public void resetFindLoops() {
    findLoops = 0;
  }

  public void resetInsertLoops() {
    insertLoops = 0;
  }

  //
  // Purpose:
  //
  // Insert a new Key:Value Entry into the tree.  If the Key
  // already exists in the tree, update the value stored at
  // that node with the new value.
  //
  // Pre-Conditions:
  //  the tree is a valid binary search tree
  //
  public void insert(K k, V v) {
  }

  //
  // Purpose:
  //
  // Return the value stored at key.  Throw a KeyNotFoundException
  // if the key isn't in the tree.
  //
  // Pre-conditions:
  //	the tree is a valid binary search tree
  //
  // Returns:
  //	the value stored at key
  //
  // Throws:
  //	KeyNotFoundException if key isn't in the tree
  //
  public V find(K key) throws KeyNotFoundException {
    throw new KeyNotFoundException();
  }

  //
  // Purpose:
  //
  // Return the number of nodes in the tree.
  //
  // Returns:
  //	the number of nodes in the tree.
  public int size() {
    return -1;
  }

  //
  // Purpose:
  //	Remove all nodes from the tree.
  //
  public void clear() {
  }

  //
  // Purpose:
  //
  // Return the height of the tree.  We define height
  // as being the number of nodes on the path from the root
  // to the deepest node.
  //
  // This means that a tree with one node has height 1.
  //
  // Examples:
  //	See the assignment PDF and the test program for
  //	examples of height.
  //
  public int height() {
    return -1;
  }

  //
  // Purpose:
  //
  // Return a list of all the key/value Entrys stored in the tree
  // The list will be constructed by performing a level-order
  // traversal of the tree.
  public List <Entry <K, V> > entryList() {
    List <Entry <K, V> > l = new LinkedList <Entry <K, V> >();
    return l;
  }

  //
  // Purpose:
  //
  // Return a list of all the key/value Entrys stored in the tree
  // The list will be constructed by performing a traversal
  // specified by the parameter which.
  //
  // If which is:
  //	BST_PREORDER	perform a pre-order traversal
  //	BST_POSTORDER	perform a post-order traversal
  //	BST_INORDER	perform an in-order traversal
  //
  public List <Entry <K, V> > entryList(int which) {
    List <Entry <K, V> > l = new LinkedList <Entry <K, V> >();

    return l;
  }

  // Your instructor had the following private methods in their solution:
  // private void doInOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
  // private void doPreOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
  // private void doPostOrder (BSTNode<K,V> n, List <Entry<K,V> > l);
  // private int doHeight (BSTNode<K,V> t)
}
