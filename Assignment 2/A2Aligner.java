// Name: Joh Yoshida
// Student number: v00798535

public class A2Aligner implements Aligner {
  private String sequence;
  private String lastTested;
  private int numErrors;
  private int offset;

  public A2Aligner(String sequence) {
    this.sequence = sequence;
    lastTested    = "";
    offset        = -1;
    numErrors     = -1;
  }

  public String getSequence() {
    return sequence;
  }

  public String getLastTested() {
    return lastTested;
  }

  public int getNumErrors() {
    return numErrors;
  }

  public int getOffset() {
    return offset;
  }

  public int errorsAtOffset(int index, String subsequence) {
    int count = 0;

    // TODO: complete this
    return count;
  }

  public void bestAlignmentOffset(String subsequence) {
    // TODO: Complete this
  }

  // TODO: add getMethods for instance variables
  // (and add any helper methods you feel are necessary)


  public String toString() {
    String s = "Data sequence: " + sequence + "\n";

    s += "Compared with: " + lastTested + "\n";
    s += "Best offset: " + offset + "\n";
    s += "Errors detected: " + numErrors + "\n";
    return s;
  }
}
