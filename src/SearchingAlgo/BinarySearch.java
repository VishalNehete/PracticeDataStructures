package SearchingAlgo;

//Prerequisite: The array should be already sorted
//Divide the array from middle and search on either part depending on the value is smaller(left) or greater(right)
//This has time complexity of O(log n)
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,5,6,8,10,14};
        int valueToSearch = 10;

        //Pointers to perform operations on sub array after dividing main array
        int left=0,right= arr.length-1;
        System.out.println("Index of "+valueToSearch+" using recursion is at index: "+BinarySearchWithRecussion(arr,valueToSearch,left,right));

        System.out.println("Index of "+valueToSearch+" without using recursion is at index: "+BinarySearchWithoutRecussion(arr,valueToSearch));
    }



    public static int BinarySearchWithRecussion(int arr[],int valueToSearch,int left,int right){

        //if right pointer exceeds left, this means iteration over entire array is finished but element not found so return -1
        if(right<left)
            return -1;

        //Divide the length of array and get the middle of array
        int middle;
        middle  =(left+right)/2;

        //if found at middle then return middle index (This is heart of program, all the iteration will end up here,after keeping on dividing array
        // and ultimately return index the middle of sub-array(if element found)
        if(arr[middle] == valueToSearch)
            return middle;

        //if the element is less than the middle element then, we can discard the right array as the element will be found on left only as the array is already sorted
        if(valueToSearch < arr[middle]){
            right=middle-1;
            return BinarySearchWithRecussion(arr,valueToSearch,left,right);
        }
        //if the element is greater than the middle element then, we can discard the left array as the element will be found on right only as the array is already sorted
        else{
            left=middle+1;
            return BinarySearchWithRecussion(arr,valueToSearch,left,right);
        }


    }

    private static int BinarySearchWithoutRecussion(int[] arr, int valueToSearch) {
        //Pointers to perform operations on sub array after dividing main array
        int left=0,right=arr.length-1;
        int middle=0;

        while(left<=right){
            middle=(left+right)/2;

            if(arr[middle] == valueToSearch)
                return middle;

            if(valueToSearch < arr[middle]){
                right=middle-1;
            }
            else {
                left=middle+1;
            }

        }
        return -1;


    }





}
