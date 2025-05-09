 package org.example;
public class Searching {
    public static void main(String[] args) {
        int[] num = {1,3,5,7,9,11,89};
        int target = 89;

        int result = linearSearch(num , target);
        int result1 = binarySearch(num , target);
        int result2 = rec(num , target , 0, num.length -1 );

        if ( result != -1){
            System.out.println("Number is found at : "+ result);
        }
        else{
            System.out.println("Number is not found");
        }

        if ( result1 != -1){
            System.out.println("Number is found at : "+ result1);
        }
        else{
            System.out.println("Number is not found");
        }

        if ( result2 != -1){
            System.out.println("Number is found at : "+ result2);
        }
        else{
            System.out.println("Number is not found");
        }
    }

    public static int linearSearch(int[] arr , int no){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == no){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr , int no){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == no){
                return mid;
            }
            else if(arr[mid] < no){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;

    }

    public static int rec(int[] arr , int no , int start , int end){
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == no){
                return mid;
            }
            else if(arr[mid] < no){
                return rec(arr , no , mid + 1 , end);
            }
            else{
                return rec(arr , no , start , mid -1);
            }
        }
        return -1;


    }
}