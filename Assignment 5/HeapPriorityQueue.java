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
    storage     = new Comparable[size];
    currentSize = 0;
  }

  public void insert(Comparable element) throws HeapFullException {
    if (currentSize == DEFAULT_SIZE) {
      throw new HeapFullException();
    }
    else {
      currentSize++;
      storage[currentSize] = element;
      insertRecursive(currentSize);
    }
  }

  private void insertRecursive(int current) {
    if (current <= 1) {
      return;
    }
    int parent = current / 2;
    if (parent > 0) {
      if (storage[current].compareTo(storage[parent]) < 0) {
        Comparable temp = storage[parent];
        storage[parent]  = storage[current];
        storage[current] = temp;
        insertRecursive(parent);
      }
    }
  }

  public Comparable removeMin() throws HeapEmptyException {
    if (isEmpty()) {
      throw new HeapEmptyException();
    }
    else {
      // replace root with rightmost leaf
      Comparable element = storage[1];
      storage[1]           = storage[currentSize];
      storage[currentSize] = null;
      currentSize--;
      // swap new root with smallest child
      removeMinRecursive(1);
      return element;             // so it compiles
    }
  }

  private void removeMinRecursive(int current) {
    int left              = current * 2;
    int right             = left + 1;
    Comparable leftChild  = storage[left];
    Comparable rightChild = storage[right];

    // return if current is out of bounds
    if (current >= DEFAULT_SIZE) {
      System.out.println("Node index out of bounds!");
      return;
    }
    // return if children are out of bounds
    if (current + 1 >= DEFAULT_SIZE || current + 2 >= DEFAULT_SIZE) {
      System.out.println("Child index out of bounds!");
      return;
    }
    // return if current is leaf node
    if (leftChild == null&& rightChild == null) {
      // System.out.println("Node is a leaf!");
      return;
    }

    if (rightChild == null || leftChild.compareTo(rightChild) < 0) {
      if (leftChild.compareTo(storage[current]) < 0) {
        // swap left
        storage[left]    = storage[current];
        storage[current] = leftChild;
        removeMinRecursive(left);
      }
    }
    else if (leftChild == null || rightChild.compareTo(leftChild) < 0) {
      if (leftChild.compareTo(storage[current]) < 0) {
        // swap right
        storage[right]   = storage[current];
        storage[current] = rightChild;
        removeMinRecursive(right);
      }
    }
  }

  public boolean isEmpty() {
    if (currentSize == 0) {
      return true;
    }
    return false;
  }

  public int size() {
    return currentSize;
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
