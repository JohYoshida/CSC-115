public class ListTester {
  public static void main(String[] args) {
    // Q0 Get started by opening IntegerArrayList.java
    IntegerList myList = new IntegerArrayList();

    // After the IntegerArrayList successfully implements
    // the IntegerList interface, uncomment each section
    // of tests one at at time (and debug when necessary
    // before proceeding to the next block of tests)

    System.out.println("Created a new IntegerList");
    System.out.println(myList);
    System.out.println("Size of new list: " + myList.size());
    System.out.println();

    myList.addBack(10);
    myList.addBack(12);
    myList.addBack(4);
    myList.addBack(6);
    myList.addBack(7);
    System.out.println("Added 10 12 4 6 7 to back");
    System.out.println(myList);
    System.out.println("size of list: " + myList.size());
    System.out.println();

    // System.out.println("Getting element at position 3");
    // System.out.println(myList.get(3));
    // System.out.println();

    // myList.addFront(15);
    // myList.addFront(71);
    // System.out.println("Added 15 to front, then 71 to front");
    // System.out.println(myList);
    // System.out.println();
  }
}
