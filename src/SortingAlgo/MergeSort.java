package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 7, 2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr){
        //base condition
        if(arr.length<2){
            return;
        }

        //code to divide the array from middle
        int middle = arr.length/2;
        //array to hold left side of array after division
        int left[] = new int[middle];
        //array to hold right side of array after division
        int right[] = new int[arr.length-middle];

        //assign the elements from left part of main array to left array
        for(int i=0;i<middle;i++){
            left[i]=arr[i];
        }

        //assign the elements from right part of main array to right array
        for(int i=middle;i< arr.length;i++){
            right[i-middle]=arr[i];    //i-middle will give-->,0,1,2,3....
        }

        //now calling the same function with left and right as main array
        mergeSort(left);
        mergeSort(right);

        //at this stage we will get all the elements of array in different arrays

        //merge all the arrays
        merge(left,right,arr);


    }

    public static void merge(int[] left,int[] right,int[] arr){
        //3 pointers for 3 arrays
        int i=0,j=0,k=0;

        //iterate over left and right arrays to compare there elements
        //break if any of the array finishes earlier
        while(i<left.length && j<right.length){

            //if left is lesser than insert it in main array and increment the left and main array pointers
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            //if right is lesser than insert it in main array and increment the right and main array pointers
            else {
                arr[k++]=right[j++];
            }
        }

        //if the left array finishes earlier, then add all the remaining elements from right array to main array
        while (j<right.length){
            arr[k++]=right[j++];
        }
        //if the right array finishes earlier, then add all the remaining elements from left array to main array
        while (i<left.length){
            arr[k++]=left[i++];
        }

    }
}
