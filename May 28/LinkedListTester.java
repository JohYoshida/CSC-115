public class LinkedListTester {
    
    public static void main (String[] args) {

		System.out.println("Part 1:");
		
        // 1a. create a new blank node n1
        Node n1 = new Node();
		
        // 1b. create a new node n2 with a value of 9
        Node n2 = new Node(9);
		
        // 1c. print the values in n1 and n2
        System.out.println("n1: " + n1.getValue());
        System.out.println("n2: " + n2.getValue());

        
		System.out.println("\nPart 2:");
        // 2a. connect n1 to n2 such that n2 is before n1		
        n2.next = n1; // or n2.setNext(n1);
		
        // 2b. print the value in n1 and n2 without using the variable n1
		System.out.println("n1: " + n2.getNext().getValue());
        System.out.println("n2: " + n2.getValue());


		System.out.println("\nPart 3:");        
        /* 3a. create a new node n3 with a value of 20 */
		Node n3 = new Node(20);
		
        /* 3b. assign our n1 variable so that it also references
		       the newly created node with data value 20 */
		n1 = n3; 
		
        /* 3c. Can you still print the values in all 3 nodes? */

		System.out.println("old n1: " + n2.getNext().getValue());
        System.out.println("n2: " + n2.getValue());
        System.out.println("n3: " + n3.getValue());
        
		
		
		System.out.println("\nPart 4:");        
        /* 4a. connect n3 to the other two nodes such that n3 is
               in between the other two */
        n3.next = n2.next;
        n2.next = n3;

        /* 4b. print all 3 values using only the n2 variable
               that is, you cannot use the variables n1 or n3 */
		System.out.println("1st element: " + n2.getValue());
        System.out.println("2nd element: " + n2.getNext().getValue());
        System.out.println("3rd element: " + n2.getNext().getNext().getValue());
		
		
		System.out.println("\nPart 5:");	
        /* 5. create a LinkedList implemenation of IntegerList */
		
		IntegerList myList = new IntegerLinkedList();
		IntegerList myList2 = new IntegerLinkedList();


		System.out.println("List is empty:");
		System.out.println(myList);
		System.out.println();

		myList.addBack(10);
		myList.addBack(12);
		myList.addBack(4);
		myList.addBack(6);
		myList.addBack(7);
		System.out.println("List should contain: 10 12 4 6 7");
		System.out.println(myList);
		System.out.println();

		// System.out.println("Value at index 3 should be 6:");
		// System.out.println("Value at index 3 returned: "+ myList.get(3));
		// System.out.println("Value at index 0 should be 10:");
		// System.out.println("Value at index 0 returned: "+ myList.get(0));
		// System.out.println();

		// myList.addFront(15);
		// myList.addFront(71);
		// myList.addBack(17);

		// System.out.println("List should contain: 71 15 10 12 4 6 7 17");
		// System.out.println(myList);
		// System.out.println();
		
		// System.out.println("size should be 8. Size returned: " + myList.size());
		// System.out.println();

		//adding to new empty list starting at front
		// myList2.addFront(11);
		// myList2.addFront(14);
		// myList2.addBack(3);
		// myList2.addBack(13);

		// System.out.println("14 11 3 13: " + myList2);
		// System.out.println("size should be 4. Size returned: " + myList2.size());
    }
}
