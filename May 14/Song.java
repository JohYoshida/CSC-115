public class Song {
  private String title;
  private String artist;
  private int duration;   // in seconds

  public Song() {
    title    = "";
    artist   = "";
    duration = 0;
  }

  public Song(String t, String a) {
    title    = t;
    artist   = a;
    duration = 0;
  }

  public Song(String title, String artist, int duration) {
    this.title    = title;
    this.artist   = artist;
    this.duration = duration;
  }

  /*
   * Parameters: nothing
   * Purpose: get the title of the song
   * Returns: (String) title
   */
  public String getTitle() {
    return title;
  }

  /*
   * Parameters: (String) title
   * Purpose: set the title of the song
   * Returns: nothing
   */
  public void setTitle(String title) {
    title = title;
  }

  /*
   * Parameters: nothing
   * Purpose: get the artist of the song
   * Returns: (String) artist
   */
  public String getArtist() {
    return artist;
  }

  /*
   * Parameters: (String) artist
   * Purpose: set the artist of the song
   * Returns: nothing
   */
  public void setArtist(String artist) {
    artist = artist;
  }

  /*
   * Parameters: nothing
   * Purpose: get the duration of the song (in seconds)
   * Returns: (int) duration
   */
  public int getDuration() {
    return duration;
  }

  /*
   * Parameters: (int) duration
   * Purpose: set the song's duration (in seconds)
   * Returns: nothing
   */
  public void setDuration(int duration) {
    duration = duration;
  }

  /*
   * Parameters: nothing
   * Purpose: generates a string representation of a song
   * Returns: (String) representation of the song
   */
  public String toString() {
    String s = title + " - " + artist + " (" + duration + ")";

    return s;
  }

  /*
   * Parameters: int amount
   * Purpose: the amount of time to add to the duration of this song
   * Returns: void
   */
  public void addTime(int amount) {
  }

  /*
   * Parameters: Song other
   * Purpose: determines whether this Song is the same as other
   * Returns: boolean - true if they are equal, false otherwise
   */
  public boolean equals(Song other) {
    return true;
  }
}
