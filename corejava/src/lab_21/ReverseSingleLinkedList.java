package lab_21;

public class ReverseSingleLinkedList {
	
	static class Node{
		int  data;
		Node next;
		Node(int d){
			data = d;
			next = null;
			
		}
		public static void printLinkedList(Node head) {
			Node curr = head;
			while(curr != null) {
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
		public static Node reverseList(Node head) {
			Node curr = head;
			Node prev = null;
			Node next;
			
			while(curr!=null) {
				next = curr.next;
				curr.next =prev;
				prev = curr;
				curr = next;
			}
			return prev;
		}
		public static void main(String[] args) {
			Node head = new Node(19);
			head.next = new Node(23);
			head.next.next = new Node(32);
			head.next.next.next = new Node(31);
			head.next.next.next.next = new Node(15);
			head.next.next.next.next.next = new Node(11);
			
			System.out.println("Given LinkedList ");
			
			printLinkedList(head);
			System.out.println(" ");
			
			System.out.print("After reverse the given LinkedList :");
			
			printLinkedList(reverseList(head));
			
		}
	}
	
	


}
