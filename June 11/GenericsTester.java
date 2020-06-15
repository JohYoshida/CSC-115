public class GenericsTester {
  public static void main(String[] args) {
    LinkedList <Integer> myList = new LinkedList <Integer>();

    System.out.println("created and empty list:");
    System.out.println(myList);
    System.out.println();

    myList.addFront(10);
    System.out.println("inserted 10 to front:");
    System.out.println(myList);
    System.out.println();

    myList.addBack(20);
    System.out.println("inserted 20 to back:");
    System.out.println(myList);
    System.out.println();

    myList.addFront(30);
    System.out.println("inserted 30 to front:");
    System.out.println(myList);
    System.out.println();

    int result;
    result = myList.get(2);
    System.out.println("Accessed item at position 2:");
    System.out.println(result);
    System.out.println();

    LinkedList <String> list2 = new LinkedList <String>();
    System.out.println("create an empty list");
    System.out.println(list2);
    System.out.println();

    list2.addFront("is");
    list2.addFront("CSC115");
    list2.addBack("the");
    list2.addBack("best");

    System.out.println(list2);
  }
}
