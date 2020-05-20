public class SimpleTester {

		public static void main(String[] args) {
		SimpleAligner a = new SimpleAligner("AAACTGGGTCA");
		System.out.println(a);
		
		a.bestAlignmentOffset("GTCG");
		System.out.println(a);
		
		a.bestAlignmentOffset("TGAC");
		System.out.println(a);
		System.out.println();
		
		
		SimpleAligner b = new SimpleAligner("TGACTGGGTCA");
		System.out.println(b);
		
		b.bestAlignmentOffset("TGAT");
		System.out.println(b);

		b.bestAlignmentOffset("TGAC");
		System.out.println(b);
	}
}