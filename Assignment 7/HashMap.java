/*
 * Joh Yoshida
 * V00798535
 */
import java.util.*;

public class HashMap <K extends Comparable <K>, V> implements Map <K, V> {
  private long getLoops;
  private long putLoops;
  private int tableSize;

  private List < List < Entry < K, V >>> table;
  private int count;

  public HashMap() {
    tableSize = 1000003;             // prime number
    table     = new ArrayList < List < Entry < K, V >>> (tableSize);

    // initializes table as a list of empty lists
    for (int i = 0; i < tableSize; i++) {
      table.add(new LinkedList <Entry <K, V> >());
    }

    count = 0;

    resetGetLoops();
    resetPutLoops();
  }

  public long getGetLoopCount() {
    return getLoops;
  }

  public long getPutLoopCount() {
    return putLoops;
  }

  public void resetGetLoops() {
    getLoops = 0;
  }

  public void resetPutLoops() {
    putLoops = 0;
  }

  public boolean containsKey(K key) {
    // gets the index in the table this key should be in
    int index = Math.abs(key.hashCode()) % tableSize;

    List <Entry <K, V> > chain = table.get(index);
    if (chain.isEmpty() == false) {
      Iterator <Entry <K, V> > iter = chain.iterator();
      while (iter.hasNext()) {
        Entry <K, V> element = iter.next();
        if (element.getKey().equals(key)) {
          return true;
        }
      }
    }
    return false;
  }

  public V get(K key) throws KeyNotFoundException {
    // gets the index in the table this key should be in
    int index = Math.abs(key.hashCode()) % tableSize;

    List <Entry <K, V> > chain = table.get(index);
    if (chain.isEmpty() == false) {
      Iterator <Entry <K, V> > iter = chain.iterator();
      while (iter.hasNext()) {
        Entry <K, V> element = iter.next();
        if (element.getKey().equals(key)) {
          return element.getValue();
        }
      }
    }
    throw new KeyNotFoundException();
  }

  public List <Entry <K, V> > entryList() {
    List <Entry <K, V> > l = new LinkedList <Entry <K, V> >();
    for (int i = 0; i < tableSize; i++) {
      List <Entry <K, V> > chain = table.get(i);
      if (chain.isEmpty() == false) {
        Iterator <Entry <K, V> > iter = chain.iterator();
        while (iter.hasNext()) {
          Entry <K, V> element = iter.next();
          l.add(element);
        }
      }
    }
    return l;
  }

  public void put(K key, V value) {
    // gets the index in the table this key should be in
    int index = Math.abs(key.hashCode()) % tableSize;

    Entry <K, V> entry         = new Entry <K, V>(key, value);
    List <Entry <K, V> > chain = table.get(index);
    if (chain.isEmpty()) {
      chain.add(entry);
      count++;
    }
    else {
      boolean put = false;
      Iterator <Entry <K, V> > iter = chain.iterator();
      while (iter.hasNext()) {
        Entry <K, V> element = iter.next();
        if (element.getKey().equals(key)) {
          element.setValue(value);
          put = true;
          break;
        }
      }
      if (put == false) {
        chain.add(entry);
      }
    }
  }

  public int size() {
    return count;
  }

  public void clear() {
    table.clear();
    count = 0;
  }
}
