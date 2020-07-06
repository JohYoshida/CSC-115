public class Animal {
  private String species;
  private String sound;

  public Animal() {
    species = "unknown species";
    sound   = "unknown sound";
    System.out.println("animal constructor (0 parameters)");
  }

  public Animal(String species, String sound) {
    this.species = species;
    this.sound   = sound;
    System.out.println("animal constructor (2 parameters)");
  }

  public void speak() {
    System.out.println("I am a " + species + " and I say " + sound);
  }

  public String toString() {
    String s = species + ":" + sound;

    return s;
  }
}
