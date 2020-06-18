class TooSmallException extends Exception {}
class TooBigException extends Exception {}

public class ExceptionExercises {
  // Q1) What does this method output?
  public static void example1() {
    System.out.println("start of example1");
    int[] array = { 1, 2, 3 };

    try {
      System.out.println(array[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Could not access that index:\n" + e);
    } catch (NullPointerException e) {
      System.out.println("Tried to use null variable:\n" + e);
    }

    System.out.println("end of example1");
  }

  // Q2) Calling custom exceptions
  public static void example2() {
    int a = 5;
    int b = 1000;

    try {
      onlySmallNumbers(a);
      onlySmallNumbers(b);
    }
    catch (TooBigException e) {
      System.out.println("Caught " + e + " in example2 method");
    }
    catch (TooSmallException e) {
      System.out.println("Caught " + e + " in example2 method");
    }

    System.out.println("end of example2 method");
  }

  public static void onlySmallNumbers(int x) throws TooBigException, TooSmallException {
    System.out.println("begin small numbers method with " + x);
    if (x > 10) {
      throw new TooBigException();
    }
    try {
      onlyLargeNumbers(x);
    }
    catch (TooSmallException e) {
      System.out.println("Caught " + e + " in onlySmallNumbers method");
    }

    System.out.println("end small numbers method with " + x);
  }

  public static void onlyLargeNumbers(int x) throws TooSmallException {
    System.out.println("begin large numbers method with " + x);
    if (x < 100) {
      throw new TooSmallException();
    }

    System.out.println("end large numbers method with " + x);
  }

  public static void main(String[] args) {
    /* Complete the following exercises,
     *  one at a time */

    // example1();
    example2();
  }
}
