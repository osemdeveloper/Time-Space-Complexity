package Basic_Interview_Set;

class ListNode{
	int value;
	ListNode next;
	
	public ListNode(int value) {
		this.value = value;
	}
}

public class ReverseLinkedList {
	
	public static ListNode reverse(ListNode head) {
		ListNode previous = null;
		ListNode current = head;
		
		while (current != null) {
			ListNode next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			
		}
		
		return previous;
	}
	
	public static void main(String[] args) {
		//Create a inked list 1.2....5
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		System.out.println("Original Linked List:");
		printLinkedList(head);
		
		ListNode reversedHead = reverse(head);
		
		System.out.println("Reversed Linked List:");
		printLinkedList(reversedHead);
		
		
	}
	
	public static void printLinkedList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.value + " ");
			current = current.next;
		}
		
		System.out.println();
	}

}
