//Дан двумерный массив А, размером (n*n). 
//Найти произведение отрицательных элементов параллели побочной диагонали, расположенной над диагональю.

module Main4 {
	package com.company;

	public class Main {
	    private   static  void printMatrix(int[][]matrix){
	        for (int i=0;i<matrix[0].length;i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j]+" ");
	            }
	            System.out.println();
	        }
	    }
	    private  static  void  printArray(int[]array){
	        for (int i=0;i< array.length;i++){
	            System.out.println(array[i]);
	        }
	    }
	    public static void main(String[] args) {
	        int n=5;
	        int matrix[][]=new int [n][n];
	        for (int i=0;i<n;i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j]=(int) (5-Math.random()*10);
	            }
	        }
	        printMatrix(matrix);
	        System.out.println();
	        int product=1;
	        for(int i=n-2;i>=0;i--){
	            for(int j=0;j<n-1;j++){
	                if (n-2-i==j) {
	                    if (matrix[i][j]<0) product*=matrix[i][j];
	                }
	            }
	        }
	        System.out.println(product);
	    }
	}
}