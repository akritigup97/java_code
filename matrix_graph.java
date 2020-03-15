import java.io.*;
class matrix_graph
{
    int count;
    int [][] adj;
    public static void main()
    {
        matrix_graph obj = new matrix_graph();
       obj.create(5);
       obj.addEdge(1,2);
       obj.addEdge(1,4);
       obj.addEdge(3,4);
       obj.addEdge(3,2);
       for(int i =0;i<obj.count; i++)
       {
       for(int j=0;j<obj.count;j++)
       System.out.print(obj.adj[i][j]);
       System.out.println();
    }
    }
    
    int[][] create(int vertexcount) 
    {
        this.count =vertexcount;
        this.adj= new int[count][count];
    return adj;    
    }
    void addEdge(int source, int dest)
    {
        if(source<count&& source>=0&& dest>=0 && dest <count)
        {
            adj[source][dest] =1;
            adj[dest][source]=1;
            
        }  
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
}