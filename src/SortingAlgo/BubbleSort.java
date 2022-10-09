package SortingAlgo;

import java.util.Arrays;

//Motive: Get the largest element from the array and place it at end of array, iterate like this till you get the sorted array
public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,5,1,7,2};
        int temp;

        //to iterate over passes
        for(int i=0;i<arr.length;i++){

            //to iterate inside passes
            for (int j=1;j<arr.length-i;j++){
                //arr.length is to avoid comparing the already sorted part of array at the end

                //swap the number if it is greater than left element
                if(arr[j] < arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
