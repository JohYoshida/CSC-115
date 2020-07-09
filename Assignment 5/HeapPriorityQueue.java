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

  // TODO: remove this before hand in
  private void report() {
    if (currentSize > 0) {
      for (int i = 1; i < storage.length; i++) {
        if (storage[i] != null) {
          System.out.print(storage[i] + " ");
        }
      }
      System.out.println();
    }
  }

  // TODO: remove this before hand in
  private void report(Comparable latest) {
    if (currentSize > 0) {
      for (int i = 1; i < storage.length; i++) {
        if (storage[i] != null) {
          if (storage[i] == latest) {
            System.out.print("!" + storage[i] + "! ");
          }
          else {
            System.out.print(storage[i] + " ");
          }
        }
      }
      System.out.println();
    }
  }

  public void insert(Comparable element) throws HeapFullException {
    if (currentSize == DEFAULT_SIZE) {
      throw new HeapFullException();
    }
    else {
      currentSize++;
      storage[currentSize] = element;
      insertRecursive(currentSize);
      // TODO: remove this before hand in
      // report(element);
    }
  }

  public Comparable removeMin() {
    //TODO: Implement this
    return null;             // so it compiles
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
