import java.util.*;

public class ListMap<K extends Comparable<K>, V > implements Map<K, V> {

	Node<K, V> head;
	int numElements;
	
	public ListMap() {
		head = null;
		numElements = 0;
	}
	
	public boolean containsKey(K key) {
		Node<K,V> cur = head;
		while (cur != null) {
			if (cur.key.equals(key)) {
				return true;
			}
			cur = cur.next;
		}
		return false;
	}

	public V get (K key) throws KeyNotFoundException {
		Node<K,V> cur = head;
		while (cur != null) {
			if (cur.key.equals(key)) {
				return cur.value;
			}
			cur = cur.next;
		}
		throw new KeyNotFoundException();
	}

	public void put (K key, V value) {
		if (head == null) {
			head = new Node<K, V>(key, value);
			numElements++;
			return;
		}
		
		Node<K,V> cur = head;
		Node<K,V> prev = null;
		while (cur != null) {
			if (cur.key.equals(key)) {
				cur.setValue(value);
				return;
			}
			prev = cur;
			cur = cur.next;
		}
		prev.next = new Node<K, V>(key, value);
		numElements++;
	}
	
	public void remove (K key) {
		Node<K,V> cur = head;
		Node<K,V> prev = null;
		while (cur != null) {
			if (cur.key.equals(key)) {
				prev.next = cur.next;
				numElements--;
				return;
			}
			prev = cur;
			cur = cur.next;
		}
	}

	public int size() {
		return numElements;
	}


	public void clear() {
		head = null;
		numElements = 0;
	}
	
	public String toString() {
		String s = "Map contents:\n";
		Node<K,V> cur = head;
		while (cur != null) {
			s += cur.toString() + "\n";
			cur = cur.next;
		}
		return s;
	}
	
	public List<Entry<K,V>> entryList() {
		List<Entry<K,V>> entries = new LinkedList<Entry<K,V>>();

		Node<K,V> cur = head;
		while (cur != null) {
			Entry<K,V> e = new Entry<K,V>(cur.key, cur.value);
			entries.add(e);
			cur = cur.next;
		}
		return entries;
	}
	
}