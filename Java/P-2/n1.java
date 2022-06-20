//Вычислить сколько элементов данного массива больше своего предыдущего элемента.
package com.company;

public class Main {
    public static void main(String[] args) {
        int n=10;
        int [] array=new int[n];
        int count=0;
        for (int i=0;i<array.length;i++) {
            array[i]= (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        int prev=array[0];// предыдущий элемент массива
        for (int i=1;i<array.length;i++){
            if (array[i]>prev) count++;
            prev=array[i];
        }
        System.out.println(count);
    }
}