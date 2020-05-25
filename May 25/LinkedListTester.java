public class LinkedListTester {

	public static void main (String[] args) {

		// 1a. create a new blank (value 0) node n1


		// 1b. create a new node n2 with a value of 9


		// 1c. print the values in n1 and n2



		// 2a. connect n1 to n2 such that n2 is before n1




		// 2b. print the value in n1 and n2 without using the variable n1





		// 3a. create a new node n3 with a value of 20


		// 3b. assign n3 to n1


		// 3c. Can you still print the values in all 3 nodes?




		// 4a. connect n3 to the other two nodes such that n3 is
		//      in between the other two




		// 4b. print all 3 values using only the n2 variable.
		//      That is, you cannot use the variables n1 or n3






		// 5. the following is from last lecture to test IntegerArrayList
		// change it so that it tests the IntegerLinkedList you will implement
		IntegerList myList = new IntegerArrayList();
		IntegerList myList2 = new IntegerArrayList();

		System.out.println("empty list: " + myList);

		myList.addBack(10);
		myList.addBack(12);
		myList.addBack(4);
		myList.addBack(6);
		myList.addBack(7);
		System.out.println("10 12 4 6 7: " + myList);

		System.out.println("6: " + myList.get(3));
		System.out.println("10: " + myList.get(0));

		myList.addFront(15);
		myList.addFront(71);
		myList.addBack(17);

		System.out.println("71 15 10 12 4 6 7 17: " + myList);
		System.out.println("size, should be 8: " + myList.size());

		// adding to new empty list starting at front
		myList2.addFront(11);
		myList2.addFront(14);
		myList2.addBack(3);
		myList2.addBack(13);

		System.out.println("14 11 3 13: " + myList2);
		System.out.println("size, should be 4: " + myList2.size());
	}
}

