module Main2 {
	package com.company;

	public class Main {
	    private static int[] sortVector(int[] vector)
	    {
	        boolean flag;
	        int temp;
	        do {
	            flag = false;
	            for (int i = 0; i < vector.length-1 ; i++) {
	                if (vector[i] > vector[i+1])
	                {
	                    temp = vector[i];
	                    vector[i] = vector[i+1];
	                    vector[i+1] = temp;
	                    flag = true;
	                }
	            }
	        } while (flag);
	        return vector;
	    }
	    private   static  void printArray(int[]array){
	        for (int i=0;i< array.length;i++){
	            System.out.println(array[i]);
	        }
	    }
	    public static void main(String[] args) {
	        int n=10;

	        int [] c=new int[n];
	        int countNegative=0;
	        for (int i=0;i<c.length;i++) {
	            c[i]= (int) (50-Math.random()*100);
	        }
	        c[8]=0;
	        printArray(c);
	        System.out.println();
	        for (int i=0;i<c.length;i++){
	            if (c[i]!=0) countNegative++;
	        }
	        int []x=new int[countNegative];
	        for (int i=0,j=0;i<c.length;i++){
	            if (c[i]!=0) {
	                x[j]=c[i];
	                j++;
	            }
	        }
	        x=sortVector(x);
	        printArray(x);
	    }
	}
}