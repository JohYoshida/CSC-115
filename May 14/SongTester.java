// SongTester.java
public class SongTester {
  public static void main(String[] args) {
    Song s1 = new Song("Champions", "Queen");
    Song s2 = new Song("Halo", "Beyonce");

    /* Q1.  I updated my setter methods in Song.java and I am now
     * trying to use update the artist of s1 but it's not working
     * What is my bug and how do I fix it? */
    s1.setArtist("James Blunt");
    System.out.println(s1);


    // /* Q2a. What will be the output of the following: */
    // Song mySong = null;
    // System.out.println("My song: " + mySong.getTitle());


    // /* Q2b. What will be the output of the following: */
    // mySong = s1;
    // System.out.println("Song s1: " + s1.getTitle());
    // System.out.println("My song: "  + mySong.getTitle());

    // /* Q2c. What will be the output of the following: */
    // mySong.setTitle("Living on a Prayer");
    // System.out.println("Song s1: "  + s1.getTitle());
    // System.out.println("My song: " + mySong.getTitle());


    // /* Q3. The following code tests the addTime method.
    // Complete the stub for the addTime method in Song.java */
    // s1.addTime(100);
    // System.out.println("expect length 100: " + s1);
    // s1.addTime(10);
    // System.out.println("expect length 110: " + s1);

    // /* Q4a. What is the output of the following? */
    // if (s1 == mySong) {
    // System.out.println("s1 == mySong");
    // } else {
    // System.out.println("s1 != mySong");
    // }


    /* Q4b. What is the output of the following?
     * Is it what you would want it to be? */
    Song s3 = new Song("Jump", "Pointer Sisters", 310);
    Song s4 = new Song("Jump", "Van Halen");
    Song s5 = new Song("Jump", "Van Halen", 241);

    if (s3 == s4) {
      System.out.println("s3 == s4");
    }
    else {
      System.out.println("s3 != s4");
    }

    if (s4 == s5) {
      System.out.println("s4 == s5");
    }
    else {
      System.out.println("s4 != s5");
    }

    /* Q4c. complete the equals method in Song.java using
     *     s3, s4, and s5 to test the equals method */


    /* Q5a. Create an array of Songs to store our songs */



    /* Q5b. Write and test a method called getPlaylistLength that takes an
     * array of Songs and returns the total length of all songs in the array */
  }
}
