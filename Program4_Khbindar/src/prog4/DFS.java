package prog4;

import java.io.*; 
import java.util.*; 

/**
 * @author Khbindar Arumugam
 * @date 6-6-2019 
 * 
 * @overview 
 * This is the class for the DFS function where a stack is created to visit each node.
 * 
 */

public class DFS{
	
	public static void readDFS(graph g, BufferedWriter writer ) throws IOException {
		dfs(g.V,g.list, writer);
		
	}
	
	 static void DFSFunc(int s, Vector<Boolean> visited,LinkedList<Integer>[] list, BufferedWriter writer ) throws IOException 
     { 
 
         Stack<Integer> stack = new Stack<>(); 
            
          
         stack.push(s); 
            
         while(stack.empty() == false) 
         { 
           
             s = stack.peek(); 
             stack.pop(); 
                
             if(visited.get(s) == false) 
             { 
                 writer.write(s + " "); 
                 visited.set(s, true); 
             } 
                 
             Iterator<Integer> itr = list[s].iterator(); 
                
             while (itr.hasNext())  
             { 
                 int v = itr.next(); 
                 if(!visited.get(v)) 
                     stack.push(v); 
             } 
           } 
     } 
   
     static void dfs(int V,LinkedList<Integer>[] list, BufferedWriter writer) throws IOException 
     { 
         Vector<Boolean> visited = new Vector<Boolean>(V); 
          
         for (int i = 0; i < V; i++) 
             visited.add(false); 
   
         for (int i = 0; i < V; i++) 
             if (!visited.get(i)) 
                 DFSFunc(i, visited, list, writer); 
     }     
	
	

	
}
