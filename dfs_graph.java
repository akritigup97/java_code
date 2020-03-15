import java.io.*;
import java.util.*;

class dfs_graph
{
    Vertex vertices[];
    int count;
    int [][] adj;
    Stack tstack;
    public static void main()
    {
        dfs_graph obj = new dfs_graph();
       obj.create(5);
       
       obj.addVertex('a');
       obj.addVertex('b');
       obj.addVertex('c');
       obj.addVertex('d');
       obj.addVertex('e');
       obj.addEdge(1,2);
       obj.addEdge(1,4);
       obj.addEdge(3,4);
       obj.addEdge(0,2);
       obj.dfs();
     
    }
    
    int[][] create(int vertexcount) 
    {
        
        this.adj= new int[vertexcount][vertexcount];
        this.vertices =new Vertex[vertexcount];
        tstack = new Stack();
        for(int i =0;i<count; i++)
       
       for(int j=0;j<count;j++)
       adj[i][j]=0;
      
    return adj;    
    }
    void addEdge(int source, int dest)
    {
        
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
    void dfs()
    {
     vertices[0].visited=true;
     displayVertex(0);
     tstack.push(0);
     while(!tstack.isEmpty())
     {
         int d = getAdjMatrix((int)tstack.peek());
         if(d==-1)
         tstack.pop();
         else
         {
             vertices[d].visited=true;
             displayVertex(d);
             tstack.push(d);
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
