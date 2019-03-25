
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search

import java.util.Arrays;
import java.util.Scanner;

public class Sort { // NOTE: classname does not match filename, compilation error

	// NOTE: Indentation in this file is bad.
	//       This makes it hard to read for anyone other then you.
	
		public static void main(String args[]) {
		      Scanner s = new Scanner(System.in);
		      System.out.println("Enter the length of the array:");
		      int length = s.nextInt();
		   int [] myArray = new int[length];
		      System.out.println("Enter the elements of the array:");

		      for(int i=0; i<length; i++ ) {
		         myArray[i] = s.nextInt();
		      }
              System.out.println(Arrays.toString(myArray));
              int[] t = bubbleSort(myArray);
             printIntArray( t );
             
              System.out.println("Enter the Element of the array to search:");
              int x = s.nextInt();
              int l= 0;
              int r =length-1;
              int result =binarySearch(myArray, l, r, x);
              if (result == -1) 
                  System.out.println("Element not present"); 
              else
                  System.out.println("Element found at index " + result);
		   }
	   public static int[] bubbleSort(int myArray[]) { 
		   int n = myArray.length; 
		   for (int i = 0; i < n-1; i++) {
			   for (int j = 0; j < n-i-1; j++) {
				   if (myArray[j] > myArray[j+1]) { 
					   	// swap
					    int temp = myArray[j]; 
					    myArray[j] = myArray[j+1]; 
					    myArray[j+1] = temp; 
				   }
			   }
		   }
		   
		   return myArray;
	   }
	   
		// NOTE: the result of the method is confusing
		// If the input is [1, 2, 2, 3, 4] and i will search for 2 - i get 2 as an index.
		// If the input is [1, 2, 2, 2, 2] and i will search for 2 - i get 2 as an index.
		// -> something is strange here, please check that
	   public static int binarySearch(int myArray[], int l, int r, int x) {  
		   
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present at the 
	            // middle itself 
	            if (myArray[mid] == x) 
	                return mid; 
	  
	            // If element is smaller than mid, then 
	            // it can only be present in left subarray 
	            if (myArray[mid] > x) 
	                return binarySearch(myArray, l, mid - 1, x); 
	  
	            // Else the element can only be present 
	            // in right subarray 
	            return binarySearch(myArray, mid + 1, r, x); 
	        } 
	  
	        // We reach here when element is not present 
	        // in array 
	        return -1; 
	    }
	  
	  public static void printIntArray( int[] a ) {
		  System.out.print( "[" );
		  for( int i = 0; i < a.length; ++i ) {
			  System.out.print( a[i] );
			  
			  if( i < a.length - 1 ) {
				  System.out.print( ", " );
			  }
		  } 
		  System.out.println( "]" );
	  }
	      
}
		
