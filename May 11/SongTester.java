// SongTester.java
//
// We will write code here to test our implementation of Song.java
//
// We have put this code in a different file to help you understand
// the difference between static and non-static.  In the real world,
// this style of test code might be included in the Song.java file.

public class SongTester {
  public static void main(String[] args) {
    Song s1 = new Song("Champions", "Queen");
    Song s2 = new Song("Halo", "Beyonce");
    Song s3 = new Song("My Song");

    System.out.println("s1: " + s1.getTitle() + " - " + s1.getArtist());
    System.out.println("s2: " + s2.getTitle() + " - " + s2.getArtist());
    System.out.println("s3: " + s3.getTitle() + " - " + s3.getArtist());
    System.out.println("s1: " + s1);
  }
}
