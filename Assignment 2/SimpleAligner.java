public class SimpleAligner implements Aligner {
	private String sequence;
	private String lastTested;
	private int numErrors;
	private int offset;
	
	public SimpleAligner(String sequence) {
		this.sequence = sequence;
		lastTested = "";
		offset = -1;
		numErrors = -1;
	}
	
	public int errorsAtOffset(int index, String subsequence) {
		char[] dataSequence = sequence.toCharArray();
		char[] toFind = subsequence.toCharArray();
		
		for (int i = 0; i < toFind.length; i++) {
			if (toFind[i] != dataSequence[i]) {
				return toFind.length;
			}
		}
		return 0;
	}
			
	public void bestAlignmentOffset(String subsequence) {
		offset = 0;
		numErrors = errorsAtOffset(0, subsequence);
		lastTested = subsequence;
	}	
	
	public String toString() {
		String s = 	"Data sequence: " + sequence + "\n";
		s +=		"Compared with: " + lastTested + "\n";
		s +=		"Best index number: "+ offset + "\n";
		s +=		"Errors detected: " + numErrors + "\n";
		return s;
	}
	
}