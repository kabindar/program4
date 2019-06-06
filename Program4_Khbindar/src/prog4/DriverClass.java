package prog4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Khbindar Arumugam
 * @date 6-6-2019 
 * 
 * @overview 
 * This program takes in connected edge pairs from an input file and converts 
 * them to an adjacency list. Prints out the list to an output file and runs the BFS 
 * algorithm and prints out the nodes visited in an order. Does the same for the DFS algorithm.
 * 
 * 
 * @how-to-use
 * 1. Make sure the input file contains connected edge pairs. For example if 0 is connected to 1,2,3. 
 * It should be inputed as 0,1    0,2    0,3   and each pair should be on a new line.
 * 
 * 2. Run the program 
 * 
 * 3. Console would ask for the source vertex for BFS and please input a vertex within the input file or else
 * the program won't run.
 * 
 * 4.There would be an output file in the source folder which contains the adjacency list, BFS algo visited nodes
 * and DFS algo visited nodes.
 *
 *@what-it-does
 * Program is to show how BFS and DFS algorithm works. 
 *
 */

public class DriverClass {

	 public static void main(String[] args) throws IOException 
	    {
		 String line = "";
		 graph g = new graph(5); 
	     BufferedWriter writer = new BufferedWriter(new FileWriter("src//prog4//output.txt"));
		 
		 try {
			
			BufferedReader input = new BufferedReader(new FileReader("src//prog4//input.txt"));
			do {
			line = input.readLine();
			if(line == null) {break;}
			String[] strArr = line.split(",");
			
			
			int[] numArr = new int[strArr.length];
			for(int i = 0;i < strArr.length;i++)
			{
			   numArr[i] = Integer.parseInt(strArr[i]);
			}
		
			g.addEdge(numArr[0], numArr[1]); 

		 
			} while (line != null);
		 
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	        g.printGraph(writer);
	        
	        writer.write("DFS visited: ");
	        DFS.readDFS(g, writer);
	        
	        writer.newLine();
	        System.out.println("BFS search operation ");
	        writer.write("BFS visited: ");
	        BFS.readBFS(g, writer);
	        
	        System.out.println();
	        System.out.println("File processing.......... Output file created");
	        System.out.println("Thank you!!!");
	        
	        writer.close();
	    } 

}
