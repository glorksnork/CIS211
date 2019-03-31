import java.util.Arrays;
import java.util.Scanner;

public class SortInt {
	
	static final int MININT = 100;
	static final int SECONDINT = 1000;
	static final int THIRDINT  = 10000;
	static final int MAXINT = 100000;

	// Quicksort
	// https://www.programcreek.com/2012/11/quicksort-array-in-java/
	public static void quickSort(int[] arr, int start, int end){

		int partition = partition(arr, start, end);

		if(partition-1>start) {
			quickSort(arr, start, partition - 1);
		}
		if(partition+1<end) {
			quickSort(arr, partition + 1, end);
		}
	}

	// helper method for quicksort
	// https://www.programcreek.com/2012/11/quicksort-array-in-java/
	public static int partition(int[] arr, int start, int end){
		int pivot = arr[end];

		for(int i=start; i<end; i++){
			if(arr[i]<pivot){
				int temp= arr[start];
				arr[start]=arr[i];
				arr[i]=temp;
				start++;
			}
		}

		int temp = arr[start];
		arr[start] = pivot;
		arr[end] = temp;

		return start;
	}


	// Shell sort
	// https://www.geeksforgeeks.org/shellsort/
	public static void shellSort(int arr[]) 
	{ 
		int n = arr.length; 

		// Start with a big gap, then reduce the gap 
		for (int gap = n/2; gap > 0; gap /= 2) 
		{ 
			for (int i = gap; i < n; i += 1) 
			{ 
				int temp = arr[i]; 
				int j; 
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
					arr[j] = arr[j - gap]; 
				arr[j] = temp; 
			} 
		} 
	} 
	
