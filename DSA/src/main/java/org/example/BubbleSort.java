package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] num = {1, 56, 111, 23, 356, 90};
        int size = num.length;
        int[] num1 = Arrays.copyOf(num,size);


        System.out.println("Array Before Sorting in Ascending Order ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }
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

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (num1[j] < num1[j + 1]) {
                    int temp = num1[j];
                    num1[j] = num1[j + 1];
                    num1[j + 1] = temp;
                }

            }
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
