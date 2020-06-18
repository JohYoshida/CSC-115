class TooSmallException extends Exception {}
class TooBigException extends Exception {}

public class ExceptionExercises {
  // Q1) What does this method output?
  public static void example1() {
    System.out.println("start of example1");
    int[] array = { 1, 2, 3 };
    System.out.println(array[3]);
    System.out.println("end of example1");
  }

  // Q2) Calling custom exceptions
  public static void example2() {
    int a = 5;
    int b = 1000;

    onlySmallNumbers(a);
    onlySmallNumbers(b);
  }

  public static void onlySmallNumbers(int x) {
    System.out.println("begin small numbers method with " + x);

    onlyLargeNumbers(x);

    System.out.println("end small numbers method with " + x);
  }

  public static void onlyLargeNumbers(int x) {
    System.out.println("begin large numbers method with " + x);


    System.out.println("end large numbers method with " + x);
  }

  public static void main(String[] args) {
    /* Complete the following exercises,
     *  one at a time */

    example1();
    // example2();
  }
}
