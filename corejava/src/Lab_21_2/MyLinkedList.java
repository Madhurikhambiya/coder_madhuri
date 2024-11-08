package Lab_21_2;

class ListNode{
	int data;
	ListNode next;
	
	ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

class MyLinkedList { 
	private ListNode head;
	
	//Method to add a new node at the end of the list
	
	public void append(int data) {
		ListNode newNode = new ListNode(data);
		if(head == null) {
			head = newNode;
			return;
					
		}
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	//Method to append the second list to the end of the first list
	
	public void appendList(MyLinkedList listToAppend) {
		if(listToAppend == null || listToAppend == null) {
			return; //Nothing to Append
		}
		if(this.head == null) {
			this.head = listToAppend.head;
			return;
		}
		ListNode temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = listToAppend.head;
	}
	//method to print the linked list
	
	public void printList() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.append(22);
		list.append(33);
		list.append(44);
		list.append(55);
		
		
		MyLinkedList list2 = new MyLinkedList();
		list.append(66);
		list.append(77);
		list.append(88);
		list.append(99);
		
		
		System.out.println("List 1 before appending :");
		list.printList();
		
		System.out.println("List2");
		list2.printList();
		
		list.appendList(list2);
		
		System.out.println("List1 after appending List2");
		
		list.printList();
	}

}
