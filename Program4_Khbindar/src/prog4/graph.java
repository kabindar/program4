package prog4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*; 

/**
 * @author Khbindar Arumugam
 * @date 6-6-2019 
 * 
 * @overview 
 * This is where a graph is created and the connected edge pairs are combined into an adjacency list
 * 
 */


   public class graph 
    { 
        int V;  
          
        LinkedList<Integer>[] list; 
          
    
        graph(int V) 
        { 
            this.V = V; 
            list = new LinkedList[V]; 
              
            for (int i = 0; i < list.length; i++) 
                list[i] = new LinkedList<Integer>(); 
              
        } 
          
        //To add an edge to graph 
        void addEdge(int v, int w) 
        { 
            list[v].add(w); 
        } 
         

		public void printGraph(BufferedWriter writer) throws IOException {
            writer.newLine();
            writer.write("Adjacency List");
            writer.newLine();
			for (int i=0; i < list.length; i++) {
				writer.write(i+" -> ");
				for (int num : list[i]) {
					writer.write("\t "+num);
				}
				writer.newLine();
				writer.newLine();
				}
		}
    
    }
    
    
      
    // Driver program to test methods of graph class 
   
 