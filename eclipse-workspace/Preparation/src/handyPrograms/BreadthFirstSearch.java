package handyPrograms;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
	int Vertex;
	LinkedList<Integer> adj[];// Adjacency List
	BreadthFirstSearch(int vertex)
	{
		Vertex=vertex;
		adj = new LinkedList[vertex];
		for(int i=0;i<vertex;++i)
		{
			
			adj[i]= new LinkedList();
		}
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	 void BFS(int s)
	{
		// algo for traversing nodes
		boolean visited[]= new boolean[Vertex];
		// Declare queue for storing elements of search
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		int count=0;
		//adding the source node first after marking as visited true = visited
		queue.add(s);
		while(queue.size()!=0)
		{
			s= queue.poll(); // Dequeue the element and print
			System.out.println(" "+s);
			
			Iterator<Integer> iter = adj[s].iterator();// Adjacency linked list iterator
			while(iter.hasNext())
			{
				int n=iter.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
				else
				{
					for(int j=0;j<queue.size();j++)
					{
						if(n==queue.get(j))
						{
							count++;
						}
						
					}
				}
			}
		}
		if(count >0)
		{
			System.out.println("Cycle detected");
		}
		else
		{
			System.out.println("cycle didn't detected");
		}
		// Driver method to
	   
		
	}
	 public static void main(String[] args)
	    {
	    	BreadthFirstSearch g = new BreadthFirstSearch(5);
	 
	        g.addEdge(0, 1);
	        //g.addEdge(1, 0);
	        g.addEdge(1, 2);
	        g.addEdge(0, 3);
	        g.addEdge(3, 4);
	        //g.addEdge(1, 3);   // add this edge to form a cycle to check cycling in code
	        
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(0);
	    }
}
