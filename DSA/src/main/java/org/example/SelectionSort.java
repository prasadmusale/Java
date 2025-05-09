package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] num = {1, 56, 8, 23, 19, 0};
        int size = num.length;
        int[] num1 = Arrays.copyOf(num,size);


        System.out.println("Array Before Sorting in Ascending Order ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        for(int i=0 ; i<size-1 ; i++){
            int minIndex = i;
            for(int j=i+1 ; j<size ; j++){
                if (num[j] < num[minIndex]){
                    minIndex = j;
                }
            }
            int temp = num[i];
            num[i] = num[minIndex];
            num[minIndex] = temp;

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

        for(int i=0 ; i<size-1 ; i++){
            int maxIndex = i;
            for(int j=i+1 ; j<size ; j++){
                if (num1[j] > num1[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = num1[i];
            num1[i] = num1[maxIndex];
            num1[maxIndex] = temp;
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
