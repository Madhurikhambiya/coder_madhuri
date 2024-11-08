package Data_Structure;

public class LinkedList2 { 
	
	static class Node{
		int data;  
		Node next;  // uske jesa agla object
		
		Node(int d){
			data = d;
			next = null;
		}
		public static void main(String[] args) {
			Node n3 = new Node(55);
			Node n4 = new Node(66);
			Node n2 = new Node(44);
			
			Node head = new Node(23);
			head.next =n2;
			head.next.next =n3;
			head.next.next.next =n4;
			n4.next = new Node(675);
			
			
			//suppose head of linked list is n then you have to find last node value
			//please write code hear 
			//you have reverse this link list 
			
			Node curr = head;
			
			if(curr.next==null) {
				System.out.println(curr.data);
			}
			
			while(curr.next != null) { 
				curr = curr.next;
				
				
			}
			System.out.println(curr.data);
			
		}
	
	}

}
