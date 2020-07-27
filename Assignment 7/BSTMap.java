import java.util.*;

public class BSTMap <K extends Comparable <K>, V> implements Map <K, V> {
  BinarySearchTree <K, V> bst;

  public BSTMap() {
    bst = new BinarySearchTree <K, V>();
  }

  public boolean containsKey(K key) {
    return false;
  }

  public V get(K key) throws KeyNotFoundException {
    return null;
  }

  public List <Entry <K, V> > entryList() {
    return null;
  }

  public void put(K key, V value) {
  }

  public int size() {
    return -1;
  }

  public void clear() {
  }

  public long getGetLoopCount() {
    return bst.getFindLoopCount();
  }

  public long getPutLoopCount() {
    return bst.getInsertLoopCount();
  }

  public void resetGetLoops() {
    bst.resetFindLoops();
  }

  public void resetPutLoops() {
    bst.resetInsertLoops();
  }
}
