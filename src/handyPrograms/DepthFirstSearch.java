package handyPrograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {
	int Vertex;     // Nodes
	LinkedList<Integer> adj[]; // Adjacency list
	DepthFirstSearch(int vertex)
	{
		Vertex = vertex;
		adj= new LinkedList[vertex];
		for(int i=0;i<vertex;++i)
		{
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		
	}
	
	void DFS(int s)
	{
		
		boolean visited[]= new boolean[Vertex];
		Stack<Integer> stack = new Stack<Integer>();
		visited[s]=true;
		stack.push(s);
		
		while(!stack.isEmpty())
		{
			s=stack.pop();
			System.out.println(" "+s);
			Iterator iter = adj[s].iterator();
			
			while(iter.hasNext() )
				{
				int n=(Integer)iter.next();
			if(!visited[n])
			{
				visited[n]=true;
				stack.push(n);
				//result.push(n);
			}
			
				}
			//count++;
		}
		//System.out.println(" "+result);
		
	}
	
	public static void main(String[] args)
	{
		DepthFirstSearch dfs= new DepthFirstSearch(4);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 2);
		dfs.addEdge(2, 0);
		dfs.addEdge(2, 3);
		dfs.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 0)");
 
        dfs.DFS(2);
		
	}

}

//Recursive DFS
	/*public  void dfs(Node node)
	{
		System.out.print(node.data + " ");
		List neighbours=node.getNeighbours();
     node.visited=true;
		for (int i = 0; i < neighbours.size(); i++) {
			Node n=neighbours.get(i);
			if(n!=null && !n.visited)
			{
				dfs(n);
			}
		}
	}*/
