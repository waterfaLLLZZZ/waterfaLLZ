module Main3 {
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
	        int n=10;
	        int matrix[][]=new int [n][n];
	        for (int i=0;i<n;i++) {
	            for (int j = 0; j < n; j++) {
	                matrix[i][j]=(int) (2-Math.random()*4);
	            }
	        }
	        printMatrix(matrix);
	        int []b=new int[n];
	        for (int j = 0; j < n; j++) {

	            int sum=0;
	            for (int i=0;i<n;i++) {
	               if (matrix[i][j]>0) sum+=matrix[i][j];
	            }
	            b[j]=sum;
	        }
	        printArray(b);
	    }
	}
}