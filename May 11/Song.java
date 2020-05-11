// Song.java

public class Song {
  private String title;
  private String artist;

  public Song(String initialTitle, String initialArtist) {
    title  = initialTitle;
    artist = initialArtist;
  }

  public Song(String initialTitle) {
    title  = initialTitle;
    artist = "Unknown Artist";
  }

  public Song() {
    title  = "Unknown Title";
    artist = "Unknown Artist";
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public void setTitle(String newTitle) {
    title = newTitle;
  }

  public void setArtist(String newArtist) {
    artist = newArtist;
  }

  // String representation of an object.
  // This method is automatically called when we print out an object
  public String toString() {
    return "Title: " + title + " - Artist: " + artist;
  }
}
