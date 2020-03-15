import java.io.*;
import java.util.*;
import java.util.ArrayList;

class linkedlist_graph
{
    int vertexCount;
    ArrayList<Integer> vertices;
    ListNode[] edges;
    public linkedlist_graph(int count)
    {
        this.vertexCount= count;
        vertices= new ArrayList<Integer>();
        edges =new ListNode[vertexCount];
        for(int i=0;i<vertexCount;i++)
        {
           vertices.add(i);
        edges[i]=new ListNode(0);
    }    
    }
    public void addEdge(int source, int dest)
    {
      int i = vertices.indexOf(source); 
      int j = vertices.indexOf(dest);
       if(i!=-1||j!=-1) 
       {
           edges[i].insertAtbeginning(dest);
           System.out.println("adding");
           edges[j].insertAtbeginning(source);
        }
    }
    
    
    
    public static void main()
    {
        linkedlist_graph obj= new linkedlist_graph(5);
                obj.addEdge( 0, 1); 
		obj.addEdge( 0, 4); 
		obj.addEdge( 1, 2); 
		obj.addEdge( 1, 3); 
		obj.addEdge( 1, 4); 
		obj.addEdge( 2, 3); 
		obj.addEdge( 3, 4); 
        for(int v = 0; v < obj.vertexCount; v++) 
		{ 
			System.out.println("Adjacency list of vertex "+ v); 
			System.out.print("head"); 
			 
				ListNode new1= obj.edges[v].getnext();
				while(new1 != null)
				{
				    System.out.println(new1.getdata());
				    new1=new1.getnext();
				}
				
			
			System.out.println("\n"); 
		} 
    }
    
}





