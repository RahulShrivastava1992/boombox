package handyPrograms;
public class DoublyLinkedList {
 static Node head;
	static class Node
		{
		
			int data;
			Node prev;
			Node next;
			public Node(int data) 
			{
				this.data = data;
			}
			
		}
public void addNode(int data)
{
	Node newNode = new Node(data);
	newNode.next=head;
	newNode.prev=null;
	if(head!=null)
	{
		head.prev=newNode;
		head=newNode;
		
	}
}
public void deleteNode(int datat)
{
	Node temp;
	temp=head;
	int datad=0;
	while(temp.next!=null)
	{
		if(temp.data==datat)
		{
			datad=temp.data;
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
		temp=temp.next;
	}
	System.out.println("the data which is deleted is "+datad);
}
public void reverseList(Node head)
{
	
}
public void printlist(Node head)
{
	while(head!=null)
	{
		System.out.println(head.data);
		head=head.next;
	}
}
			public static void main(String[] args)
			{
				DoublyLinkedList dll = new DoublyLinkedList();
			
				dll.head=new Node(5);;
				dll.head.prev=null;
				dll.head.next=null;
				
				System.out.println("Before addition");
				dll.printlist(head);
				dll.addNode(7);
				dll.addNode(8);
				System.out.println("after addition");
				dll.printlist(head);
				System.out.println("Afer deletion");
						dll.deleteNode(7);
						dll.printlist(head);
				
				
				
			}

}
