import java.io.*;
import java.util.*;

class bfs_graph
{
    Vertex vertices[];
    int count;
    int [][] adj;
    Queue tqueue;
    public static void main()
    {
        bfs_graph obj = new bfs_graph();
       obj.create(5);
       
       obj.addVertex('a');
       obj.addVertex('b');
       obj.addVertex('c');
       obj.addVertex('d');
       obj.addVertex('e');
       obj.addEdge(0,3);
       obj.addEdge(0,4);
       obj.addEdge(1,3);
       obj.addEdge(3,2);
      
       obj.bfs();
     
    }
    
    int[][] create(int vertexcount) 
    {
        
        this.adj= new int[vertexcount][vertexcount];
        this.vertices =new Vertex[vertexcount];
        tqueue =new LinkedList();
        for(int i =0;i<count; i++)
       
       for(int j=0;j<count;j++)
       adj[i][j]=0;
      
    return adj;    
    }
    void addEdge(int source, int dest)
    {
        System.out.println("adding");
            adj[source][dest] =1;
            adj[dest][source]=1;   
    }
    void addVertex(char v)
    {
        vertices[count++]= new Vertex(v); 
    }
     void removeEdge(int source, int dest)
    {
        if(source<count&& source>=0&& dest>=0 && dest <count)
        {
            adj[source][dest] =0;
            adj[dest][source]=0;
            
        }  
    }
    boolean isEdge(int source, int dest)
    {
        if(source<count&& source>=0&& dest>=0 && dest <count && adj[source][dest]==1)
        return true;
      return false;  
    }
    public void displayVertex(int v)
    {
        System.out.println(vertices[v].label);
    }
    void bfs()
    {
     vertices[0].visited=true;
     displayVertex(0);
     tqueue.add(0);
     int v2;
     while(!tqueue.isEmpty())
     {
         int d = (int)tqueue.peek();
         tqueue.remove();
         while((v2= getAdjMatrix(d))!=-1)
        {
            vertices[v2].visited=true;
            displayVertex(v2);
            tqueue.add(v2);
        }
        
         
        }for(int j =0;j<count;j++)
            vertices[j].visited =false;
        
    }
    int getAdjMatrix(int val)
    {
        for(int j=0;j<count;j++)
        if(adj[val][j]==1 && vertices[j].visited== false)
        return j;
        return -1;
    }
}

class Vertex
{
    char label;
    boolean visited;
    public Vertex(char lab){
        this.label=lab;
        visited= false;
        
}
}
