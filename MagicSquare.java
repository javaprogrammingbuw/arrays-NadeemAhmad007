//Bonus 2D Arrayspublic class MagicSquare {

	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
import java.util.Scanner;

public class MagicSquare {


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
	          
	    	 int n = sumOfRow(matrix[0]);
	         
	         for (int[] row : matrix)
	         {
	            int sum = sumOfRow(row);        
	            if (sum != n)
	            return false;   
	         }
	         int sum = 0;
	          
	         //rows
	        for (int i = 0; i < matrix.length; i++){
	            sum = 0;
	            for (int j = 0; j < matrix.length; j++){
	                sum += matrix[i][j];
	            }
	            if(sum != n){
	               return false;
	            }
	        }
	         // columns
	         
	         for(int i =0; i < matrix.length; i++){
	             sum = 0;
	              
	             for(int j = 0; j< matrix.length; j++){
	                 sum += matrix[j][i];
	             }
	             if(sum != n){
	                 return false;
	             }
	         }
	         //diagonal from top left corner to bottom right corner
	         sum = 0;
	         for (int i = 0; i < matrix.length; i++)
	         {
	            sum += matrix[i][i];
	         }
	         if (sum != n)
	            return false;
	             
	         sum = 0;
	         // top right to bottom left diagonal
	         for (int i = 0; i < matrix.length; i++)
	         {
	            sum += matrix[i][matrix.length - 1 - i];
	         }
	         if (sum != n)
	            return false;
	         return true;
	          
	      } 
	      
	     //returns the sum of the elements in the row
	     private static int sumOfRow(int[] row){
	        int sum = 0;
	        for(int el : row){
	           sum += el;
	        }
	        return sum;
	     }
	     
}
