/*
 * Joh Yoshida
 * V00798535
 */

/*
 * HeapPriorityQueue.java
 *
 * An implementation of a minimum PriorityQueue using a heap.
 * based on the implementation in "Data Structures and Algorithms
 * in Java", by Goodrich and Tamassia
 *
 * This implementation will throw a Runtime, HeapEmptyException
 *	if the heap is empty and removeLow is called.
 *
 * This implementation will throw a Runtime, HeapFullException
 *	if the heap is full and insert is called.
 *
 */

public class HeapPriorityQueue implements PriorityQueue {
  protected final static int DEFAULT_SIZE = 10000;

  protected Comparable[] storage;
  protected int currentSize;

  /*
   * Constructor that initializes the array to hold DEFAULT_SIZE elements
   */
  public HeapPriorityQueue() {
    storage     = new Comparable[DEFAULT_SIZE];
    currentSize = 0;
  }

  /*
   * Constructor that initializes the array to hold size elements
   */
  public HeapPriorityQueue(int size) {
    //TODO: Implement this
  }

  public void insert(Comparable element) {
    //TODO: Implement this
  }

  public Comparable removeMin() {
    //TODO: Implement this
    return null;             // so it compiles
  }

  public boolean isEmpty() {
    if (currentSize == 0) {
      return true;
    }
    return false;
  }

  public int size() {
    //TODO: Implement this
    return -1;             // so it compiles
  }

  public String toString() {
    String s   = "";
    String sep = "";

    for (int i = 0; i < currentSize; i++) {
      s  += sep + storage[i];
      sep = " ";
    }
    return s;
  }
}
