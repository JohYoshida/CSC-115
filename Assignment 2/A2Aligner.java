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
    char[] dataSequence = sequence.toCharArray();
    char[] toFind       = subsequence.toCharArray();
    int count           = 0;

    for (int i = 0; i < toFind.length; i++) {
      // Handle cases before sequence indices
      if (i + index < 0) {
        count++;
      }
      // Handle cases after sequence indices
      else if (i + index >= dataSequence.length) {
        count++;
      }
      else {
        // Compare subsequence value to corresponding sequence value at offset
        if (toFind[i] != dataSequence[i + index]) {
          // Increment error count if no match
          count++;
        }
      }
    }

    return count;
  }

  public void bestAlignmentOffset(String subsequence) {
    char[] dataSequence = sequence.toCharArray();
    char[] toFind       = subsequence.toCharArray();
    int errors;
    numErrors = dataSequence.length;
    for (int i = 0; i < dataSequence.length; i++) {
      errors = errorsAtOffset(i, subsequence);

      if (errors < numErrors) {
        numErrors = errors;
        offset    = i;
      }
    }
    lastTested = subsequence;
  }

  public String toString() {
    String s = "Data sequence: " + sequence + "\n";

    s += "Compared with: " + lastTested + "\n";
    s += "Best offset: " + offset + "\n";
    s += "Errors detected: " + numErrors + "\n";
    return s;
  }
}
