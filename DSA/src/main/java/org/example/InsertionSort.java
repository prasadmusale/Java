package org.example;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] num = {1, 56, 111, 23, 356, 90};
        int size = num.length;
        int[] num1 = Arrays.copyOf(num,size);


        System.out.println("Array Before Sorting in Ascending Order ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        for(int i=1 ; i<size ; i++){
            int j = i-1;
            int key = num[i];
            while(j>=0 && num[j] > key ){
                num[j+1] = num[j];
                j--;
            }
            num[j+1] = key;


            for (int n : num) {
                System.out.print(n + " ");
            }
            System.out.println();



        }
        System.out.println();
        System.out.println("Array after sorting in Ascending Order ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("Array Before Sorting in Descending Order ");
        for (int n : num1) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        for(int i=1 ; i<size ; i++){
            int j = i-1;
            int key = num1[i];
            while(j>=0 && num1[j] < key ){
                num1[j+1] = num1[j];
                j--;
            }
            num1[j+1] = key;

            for (int n : num1) {
                System.out.print(n + " ");
            }
            System.out.println();



        }
        System.out.println();
        System.out.println("Array after sorting in Descending Order ");
        for (int n : num1) {
            System.out.print(n + " ");
        }
    }
}