	public static int[] SelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
	 public static int[] InsertionSort(int[] input){
         
	        int temp;
	        for (int i = 1; i < input.length; i++) {
	            for(int j = i ; j > 0 ; j--){
	                if(input[j] < input[j-1]){
	                    temp = input[j];
	                    input[j] = input[j-1];
	                    input[j-1] = temp;
	                }
	            }
	        }
	        return input;
	    }
	 static int[] generateRandomArray(int arraySize) {
			int randomArray[] = new int[arraySize];
			for (int i = 0; i < arraySize; i++) {
				randomArray[i] = (int)(Math.random()*1000);
			}
			return randomArray;
		}
	 
	 
	 static void QuicSortSolution() {
		 long startTime = System.nanoTime();
		 int quickSortArray[] = generateRandomArray(MININT);//100 integers
		 int quickSortArray1[] = generateRandomArray(SECONDINT);//1000 integers
		 int quickSortArray2[] = generateRandomArray(THIRDINT);//10000 integers
		 int quickSortArray3[] = generateRandomArray(MAXINT);//100000 integers

		 double SD1 = standardDeviation();
		 double SD2 = standardDeviation();
		 double SD3 = standardDeviation();
		 double SD4 = standardDeviation();
		
		 for (int i = 0; i < 50; i++) { // loops 50 times before stopping
			 SortInt.quickSort(quickSortArray, 0, MININT-1); 
			 SortInt.quickSort(quickSortArray1, 0, SECONDINT-1); 
			 SortInt.quickSort(quickSortArray2, 0, THIRDINT-1); 
			 SortInt.quickSort(quickSortArray3, 0, MAXINT-1); 
			 
		final long quickSortStart = System.nanoTime();
				
		final long quickSortDuration = System.nanoTime() - quickSortStart;
				System.out.println("\nThe quick sort took " + quickSortDuration + " nanoseconds or " + quickSortDuration/1e9 + " seconds." );		
	        }
		 
		 System.out.format("Standard Deviation for 100 ints = %.6f", SD1);
		 System.out.println("\n");
		 System.out.format("Standard Deviation2 for 1000 ints = %.6f", SD2);
		 System.out.println("\n");
		 System.out.format("Standard Deviation3 for 10000 ints= %.6f", SD3);
		 System.out.println("\n");
		 System.out.format("Standard Deviation4 for 100000 ints = %.6f", SD4);
		 
		 long endTime   = System.nanoTime();
		 long totalTime = endTime - startTime;
		 
		 long meanTime = totalTime/4;
		 
		 System.out.println("\nThe total time is: " +totalTime + " or " + totalTime/1e9 +" seconds") ;
		 System.out.println("\nThe mean time is: " +meanTime  + " or " + meanTime/1e9 +" seconds") ;
	 }
	
	 
	 static void ShellsortSolution() {
		 long startTime = System.nanoTime();
		 int shellSortArray[] = generateRandomArray(MININT);//100 integers
		 int shellSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
		 int shellSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
		 int shellSortArray4[] = generateRandomArray(MAXINT);//100000 integers
		 
		 double SD1 = standardDeviation2();
		 double SD2 = standardDeviation2();
		 double SD3 = standardDeviation2();
		 double SD4 = standardDeviation2();
		 
		 for (int i = 0; i < 50; i++) { // loops 50 times before stopping
			 SortInt.shellSort(shellSortArray); 
			 SortInt.shellSort(shellSortArray2); 
			 SortInt.shellSort(shellSortArray3); 
			 SortInt.shellSort(shellSortArray4); 
			 
		final long shellSortStart = System.nanoTime();
				
		final long shellSortDuration = System.nanoTime() - shellSortStart;
				System.out.println("\nThe shellsort took " + shellSortDuration + " nanoseconds or " + shellSortDuration/1e9 + " seconds." );		
	        }
		 
		 System.out.format("Standard Deviation for 100 ints = %.6f", SD1);
		 System.out.println("\n");
		 System.out.format("Standard Deviation2 for 1000 ints = %.6f", SD2);
		 System.out.println("\n");
		 System.out.format("Standard Deviation3 for 10000 ints= %.6f", SD3);
		 System.out.println("\n");
		 System.out.format("Standard Deviation4 for 100000 ints = %.6f", SD4);
		 
		 long endTime   = System.nanoTime();
		 long totalTime = endTime - startTime;
		 
		 long meanTime = totalTime/4;
		 
		 System.out.println("\nThe total time is: " +totalTime + " or " + totalTime/1e9 +" seconds") ;
		 System.out.println("\nThe mean time is: " +meanTime  + " or " + meanTime/1e9 +" seconds") ;
	 }
	 //insertionSort
	 static void InsertionsortSolution() {
		 long startTime = System.nanoTime();
		 int insertionSortArray[] = generateRandomArray(MININT);//100 integers
		 int insertionSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
		 int insertionSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
		 int insertionSortArray4[] = generateRandomArray(MAXINT);//100000 integers
		 
		 double SD1 = standardDeviation4();
		 double SD2 = standardDeviation4();
		 double SD3 = standardDeviation4();
		 double SD4 = standardDeviation4();
		 
		 for (int i = 0; i < 50; i++) { // loops 50 times before stopping
			 SortInt.SelectionSort(insertionSortArray); 
			 SortInt.SelectionSort(insertionSortArray2); 
			 SortInt.SelectionSort(insertionSortArray3); 
			 SortInt.SelectionSort(insertionSortArray4); 
			 
		final long insertionSortStart = System.nanoTime();
				
		final long insertionSortDuration = System.nanoTime() - insertionSortStart;
				System.out.println("\nThe insertionSort took " + insertionSortDuration + " nanoseconds or " + insertionSortDuration/1e9 + " seconds." );		
	        }
		 
		 System.out.format("Standard Deviation for 100 ints = %.6f", SD1);
		 System.out.println("\n");
		 System.out.format("Standard Deviation2 for 1000 ints = %.6f", SD2);
		 System.out.println("\n");
		 System.out.format("Standard Deviation3 for 10000 ints= %.6f", SD3);
		 System.out.println("\n");
		 System.out.format("Standard Deviation4 for 100000 ints = %.6f", SD4);
		 
		 long endTime   = System.nanoTime();
		 long totalTime = endTime - startTime;
		 
		 long meanTime = totalTime/4;
		 
		 System.out.println("\nThe total time is: " +totalTime + " or " + totalTime/1e9 +" seconds") ;
		 System.out.println("\nThe mean time is: " +meanTime  + " or " + meanTime/1e9 +" seconds") ;
	 }
	 
