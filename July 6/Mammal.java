public class Mammal extends Animal {
  private int gestationPeriod;

  public Mammal() {
    gestationPeriod = 5;
    System.out.println("mammal constructor (0 parameters)");
  }

  public Mammal(int gestationPeriod) {
    this.gestationPeriod = gestationPeriod;
    System.out.println("mammal constructor (1 parameters)");
  }

  public Mammal(String species, String sound, int gestationPeriod) {
    super(species, sound);
    this.gestationPeriod = gestationPeriod;
    System.out.println("mammal constructor (3 parameters)");
  }

  public String toString() {
    String s = super.toString();

    s += ":" + gestationPeriod;
    return s;
  }
}
