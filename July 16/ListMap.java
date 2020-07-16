import java.util.*;

public class ListMap <K extends Comparable <K>, V> implements Map <K, V> {
  Node <K, V> head;
  int numElements;

  public ListMap() {
  }

  public boolean containsKey(K key) {
    return false;
  }

  public V get(K key) throws KeyNotFoundException {
    throw new KeyNotFoundException();
  }

  public void put(K key, V value) {
  }

  public void remove(K key) {
  }

  public int size() {
    return -1;
  }

  public void clear() {
  }

  public List <Entry <K, V> > entryList() {
    return null;
  }
}
