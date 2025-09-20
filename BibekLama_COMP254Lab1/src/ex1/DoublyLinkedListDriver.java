package ex1;

public class DoublyLinkedListDriver {
	
	 //main method
	  public static void main(String[] args)
	  {
		  //create and populate a doubly linked list
		  DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		  list.addFirst("MSP");
		  list.addLast("ATL");
		  list.addLast("BOS");
		  //
		  list.addFirst("LAX");

		  System.out.println(list);
		  System.out.println(list.first());
		  //

	      // testing 
	      DoublyLinkedList<String> list2 = new DoublyLinkedList<String>();
	      list2.addLast("DFW");
	      list2.addLast("JFK");

	      list.concatenate(list2);

	      System.out.println(list);
	      System.out.println(list2); // should now be empty

	  }

}
