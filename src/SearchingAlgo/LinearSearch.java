package SearchingAlgo;

//Iterate over all the elements in an array and return the index if value is found
//This search has time complexity of O(n)
public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={4,2,7,1,9};
        int valueToSearch=7;
        int index=LinearSearch(arr,valueToSearch);
        System.out.println("Index of "+valueToSearch+" is at index: "+index);

    }
    public static int LinearSearch(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return i;
            }
        }
        return -1;
    }



}
