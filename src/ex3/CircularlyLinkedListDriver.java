package ex3;

public class CircularlyLinkedListDriver {
	
	//main method
	  public static void main(String[] args)
	  {
		  
		  //(LAX, MSP, ATL, BOS)
		  CircularlyLinkedList<String> circularList = new CircularlyLinkedList<String>();
		  circularList.addFirst("LAX");
		  circularList.addLast("MSP");
		  circularList.addLast("ATL");
		  circularList.addLast("BOS");
		  //
		  System.out.println(circularList);
		  circularList.removeFirst();
		  System.out.println(circularList);
		  circularList.rotate();
		  System.out.println(circularList);

		  //
		  
		//testing
		  CircularlyLinkedList<String> clonedList = circularList.clone();
		  System.out.println("Cloned: " + clonedList);
		  circularList.addLast("JFK");
		  System.out.println("Original after adding JFK: " + circularList);
		  System.out.println("Cloned still: " + clonedList);

	  }

}
