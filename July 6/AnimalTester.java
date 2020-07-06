public class AnimalTester {
  public static void main(String args[]) {
    Animal a1 = new Animal();
    Animal a2 = new Animal("lion", "roar");

    a1.speak();
    a2.speak();
    System.out.println("a1: " + a1);
    System.out.println("a2: " + a2);
  }
}
