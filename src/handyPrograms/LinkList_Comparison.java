package handyPrograms;

public class LinkList_Comparison {
	
	Node head;
	static Node a,b;
	
	static class Node
	{
		int data;
		Node next;
		public Node(char data) 
		{
			this.data = data;
			this.next = null;
		}
		
	}
	
	public int comparison(Node node1, Node node2)
	{
		int flag=0;
		if(node1==null && node2==null)
		{
			flag=1;// both lists are empty
		}
		while(node1!=null && node2!=null && node1.next == node2.next)
		{
			node1=node1.next;
			node2=node2.next;
			
		}
		//if both lists are different in size
		if(node1!=null && node2!=null)
		{
			if( node1.data > node2.data)
				{
				flag=1;
				}
				else
					{
					flag=-1;
				}
				
		}
		if(node1==null && node2 !=null)
		{
			flag=-1;
		}
		if(node1 !=null && node2==null)
		{
			flag =1; 
		}
		return flag;
		
	}

}
