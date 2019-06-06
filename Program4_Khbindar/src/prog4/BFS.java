package prog4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Khbindar Arumugam
 * @date 6-6-2019 
 * 
 * @overview 
 * This is the class for the BFS function where a queue is created to visit each node.
 * 
 */

public class BFS 
	    { 
	         
	public static void readBFS(graph g, BufferedWriter writer) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a source vertex to begin with: ");
		int s = input.nextInt();
		bfs(s,g.V,g.list,writer);
		
	}
	          
	
	 static void bfs(int s, int V, LinkedList<Integer>[] list, BufferedWriter writer) throws IOException 
	    { 
	       
	        boolean visited[] = new boolean[V]; 
	  
	        // Create a queue for BFS 
	        LinkedList<Integer> queue = new LinkedList<Integer>(); 
	  
	        visited[s]=true; 
	        queue.add(s); 
	  
	        while (queue.size() != 0) 
	        { 
	            
	            s = queue.poll(); 
	            writer.write(s+" "); 
	  
	            Iterator<Integer> i = list[s].listIterator(); 
	            while (i.hasNext()) 
	            { 
	                int n = i.next(); 
	                if (!visited[n]) 
	                { 
	                    visited[n] = true; 
	                    queue.add(n); 
	                } 
	            } 
	        } 
	    } 

}
