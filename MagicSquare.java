//Bonus 2D Arrayspublic class MagicSquare {

	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
import java.util.Scanner;

public class MagicSquare {

	// NOTE: Indentation in this file is bad.
	//       This makes it hard to read for anyone other then you.

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Input total row : ");
	    	int row = sc.nextInt();
	    	System.out.print("Input total column : ");
	    	int column = sc.nextInt();

	    	int [][] matrix = new int[row][column];
	    	for (int i = 0; i < row; i++){
	    			for(int j = 0; j < column; j++) {
	    	    	
	    	        System.out.println("Row ["+i+"]:  Column "+j+" :");
	    	        matrix[i][j] = sc.nextInt(); 
	    			}}
	    	       
	    	        if (isMagicSquare(matrix)) 
	    		    System.out.println("Magic Square"); 
	    	        else
	    		    System.out.println("Not a magic" + 
	    		                                    " Square"); 
	    	    } 
	    	        
	    	/*{{ 2, 7, 6 }, 
              { 9, 5, 1 }, 
              { 4, 3, 8 }};
Test matrix to check whether matrix is magic square*/ 
	   
	    	
	
	    static boolean isMagicSquare(int matrix[][]) { 
	          
	        // calculate the sum of 
	        // the prime diagonal 
	        int sum = 0; 
	        for (int i = 0; i < matrix.length; i++) // NOTE: not using brackets here is formally correct, but it's better to add them
	            sum = sum + matrix[i][i]; 			// NOTE: you only checked one diagonal (top-left to bottom-right)
	  
	        // For sums of Rows 
	        for (int i = 0; i < matrix.length; i++) { 
	  
	            	int rowSum = 0; 
	            	for (int j = 0; j < matrix.length; j++) 
	                rowSum += matrix[i][j]; 
	  
	            // check if every row sum is 
	            // equal to prime diagonal sum 
	            	if (rowSum != sum) 
	                return false; 
	        			} 
	  
	        // For sums of Columns 
	        		for (int i = 0; i < matrix.length; i++) { 
	  
	        				int colSum = 0; 
	        				for (int j = 0; j < matrix.length; j++) 
	        				colSum += matrix[j][i]; 
	  
	            // check if every column sum is 
	            // equal to prime diagonal sum 
	        				if (sum != colSum) 
	        				return false; 
	        } 
	  
	        				return true; 
	    } 
	  
	 
	  
	}

