//2D Arrays

	
	//Todo: Each 2D Array can be treated like a matrix.
	//Write a method which takes two matrices as input and returns the result.
	//Write a main-method where you call your created method for matrix multiplication
	//and print the result properly
import java.util.Scanner;

public class MatMul { // NOTE: classname does not match filename, compilation error

	// NOTE: Indentation in this file is bad.
	//       This makes it hard to read for anyone other then you.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.print("Input total Matrix 1 row : ");
    	int row1 = sc.nextInt();
    	System.out.print("Input total Matrix 1 column : ");
    	int column1 = sc.nextInt();
    	System.out.print("Input total Matrix 2 row : ");
    	int row2 = sc.nextInt();
    	System.out.print("Input total Matrix 2 column : ");
    	int column2 = sc.nextInt();
    	
    	if (column1==row2) {
    	int [][] matrix1 = new int[row1][column1];
    	for (int i = 0; i < row1; i++){
    			for(int j = 0; j < column1; j++) {
    	    	
    	        System.out.println("Row 1 ["+i+"]:  Column 2 "+j+" :");
    	        matrix1[i][j] = sc.nextInt(); 
    			}
    	}
    	
    	

    	int [][] matrix2 = new int[row2][column2];
    	for (int i = 0; i < row2; i++){
    			for(int j = 0; j < column2; j++) {
    	    	
    	        System.out.println("Row 2 ["+i+"]:  Column 2 "+j+" :");
    	        matrix2[i][j] = sc.nextInt();
    	        
    	        int[][] result=Multi(matrix1, matrix2, row1, column2);
    	        displayProduct(result); // NOTE: This output is confusing
    	        
    	}		
    }
 }
    	 else {
    		System.out.println("Matrix Dimesions are not correct");
    	}
    	
		// NOTE: the output of the calculation is not correct
		//       e.g. given the input:
		//       [1, 2, 3] * [1, 2  
		//                    3, 4
		//                    5, 6]
		//
		//       ... your result is [1, 2], but it should be:
		//
		//       [22, 28]
    	
	}
	public static int[][] Multi(int[][] matrix1, int[][] matrix2,int row1,int column2){
		 int[][] result = new int[row1][column2];
	        for(int i = 0; i < row1; i++) {
	            for (int j = 0; j < column2; j++) {
	                for (int k = 0; k < row1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        return result;
	    }
	public static void displayProduct(int[][] result) {
        System.out.println("Product of two matrices is: ");
        for(int[] row1 : result) {
            for (int column2 : row1) {
                System.out.print(column2 + "    ");
            }
            System.out.println();
        }
	
	}
}	

