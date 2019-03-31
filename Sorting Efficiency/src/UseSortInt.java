import  java.io.*;

public class UseSortInt extends SortInt{
public static void main(String[] args) {
		
	quickSortDemo();
	shellSortDemo();
	//SelectionSortDemo();
			//InsertionSortDemo();

	}
static void quickSortDemo() {
	System.out.println("Quick sort demo using ints");
	QuicSortSolution();
}

static void shellSortDemo() {
	System.out.println("\nShell sort demo using ints");
	
	SortInt.ShellsortSolution();
	
	
}

static void SelectionSortDemo() {
	System.out.println("\nSelection Sort demo using ints");
	
	SortInt.SelectionsortSolution();
	
	
}

static void InsertionSortDemo() {
	System.out.println("\nInsertion Sort demo using ints");
	
	SortInt.InsertionsortSolution();
	

}
}
