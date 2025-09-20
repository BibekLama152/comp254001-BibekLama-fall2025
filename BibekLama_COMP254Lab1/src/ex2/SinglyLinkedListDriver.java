package ex2;

public class SinglyLinkedListDriver {
	
	//main method
	  public static void main(String[] args)
	  {
		  
		  SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		  list.addFirst("MSP");
		  list.addLast("ATL");
		  list.addLast("BOS");
		  //
		  list.addFirst("LAX");
		  System.out.println(list);
		  //
		  
		  //testing
		  Node<String> nodeB = list.head.getNext(); // B
		    Node<String> nodeD = nodeB.getNext().getNext(); // D
		    list.swapNodes(nodeB, nodeD);

		    System.out.println("After swap: " + list);
		  
	  }

}
