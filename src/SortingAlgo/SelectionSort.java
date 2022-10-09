package SortingAlgo;
import java.util.Arrays;

//Motive: Get the smallest element and place it at beginning, iterate like this till you get the sorted array
public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={3,5,1,7,2};
        int temp;
        int minIndex=0;

        //to iterate over passes
        for(int i=0;i<arr.length;i++){
            //to iterate inside passes
            for(int j=i;j< arr.length;j++){
                //int j=i is to avoid comparing the already sorted part of array at the beginning

                //swap the indices if smaller element is found and place it at beginning
                minIndex=i;
                if(arr[j]<arr[minIndex]){
                    temp=arr[j];
                    arr[j]=arr[minIndex];
                    arr[minIndex]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));


    }




}
