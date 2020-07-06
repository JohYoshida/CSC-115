public class AnimalTester {
  public static void main(String args[]) {
    // Animal a2 = new Animal("lion", "roar");
    //
    // a1.speak();
    // a2.speak();
    // System.out.println("a1: " + a1);
    // System.out.println("a2: " + a2);

    Animal a1 = new Animal();
    Animal m1 = new Mammal();
    Animal m2 = new Mammal("pig", "oink", 4);
    Animal d1 = new Dog("Rover");

    System.out.println();

    m2.speak();

    System.out.println();
    System.out.println(m2);
    System.out.println();

    d1.speak();
    System.out.println();

    // Create new Dog, casting d1 as Dog
    Dog temp = (Dog)d1;
    temp.beg();
    // Cast d1 as Dog
    ((Dog)d1).beg();
  }
}
