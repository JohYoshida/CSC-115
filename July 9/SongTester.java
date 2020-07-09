// SongTester.java
public class SongTester {
  public static void main(String[] args) {
    Song s1 = new Song("Champions", "Queen", 192);
    Song s2 = new Song("Halo", "Beyonce", 234);
    Song s3 = new Song("Africa", "Toto", 192);
    Song s4 = new Song("Irreplaceable", "Beyonce", 218);

    System.out.println("Which songs comes first, " + s1 + " or " + s2 + "?");
    if (s1.compareTo(s2) < 0) {
      System.out.println(s1);
    }
    else if (s1.compareTo(s2) == 0) {
      System.out.println("it's a tie");
    }
    else {
      System.out.println(s2);
    }
    System.out.println();

    System.out.println("Which songs comes first, " + s1 + " or " + s3 + "?");
    if (s1.compareTo(s3) < 0) {
      System.out.println(s1);
    }
    else if (s1.compareTo(s3) == 0) {
      System.out.println("it's a tie");
    }
    else {
      System.out.println(s3);
    }
    System.out.println();

    System.out.println("Which songs comes first, " + s2 + " or " + s4 + "?");
    if (s2.compareTo(s4) < 0) {
      System.out.println(s2);
    }
    else if (s2.compareTo(s4) == 0) {
      System.out.println("it's a tie");
    }
    else {
      System.out.println(s4);
    }
    System.out.println();
  }
}
