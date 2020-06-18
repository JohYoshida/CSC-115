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

  public void push(T v) {
    // TODO: implement this
  }

  public T pop() {
    // TODO: implement this

    return null;             // so it compiles
  }

  public void popAll() {
    // TODO: implement this
  }

  public boolean isEmpty() {
    // TODO: implement this

    return false;             // so it compiles
  }

  public boolean isFull() {
    // TODO: implement this

    return false;             // so it compiles
  }

  public T top() {
    // TODO: implement this

    return null;             // so it compiles
  }
}
