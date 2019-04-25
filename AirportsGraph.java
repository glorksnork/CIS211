/**
 * @author Delaware Technical Community College
 * 
 * Starter Code for Assignment 10
 * 
 * Modified from:
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 * 
 * Java Program to demonstrate adjacency list  
 * representation of graphs 
 * This code is contributed by Sumit Ghosh 
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List; 

class AirportsGraph 
{ 
	private int numVertices; 
	private LinkedList<Integer> adjListArray[]; 

	/* We will save all the aiports in the graph into a HashMap, which will
	 *   be used to map each airport to a corresponding int, so that we can
	 *   re-use existing code/algorithms written for a graph of integers.
	 */  
	private HashMap<String, Integer> airportsHashMap = new HashMap<>();


	// constructor
	AirportsGraph(ArrayList<String> airportList) { 
		this.numVertices = airportList.size(); 

		// define the size of array as  
		// number of vertices 
		adjListArray = new LinkedList[numVertices]; 

		// Create a new list for each vertex 
		// such that adjacent nodes can be stored 
		for(int i = 0; i < numVertices ; i++){ 
			adjListArray[i] = new LinkedList<>();

			// Initialize the HashMap, which will hold key value pairs
			// corresponding to airport code and an integer.
			// The integer is meaningless - it is only used internally
			// to represent the airport in the graph implementation
			// and any corresponding algorithms.
			airportsHashMap.put(airportList.get(i), i);
			initAdjList();
		} 
	} 
	/*
	 * This method is a simple "converter," so that the addEdge method
	 * can be called using more human readable airport code, which are
	 * strings, rather than integers.
	 */
	void addRoute(String src, String dest) {
		// TODO: Code to call the private helper method addEdge
		//addEdge(numVertices, numVertices);
	    int start=airportsHashMap.get(src).intValue();
		int end=airportsHashMap.get(dest).intValue();
		
		//int DaRoute;
		addEdge(start,end);
	}

	 @SuppressWarnings("unchecked") 
	    private void initAdjList() 
	    { 
	        adjListArray = new LinkedList[numVertices]; 
	          
	        for(int i = 0; i < numVertices; i++) 
	        { 
	            adjListArray[i] = new LinkedList<>(); 
	        } 
	    } 
	/*
	 * The add edge method has been modified to be private, so it can be used
	 * by the addRoute public method, which takes String arguments instead of
	 * integer arguments.
	 */

	// Adds an edge to an undirected graph 
	private void addEdge(int src, int dest) 
	{ 
		// Add an edge from src to dest.  
		adjListArray[src].add(dest); 

		// Since graph is undirected, add an edge from dest 
		// to src also 
		adjListArray[dest].add(src); 
	} 

	// A utility function to print the adjacency list  
	// representation of graph 
	void printGraph() 
	{        
		/*
		 * This method has been modified to utilize the airportFromInt helper method
		 * below, so that the adjacency list, which holds integers representing
		 * airports, can be displayed in a more readable form.
		 */
		System.out.println("\nPrinting whole graph as adjacency list: ");
		for(int v = 0; v < numVertices; v++) 
		{ 
			System.out.println(airportFromInt(v) + "-->"); 
			for(Integer pCrawl: adjListArray[v]){ 
				System.out.print(airportFromInt(pCrawl) + "\t"); 
			} 
			System.out.println("\n"); 
		} 
	}
 void printAdjacent(String key) {
	 System.out.println("Adjacency list of airport: " +key + "-->"); 
     for(Integer pCrawl: adjListArray[airportsHashMap.get(key)]){ 
         System.out.print(airportFromInt(pCrawl) + "\t"); 
     } 
     System.out.println("\n"); 
	 
 }
  

 public void printAllPaths(String hmm, String huh)  
 { 

     boolean[] isVisited = new boolean[numVertices]; 
     ArrayList<Integer> pathList = new ArrayList<>(); 
       
     int start=airportsHashMap.get(hmm).intValue();
	   int end=airportsHashMap.get(huh).intValue();
     //add source to path[] 
     pathList.add(start); 
    
     System.out.println("\n"); 
     //Call recursive utility 
     printAllPathsUtil(start, end, isVisited, pathList); 
     
     
 
 }  
 
 
	private void printAllPathsUtil(Integer u, Integer d, 
                                 boolean[] isVisited, 
                         List<Integer> localPathList) { 
	
     // Mark the current node 
     isVisited[u] = true; 
       
     if (d.equals(u))  
     { 
       // System.out.println(localPathList); 
    	//System.out.print(airportFromInt( u)); 
    	 System.out.println(airportFromInt(u) + "-->"); 
			for(Integer pCrawl: adjListArray[u]){ 
				System.out.print(airportFromInt(pCrawl) + "\t"); 
			} 
			System.out.println("\n"); 
    	 
         // if match found then no need to traverse more till depth 
         isVisited[u]= false; 
         return ; 
     } 
       
     // Recur for all the vertices 
     // adjacent to current vertex 
     for (Integer i :adjListArray[u])  
     { 
         if (!isVisited[i]) 
         { 
        	
        	 
             // store current node  
             // in path[] 
             localPathList.add(i);
             printAllPathsUtil(i, d, isVisited, localPathList); 

             // remove current node 
             // in path[] 
             localPathList.remove(localPathList.size()-1);
         } 
     } 
       
     // Mark the current node 
     isVisited[u] = false; 
 } 
 
 private String airportFromInt(int airportInt) {
		// TODO: Write body of airportFromInt method
	//
	 String AirInts = null;
	 if (airportInt == 0) 
	 {
		 AirInts ="JFK";
	 }
	 if (airportInt == 1)
	 {
		 AirInts = "EWR";
	 }
		if (airportInt == 2)
		{
			AirInts = "PHL";
		}
		if (airportInt == 3)
		{
			AirInts = "ILG";
		} 
		if (airportInt == 4 )
		{
			AirInts = "IAD";
		}
		return AirInts;
	}

}

