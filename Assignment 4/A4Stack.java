/*
 * Joh Yoshida
 * V00798535
 */
public class A4Stack <T> implements Stack <T> {
  private static final int DEFAULT_CAPACITY = 5;
  private T[] data;
  private int top;

  public A4Stack() {
    data = (T[])new Object[DEFAULT_CAPACITY];
    top  = 0;
  }

  public A4Stack(int size) {
    data = (T[])new Object[size];
    top  = 0;
  }

  public void push(T v) throws FullStackException {
    if (isFull()) {
      throw new FullStackException("Stack is already full!");
    }
    data[top] = v;
    top++;
  }

  public T pop() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException("Stack is empty!");
    }
    T val = top();
    top--;
    data[top] = null;
    return val;
  }

  public void popAll() {
    data = data = (T[])new Object[DEFAULT_CAPACITY];
    top  = 0;
  }

  public boolean isEmpty() {
    if (top == 0) {
      return true;
    }
    return false;
  }

  public boolean isFull() {
    if (data.length == top) {
      return true;
    }
    return false;             // so it compiles
  }

  public T top() throws EmptyStackException {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return data[top - 1];
  }
}
