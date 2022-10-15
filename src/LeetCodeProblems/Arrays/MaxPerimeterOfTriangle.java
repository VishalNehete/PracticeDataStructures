package LeetCodeProblems.Arrays;

import java.util.Arrays;

//Question: 976
public class MaxPerimeterOfTriangle {
    public static void main(String[] args) {
        int arr[]={2,1,1,6,8};

        System.out.println("Maximum perimeter triangle that can be formed is: "+getMaxPerimeter(arr));
    }

    private static int getMaxPerimeter(int[] arr) {

        //Sort the array to get the max elements at last of the array
        Arrays.sort(arr);

        //Iterate from last till 3rd element of array with condition (a+b)>c
        // If satisfied return sum of those 3 elements
        for(int i= arr.length-3;i>0;i--){
            if((arr[i]+arr[i+1]) > arr[i+2]){
                return arr[i]+arr[i+1] + arr[i+2];
            }
        }
        return 0;
    }
}
