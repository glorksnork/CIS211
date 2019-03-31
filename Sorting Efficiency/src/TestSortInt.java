import java.util.Arrays;

public class TestSortInt {
	static final int ARRAY_SIZE = 100;
	public static void main(String[] args) {
		
		quickSortDemo();
		//shellSortDemo();
		//SelectionSortDemo();
		//InsertionSortDemo();

	}

	static void quickSortDemo() {
		System.out.println("Quick sort demo using ints");
		//int quickSortArray[] = generateRandomArray(ARRAY_SIZE);
		//System.out.print(quickSortArray.length);
		//System.out.println(Arrays.toString(quickSortArray));
		//final long quickSortStart = System.nanoTime();
		
		SortInt.QuicSortSolution();
		
	//	final long quickSortDuration = System.nanoTime() - quickSortStart;
		//System.out.println("\nThe quick sort took " + quickSortDuration + " nanoseconds or " + quickSortDuration/1e9 + " seconds." );		
		//System.out.println(Arrays.toString(quickSortArray));
	}
	
	static void shellSortDemo() {
		System.out.println("\nShell sort demo using ints");
		//int shellSortArray[] = generateRandomArray(ARRAY_SIZE);
		//System.out.println(Arrays.toString(shellSortArray));
		
		//final long shellSortStart = System.nanoTime();
		
		SortInt.ShellsortSolution();
		
		//final long shellSortDuration = System.nanoTime() - shellSortStart;
		
		//System.out.println("The Shell sort took " + shellSortDuration + " nanoseconds or " + shellSortDuration/1e9 + " seconds." );
		//System.out.println(Arrays.toString(shellSortArray));
	}
	
	static void SelectionSortDemo() {
		System.out.println("\nSelection Sort demo using ints");
		//int selectSotArray[] = generateRandomArray(ARRAY_SIZE);
		//System.out.println(Arrays.toString(shellSortArray));
		
		//final long shellSortStart = System.nanoTime();
		
		SortInt.SelectionsortSolution();
		
		//final long selectSortDuration = System.nanoTime() - shellSortStart;
		
		//System.out.println("The Shell sort took " + selectSortDuration + " nanoseconds or " + selectSortDuration/1e9 + " seconds." );
		//System.out.println(Arrays.toString(shellSortArray));
	}
	
	static void InsertionSortDemo() {
		System.out.println("\nInsertion Sort demo using ints");
		//int insertSotArray[] = generateRandomArray(ARRAY_SIZE);
		//System.out.println(Arrays.toString(shellSortArray));
		
		//final long insortSortStart = System.nanoTime();
		
		SortInt.InsertionsortSolution();
		
		//final long insertSortDuration = System.nanoTime() - insortSortStart;
		
		//System.out.println("The Shell sort took " + insertSortDuration + " nanoseconds or " + insertSortDuration/1e9 + " seconds." );
		//System.out.println(Arrays.toString(shellSortArray));
	}
	

	
	static int[] generateRandomArray(int arraySize) {
		int randomArray[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			randomArray[i] = (int)(Math.random()*1000);
		}
		return randomArray;
	}


}
