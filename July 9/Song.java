public class Song implements Comparable <Song> {
  private String title;
  private String artist;
  private int duration;       // in seconds

  public Song() {
    title    = "";
    artist   = "";
    duration = 0;
  }

  public Song(String title, String artist) {
    this.title  = title;
    this.artist = artist;
    duration    = 0;
  }

  public Song(String title, String artist, int duration) {
    this.title    = title;
    this.artist   = artist;
    this.duration = duration;
  }

  public String getTitle() {
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public String toString() {
    String s = "\"" + artist + " - " + title + "\"";

    return s;
  }

  public int compareTo(Song other) {
    // FIX THIS
    return -1;
  }
}