	//SelectionSort
		 static void SelectionsortSolution() {
			 long startTime = System.nanoTime();
			 int selectionSortArray[] = generateRandomArray(MININT);//100 integers
			 int selectionSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
			 int selectionSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
			 int selectionSortArray4[] = generateRandomArray(MAXINT);//100000 integers
			 
			 double SD1 = standardDeviation3();
			 double SD2 = standardDeviation3();
			 double SD3 = standardDeviation3();
			 double SD4 = standardDeviation3();
			 
			 for (int i = 0; i < 50; i++) { // loops 50 times before stopping
				 SortInt.SelectionSort(selectionSortArray); 
				 SortInt.SelectionSort(selectionSortArray2); 
				 SortInt.SelectionSort(selectionSortArray3); 
				 SortInt.SelectionSort(selectionSortArray4); 
				 
			final long selectionSortStart = System.nanoTime();
					
			final long selectionSortDuration = System.nanoTime() - selectionSortStart;
					System.out.println("\nThe SelectionSort took " + selectionSortDuration + " nanoseconds or " + selectionSortDuration/1e9 + " seconds." );		
		        }
			 
			 System.out.format("Standard Deviation for 100 ints = %.6f", SD1);
			 System.out.println("\n");
			 System.out.format("Standard Deviation2 for 1000 ints = %.6f", SD2);
			 System.out.println("\n");
			 System.out.format("Standard Deviation3 for 10000 ints= %.6f", SD3);
			 System.out.println("\n");
			 System.out.format("Standard Deviation4 for 100000 ints = %.6f", SD4);
			 
			 long endTime   = System.nanoTime();
			 long totalTime = endTime - startTime;
			 
			 long meanTime = totalTime/4;
			 
			 long minutes = totalTime / (60 * 1000);
			long seconds = (totalTime / 1000) % 60;
			 String str = String.format("%d:%02d", minutes, seconds);
			 System.out.println("\nThe Total Time is: "+ str) ;
			 
			 System.out.println("\nThe total time is: " +totalTime + " or " + totalTime/1e9 +" seconds") ;
			 System.out.println("\nThe mean time is: " +meanTime  + " or " + meanTime/1e9 +" seconds") ;
		 }
	 //shellsort
	 public static double standardDeviation2() {
		 int total = 0;
		//shellsort
			int shellSortArray[] = generateRandomArray(MININT);//100 integers
			int shellSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
			int shellSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
			int shellSortArray4[] = generateRandomArray(MAXINT);//100000 integers
			
		
			 
			 //shellsort
			 for(int i = 0; i < shellSortArray.length; i++){
				    total += shellSortArray[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < shellSortArray2.length; i++){
				    total += shellSortArray2[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < shellSortArray3.length; i++){
				    total += shellSortArray3[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < shellSortArray4.length; i++){
				    total += shellSortArray4[i]; // this is the calculation for summing up all the values
				 }
			 
			 
			 //Shellshort 
			 double mean5 = total / shellSortArray.length;
			 double mean6 = total / shellSortArray2.length;
			 double mean7 = total / shellSortArray3.length;
			 double mean8 = total / shellSortArray4.length;
			 
			 
			 
			 //shell sort
			 for(int i = 0; i < shellSortArray.length; i++){
				 shellSortArray[i] = (int) Math.pow((shellSortArray[i]-mean5),2);
				}
			 for(int i = 0; i < shellSortArray2.length; i++){
				 shellSortArray2[i] = (int) Math.pow((shellSortArray2[i]-mean6),2);
				}
			 for(int i = 0; i < shellSortArray3.length; i++){
				 shellSortArray3[i] = (int) Math.pow((shellSortArray3[i]-mean7),2);
				}
			 for(int i = 0; i < shellSortArray4.length; i++){
				 shellSortArray4[i] = (int) Math.pow((shellSortArray4[i]-mean8),2);
				}
			 return total;
	 }
	 //quicksort
	 public static double standardDeviation() 
	 {
		 	int quickSortArray[] = generateRandomArray(MININT);
			int quickSortArray1[] = generateRandomArray(SECONDINT);
			int quickSortArray2[] = generateRandomArray(THIRDINT);
			int quickSortArray3[] = generateRandomArray(MAXINT);
			
			
		 int total = 0;
		
		 //quicksort calculation
		 for(int i = 0; i < quickSortArray.length; i++){
		    total += quickSortArray[i]; // this is the calculation for summing up all the values
		 }

		 for(int i = 0; i < quickSortArray1.length; i++){
			    total += quickSortArray1[i]; // this is the calculation for summing up all the values
			 }
		 
		 for(int i = 0; i < quickSortArray2.length; i++){
			    total += quickSortArray2[i]; // this is the calculation for summing up all the values
			 }
		 
		 for(int i = 0; i < quickSortArray3.length; i++){
			    total += quickSortArray3[i]; // this is the calculation for summing up all the values
			 }
		 
		 double mean = total / quickSortArray.length;
		 double mean2 = total / quickSortArray1.length;
		 double mean3 = total / quickSortArray2.length;
		 double mean4 = total / quickSortArray3.length;
		 
		 System.out.println("The mean for Quicksort is: " + mean);
		 
		 for(int i = 0; i < quickSortArray.length; i++){
			 quickSortArray[i] = (int) Math.pow((quickSortArray[i]-mean),2);
			}
		 for(int i = 0; i < quickSortArray1.length; i++){
			 quickSortArray1[i] = (int) Math.pow((quickSortArray1[i]-mean2),2);
			}
		 for(int i = 0; i < quickSortArray2.length; i++){
			 quickSortArray2[i] = (int) Math.pow((quickSortArray2[i]-mean3),2);
			}
		 for(int i = 0; i < quickSortArray3.length; i++){
			 quickSortArray3[i] = (int) Math.pow((quickSortArray3[i]-mean4),2);
			}
		 
		
return total;
		 
	 }
	 
	 public static double standardDeviation3() {
		 int total = 0;
		//selectionsort
			int selectionSortArray[] = generateRandomArray(MININT);//100 integers
			int selectionSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
			int selectionSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
			int selectionSortArray4[] = generateRandomArray(MAXINT);//100000 integers
			
		
			 
			 //selectionsort
			 for(int i = 0; i < selectionSortArray.length; i++){
				    total += selectionSortArray[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < selectionSortArray2.length; i++){
				    total += selectionSortArray2[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < selectionSortArray3.length; i++){
				    total += selectionSortArray3[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < selectionSortArray4.length; i++){
				    total += selectionSortArray4[i]; // this is the calculation for summing up all the values
				 }
			 
			 
			 //selectionsort 
			 double mean9 = total / selectionSortArray.length;
			 double mean10 = total / selectionSortArray2.length;
			 double mean11 = total / selectionSortArray3.length;
			 double mean12 = total / selectionSortArray4.length;
			 
			 
			 
			 //selectionsort
			 for(int i = 0; i < selectionSortArray.length; i++){
				 selectionSortArray[i] = (int) Math.pow((selectionSortArray[i]-mean9),2);
				}
			 for(int i = 0; i < selectionSortArray2.length; i++){
				 selectionSortArray2[i] = (int) Math.pow((selectionSortArray2[i]-mean10),2);
				}
			 for(int i = 0; i < selectionSortArray3.length; i++){
				 selectionSortArray3[i] = (int) Math.pow((selectionSortArray3[i]-mean11),2);
				}
			 for(int i = 0; i < selectionSortArray4.length; i++){
				 selectionSortArray4[i] = (int) Math.pow((selectionSortArray4[i]-mean12),2);
				}
			 return total;
	 }
	 //insertionSort
	 public static double standardDeviation4() {
		 int total = 0;
		//insertionSort
			int insertionSortArray[] = generateRandomArray(MININT);//100 integers
			int insertionSortArray2[] = generateRandomArray(SECONDINT);//1000 integers
			int insertionSortArray3[] = generateRandomArray(THIRDINT);//10000 integers
			int insertionSortArray4[] = generateRandomArray(MAXINT);//100000 integers
			
		
			 
			 for(int i = 0; i < insertionSortArray.length; i++){
				    total += insertionSortArray[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < insertionSortArray2.length; i++){
				    total += insertionSortArray2[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < insertionSortArray3.length; i++){
				    total += insertionSortArray3[i]; // this is the calculation for summing up all the values
				 }
			 for(int i = 0; i < insertionSortArray4.length; i++){
				    total += insertionSortArray4[i]; // this is the calculation for summing up all the values
				 }
			 
			 
			 double mean13 = total / insertionSortArray.length;
			 double mean14 = total / insertionSortArray2.length;
			 double mean15 = total / insertionSortArray3.length;
			 double mean16 = total / insertionSortArray4.length;
			 
			 
			 
			 for(int i = 0; i < insertionSortArray.length; i++){
				 insertionSortArray[i] = (int) Math.pow((insertionSortArray[i]-mean13),2);
				}
			 for(int i = 0; i < insertionSortArray2.length; i++){
				 insertionSortArray2[i] = (int) Math.pow((insertionSortArray2[i]-mean14),2);
				}
			 for(int i = 0; i < insertionSortArray3.length; i++){
				 insertionSortArray3[i] = (int) Math.pow((insertionSortArray3[i]-mean15),2);
				}
			 for(int i = 0; i < insertionSortArray4.length; i++){
				 insertionSortArray4[i] = (int) Math.pow((insertionSortArray4[i]-mean16),2);
				}
			 return total;
	 }
}
		 
		 
		 
		 

