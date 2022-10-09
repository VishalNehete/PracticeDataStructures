package SearchingAlgo;
/* #Algorithm:
//Prerequisite: The array should be already sorted
* Divide the main array in sqrt(n) blocks.
* Compare element at extreme right of these blocks.
* If the value is greater then, move ahead and compare next block element.
* Else if the element is lesser then,do a linear search in that block of array and get the index of element you are searching for.

*/
//This algorithm has time complexity of O(sqrt n)
public class JumpSearch {

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 10, 14,16,18,21};
        int valueToSearch = 21;
        System.out.println("Index of " + valueToSearch + " is at index: " + JumpSearch(arr,valueToSearch));

    }


    public static int JumpSearch(int arr[],int valueToSearch){
        //Get the block size
        int blockSize = (int) Math.sqrt(arr.length-1);

        //initialize start and last pointers
        int start=0,last=blockSize-1;

        //iterate till last is less then valueToSearch and start is less then arr.length
        while (arr[last]<valueToSearch && start < arr.length){
            //if not found in this block then move to next block
            start=last+1;
            last=last+blockSize;

            //To handle the extra blocks if the given arr.length is not a perfect square
            if(last>arr.length-1)
                last=arr.length-1;
        }

        //Using above while loop you have reached till the block where element is present,
        // Now using Linear search find that element index
        for(int i=start;i<=last;i++){
            if(arr[i]==valueToSearch)
                return i;
        }
        //if not found then return -1
        return -1;

    }



}
