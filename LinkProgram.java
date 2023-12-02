public class LinkProgram{
	Node head;
	 static class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	public void append(int new_data)
	{
	  
	    Node new_node = new Node(new_data);
	 
	  
	    if (head == null)
	    {
	        head = new Node(new_data);
	        return;
	    }
	 
	   
	    new_node.next = null;
	 
	    Node last = head;
	    while (last.next != null)
	        last = last.next;
	 
	   
	    last.next = new_node;
	    return;
	}
	
	 public static void main(String[] args)
	    {
	       
	        LinkProgram llist = new LinkProgram();
	 
	        llist.head = new Node(1);
	        Node second = new Node(2);
	        Node third = new Node(3);
	 
	 
	        llist.head.next = second; 
	 
	        
	        second.next = third; 
	        llist.append(50);
	       
	    }
	}
