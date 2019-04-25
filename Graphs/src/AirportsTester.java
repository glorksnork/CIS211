import java.util.ArrayList;
import java.util.HashMap;

/*
 * https://www.geeksforgeeks.org/graph-and-its-representations/
 */
public class AirportsTester {


	public static void main(String args[]) 
	{ 
		// create the graph given in above figure 

		ArrayList<String> airportList = new ArrayList<>();
		airportList.add("JFK");
		airportList.add("EWR");
		airportList.add("PHL");
		airportList.add("ILG");
		airportList.add("IAD");

		AirportsGraph airports = new AirportsGraph(airportList);

		airports.addRoute("JFK", "IAD"); 
		airports.addRoute("IAD", "ILG"); 
		airports.addRoute("ILG", "PHL"); 
		airports.addRoute("IAD", "PHL"); 
		airports.addRoute("IAD", "EWR"); 
		airports.addRoute("PHL", "EWR"); 

		// print the adjacency list representation of  
		// the above graph 
		airports.printGraph(); 

		// TODO: Implement the printAdjacent method, so that it displays all
		// adjacent airports from the given airport passed in
		airports.printAdjacent("PHL");
		airports.printAdjacent("ILG");
		
		
		//print all possible paths between two airports
		airports.printAllPaths( "EWR","PHL");
		airports.printAllPaths( "EWR","ILG");

		


	} 


} 
