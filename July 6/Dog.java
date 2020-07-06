public class Dog extends Mammal {
  String name;

  public Dog() {
    super("Dog", "Woof", 2);
    name = "unamed";
    System.out.println("dog constructor (0 parameters)");
  }

  public Dog(String name) {
    super("Dog", "Woof", 2);
    this.name = name;
    System.out.println("dog constructor (1 parameters)");
  }

  public Dog(String species, String sound, String name) {
    super(species, sound, 2);
    this.name = name;
    System.out.println("dog constructor (1 parameters)");
  }

  public void speak() {
    super.speak();
    System.out.println("My name is " + name);
  }

  public void beg() {
    System.out.println("Please give treats");
  }
}
